package com.itbulls.furman.oop.examples.countries;

public class Country {
	private String name;
	private int size;
	private int population;
	private double pollution;

	public Country(String name, int size, int population, double pollution) {
		this.name = name;
		this.size = size;
		this.population = population;
		this.pollution = pollution;
	}

	public double calcPop() {
		return (double) Math.round((double) population / size * 1000) / 1000;
	}

	public double calcCO2() {
		return (double) Math.round((double) population * 5 / 1_000_000 * 1000) / 1000;
	}

	public double calcPerPerson() {
		double pollutionPerPerson = (pollution == -1) ? -1 : (double) pollution / population;
		return (double) Math.round(pollutionPerPerson * 1_000_000 * 1000) / 1000;
	}

	@Override
	public String toString() {
		if (pollution != -1) {
			return name + ": " + size + " square km; " + population + " people; " + calcPop()
					+ " people per square km; " + pollution + " metric tons = " + calcPerPerson()
					+ " metric tons per person";
		} else {
			return name + ": " + size + " square km; " + population + " people; " + calcPop()
					+ " people per square km; " + "approximately " + calcCO2() + " million metric tons";
		}

	}

}
