package ddbb;

import java.sql.ResultSet;
import java.util.ArrayList;

public class FillDB {

	private Conecction test;
	private ResultSet rs;
	
	private ArrayList<String>personList= new ArrayList<>();
	private ArrayList<String>carList= new ArrayList<>();
	private ArrayList<String>accidentList= new ArrayList<>();


	public FillDB(Conecction test, ResultSet rs) {
		this.test = test;
		this.rs = rs;
	}

	public void fillCar() {
		carList=new ArrayList<>();
		int cuantity = aleatoryInteger(5, 15);
		String carLicense="";
		for (int i=0;i<cuantity;i++) {
			carLicense=aleatoryString();
			carList.add(carLicense);
			rs=test.execSQL("insert into Car (Car_License, Car_Model, Car_Year, Insuranced_Person) values ('"
					+ carLicense + "', '" +
					aleatoryString() + "', "+
					aleatoryInteger(1900, 2018) + ", '"+
					
					"')");
			
		}
	}

	public void fillPerson() {
		personList=new ArrayList<>();
		int cuantity = aleatoryInteger(5, 15);
		String personLicense="";
		for (int i=0;i<cuantity;i++) {
			personLicense=aleatoryString();
			personList.add(personLicense);
			rs=test.execSQL("insert into Person (Driver_License, Driver_Name, Driver_Adress) values('"+
					personLicense + "', '" +
					aleatoryString() + "', '"+
					aleatoryString() + " " + aleatoryString()
					+ "')");
			
		}
	}

	public void fillAccident() {
		accidentList=new ArrayList<>();
		int cuantity = aleatoryInteger(5, 15);
		String reportNumber="";
		for (int i=0;i<cuantity;i++) {
			reportNumber= aleatoryString();
			accidentList.add(reportNumber);
			int day=aleatoryInteger(1, 31);
			int month = aleatoryInteger(1, 12);
			int year = aleatoryInteger(1999, 2018);
			String date = year + "-" + month + "-" + day;
			rs=test.execSQL("insert into Accident (Report_Number, Location, Accident_Date) values ('"+
					reportNumber + "', '"+
					aleatoryString() + " " + aleatoryString()+ "', '"+
					date
					+ "')");
		}
	}

	public void fillInvolucrated() {
		int cuantity = aleatoryInteger(5, 15);

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

}
