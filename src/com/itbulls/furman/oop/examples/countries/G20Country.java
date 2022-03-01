package com.itbulls.furman.oop.examples.countries;

public class G20Country extends CountryParent {
	private double pollution;

	public G20Country(String name, int size, int population, double pollution) {
		super(name, size, population);
		this.pollution = pollution;
	}

	public double calcPerPerson() {
		double pollutionPerPerson = (double) pollution / getPopulation();
		return (double) Math.round(pollutionPerPerson * 1_000_000 * 1000) / 1000;
	}

	@Override
	public String toString() {
		return getName() + ": " + getSize() + " square km; " + getPopulation() + " people; " + calcPop()
				+ " people per square km; " + pollution + " metric tons = " + calcPerPerson()
				+ " metric tons per person";
	}

}
