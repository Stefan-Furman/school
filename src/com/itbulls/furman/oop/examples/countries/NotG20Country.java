package com.itbulls.furman.oop.examples.countries;

public class NotG20Country extends CountryParent {
	public static final byte POLLUTION = -1;

	public NotG20Country(String name, int size, int population) {
		super(name, size, population);
	}

	@Override
	public String toString() {
		return getName() + ": " + getSize() + " square km; " + getPopulation() + " people; " + calcPop()
				+ " people per square km; " + "approximately " + calcCO2() + " million metric tons";
	}

}
