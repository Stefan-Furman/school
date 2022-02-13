package com.itbulls.furman.oop.examples.vehicles;

public class Vehicle {
	private String licensePlate;

	public Vehicle(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public String toString() {
		return "Vehicle [licensePlate=" + licensePlate + "]";
	}
	
}
