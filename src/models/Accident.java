package models;

import java.util.Date;

public class Accident {

	private String locationAccident;
	private Date dateAccident;
	private Involucrated involucratedInAccident;

	public Accident(String locationAccident, Date dateAccident, Involucrated involucratedInAccident) {
		this.locationAccident = locationAccident;
		this.dateAccident = dateAccident;
		this.involucratedInAccident = involucratedInAccident;
	}

	public String getLocationAccident() {
		return locationAccident;
	}

	public void setLocationAccident(String locationAccident) {
		this.locationAccident = locationAccident;
	}

	public Date getDateAccident() {
		return dateAccident;
	}

	public void setDateAccident(Date dateAccident) {
		this.dateAccident = dateAccident;
	}

	public Involucrated getInvolucratedInAccident() {
		return involucratedInAccident;
	}

	public void setInvolucratedInAccident(Involucrated involucratedInAccident) {
		this.involucratedInAccident = involucratedInAccident;
	}

	@Override
	public String toString() {
		return "Accident [locationAccident=" + locationAccident + ", dateAccident=" + dateAccident
				+ ", involucratedInAccident=" + involucratedInAccident + "]";
	}

}
