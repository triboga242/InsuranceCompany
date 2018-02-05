package models;

import java.util.Date;

public class Car {
	private String carLicense;
	private String carModel;
	private Date carYear;

	public Car(String carLicense, String carModel, Date carYear) {
		super();
		this.carLicense = carLicense;
		this.carModel = carModel;
		this.carYear = carYear;
	}

	public String getCarLicense() {
		return carLicense;
	}

	public void setCarLicense(String carLicense) {
		this.carLicense = carLicense;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Date getCarYear() {
		return carYear;
	}

	public void setCarYear(Date carYear) {
		this.carYear = carYear;
	}

	@Override
	public String toString() {
		return "Car [carLicense=" + carLicense + ", carModel=" + carModel + ", carYear=" + carYear + "]";
	}

}
