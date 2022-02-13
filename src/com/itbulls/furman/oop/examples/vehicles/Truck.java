package com.itbulls.furman.oop.examples.vehicles;

public class Truck extends Vehicle{
	private double maxTon;

	public Truck(String licensePlate, double maxTon) {
		super(licensePlate);
		this.maxTon = maxTon;
	}

	public double getMaxTon() {
		return maxTon;
	}

	public void setMaxTon(double maxTon) {
		this.maxTon = maxTon;
	}

	@Override
	public String toString() {
		return "Truck [maxTon=" + maxTon + "]";
	}
	
	
}
