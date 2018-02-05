package models;

import java.util.ArrayList;

public class Involucrated {

	private ArrayList<Car> car;
	private ArrayList<Person> person;

	public Involucrated(ArrayList<Car> car, ArrayList<Person> person) {
		super();
		this.car = car;
		this.person = person;
	}

	public ArrayList<Car> getCar() {
		return car;
	}

	public void setCar(ArrayList<Car> car) {
		this.car = car;
	}

	public ArrayList<Person> getPerson() {
		return person;
	}

	public void setPerson(ArrayList<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Involucrated [car=" + car + ", person=" + person + "]";
	}
}
