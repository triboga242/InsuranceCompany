package ddbb;

import java.sql.ResultSet;
import java.util.ArrayList;

public class FillDB {

	private static Conecction test;
	private static ResultSet rs;

	private static ArrayList<String> personList = new ArrayList<>();
	private static ArrayList<String> carList = new ArrayList<>();
	private static ArrayList<String> accidentList = new ArrayList<>();

	@SuppressWarnings("static-access")
	public FillDB(Conecction test, ResultSet rs) {
		this.test = test;
		this.rs = rs;
	}

	public static void fillCar() {
		System.out.println("Filling cars");
		carList = new ArrayList<>();
		int cuantity = aleatoryInteger(5, 15);
		String carLicense = "";
		for (int i = 0; i < cuantity; i++) {
			carLicense = aleatoryString();
			carList.add(carLicense);
			String model=aleatoryString();
			int year=aleatoryInteger(1900, 2018);
			for (int j = 0; j < aleatoryInteger(0, 3); j++) {
				rs = test.execSQL("insert into Car (Car_License, Car_Model, Car_Year, Insuranced_Person) values ('"
						+ carLicense + "', '" + model + "', " + year + ", '"
						+ personList.get(aleatoryInteger(0, personList.size())) + "')");
			}
		}
		System.out.println("Done");
	}

	public static void fillPerson() {
		System.out.println("Filling people");
		personList = new ArrayList<>();
		int cuantity = aleatoryInteger(5, 15);
		String personLicense = "";
		for (int i = 0; i < cuantity; i++) {
			personLicense = aleatoryString();
			personList.add(personLicense);
			rs = test.execSQL("insert into Person (Driver_License, Driver_Name, Driver_Adress) values('" + personLicense
					+ "', '" + aleatoryString() + "', '" + aleatoryString() + " " + aleatoryString() + "')");
		}
		System.out.println("Done");
	}

	public static void fillAccident() {
		System.out.println("Filling accidents");

		accidentList = new ArrayList<>();
		int cuantity = aleatoryInteger(5, 15);
		String reportNumber = "";
		for (int i = 0; i < cuantity; i++) {
			reportNumber = String.valueOf(aleatoryInteger(1111, 9999999));
			accidentList.add(reportNumber);
			int day = aleatoryInteger(1, 31);
			int month = aleatoryInteger(1, 12);
			int year = aleatoryInteger(1999, 2018);
			String date = year + "-" + month + "-" + day;
			rs = test.execSQL("insert into Accident (Report_Number, Location, Accident_Date) values (" + reportNumber
					+ ", '" + aleatoryString() + " " + aleatoryString() + "', '" + date + "')");
		}
		System.out.println("Done");

	}

	public static void fillInvolucrated() {
		System.out.println("Filling involucrated");

		int cuantity = aleatoryInteger(1, 3);
		for (String s : accidentList) {
			for (int i = 0; i < cuantity; i++) {
				rs = test.execSQL("insert into Involucrated (Report_Number, Car_License, Driver_License) values (" + s
						+ ", '" + carList.get(aleatoryInteger(0, carList.size())) +"', '" + personList.get(aleatoryInteger(0, personList.size())) +"')");
			}
		}
		System.out.println("Done");
	}

	public static String aleatoryString() {

		char[] elements = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		char[] group = new char[8];

		for (int i = 0; i < 8; i++) {
			int element = (int) (Math.random() * 26);
			group[i] = (char) elements[element];
		}
		return new String(group);
	}

	public static int aleatoryInteger(int N, int M) {
		int integerValue = (int) Math.floor(Math.random() * (N - M + 1) + M);

		return integerValue;
	}

	public static void truncateAll() {
		System.out.println("Truncating");
		rs = test.execSQL("TRUNCATE `insuranceCompany`.`Involucrated`;");
		rs = test.execSQL("TRUNCATE `insuranceCompany`.`Accident`;");
		rs = test.execSQL("TRUNCATE `insuranceCompany`.`Car`;");
		rs = test.execSQL("TRUNCATE `insuranceCompany`.`Person`;");
		System.out.println("Done");
	}
	public static void fillAll() {
		fillPerson();
		fillCar();
		fillAccident();
		fillInvolucrated();
	}
}
