package com.car;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Car {

	private String make;
//	private String dateOfPurchase;
	private String odometer;
	private String modelName;
	private String year;
	private String description;
	private String Price;
	private String picturePath;
	private String color;
	private String vin;
	private LocalDate dateReceived;
	public boolean isBidable;
	

	public Car() {

	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public void setMake(String make) {
		this.make = make;
	}

//	public void setDateOfPurchase(String dateOfPurchase) {
//		this.dateOfPurchase = dateOfPurchase;
//	}

	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(String price) {
		this.Price = price;
	}

	public String getMake() {
		return this.make;
	}

//	public String getDateOfPurchase() {
//		return this.dateOfPurchase;
//	}

	public String getOdometer() {
		return this.odometer;
	}

	public String getModelName() {
		return this.modelName;
	}

	public String getYear() {
		return this.year;
	}

	public String getDescription() {
		return this.description;
	}

	public String getPrice() {
		return this.Price;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public LocalDate getDateRecieved() {
		return this.dateReceived;
	}
	public void setDateRecieved(LocalDate dateReceived) {
		this.dateReceived = dateReceived;
	}
	
	public boolean getIsBidable() {
		LocalDate today = LocalDate.now();
		long daysBetween = dateReceived.until(today, ChronoUnit.DAYS);
		return(daysBetween >= 120) ? true : false; //ternary operator: advanced if
				
	}
	public boolean newOrUsed() {
		LocalDate today = LocalDate.now();
		int carYear = Integer.parseInt(this.year);
		if(today.getYear()<=carYear) {
			return true;
		}
		else {
			return false;
		}
		
	 //return(this.year.equals(yearToday)) ? true : false;  same as if/else statement
	}
	public String newOrUsedString() {
		return(newOrUsed()) ? "new": "used";
	}

	public String toFile() {
		return make + ";"+ modelName + ";" + year + ";" + odometer + ";" + description 
				+ ";" + Price+ ";" + color + ";"+ vin +";"+ dateReceived + ";" + picturePath;
	}
	//put method for date here
	//public boolean is
}
