package models;

public class Person {

	private String driverLicense;
	private String driverName;
	private String driverAdress;

	public Person(String driverLicense, String driverName, String driverAdress) {
		super();
		this.driverLicense = driverLicense;
		this.driverName = driverName;
		this.driverAdress = driverAdress;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverAdress() {
		return driverAdress;
	}

	public void setDriverAdress(String driverAdress) {
		this.driverAdress = driverAdress;
	}

	@Override
	public String toString() {
		return "Person [driverLicense=" + driverLicense + ", driverName=" + driverName + ", driverAdress="
				+ driverAdress + "]";
	}
}
