package com.itbulls.furman.oop.examples.vehicles;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("NUmebr plate", 5);
		Truck truck = new Truck("Number plate 1", 10.2);
		
		
		System.out.println(car.getLicensePlate());
		System.out.println(truck.getMaxTon());
	}

}
