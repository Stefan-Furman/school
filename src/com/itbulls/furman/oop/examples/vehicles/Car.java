package com.itbulls.furman.oop.examples.vehicles;

public class Car extends Vehicle {
	private int numberOfSeats;

	
	public Car(String licensePlate, int numberOfSeats) {
		super(licensePlate);
		this.numberOfSeats = numberOfSeats;
	}


	public int getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + "]";
	}
	
	
	
}
