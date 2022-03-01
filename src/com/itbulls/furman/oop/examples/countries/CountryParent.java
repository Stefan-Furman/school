package com.itbulls.furman.oop.examples.countries;

public class CountryParent {
	private String name;
	private int size;
	private int population;
	
	public CountryParent(String name, int size, int population) {
		this.name = name;
		this.size = size;
		this.population = population;
	}
	
	public double calcPop() {
		return (double) Math.round((double) population / size * 1000) / 1000;
	}
	
	public double calcCO2() {
		return (double) Math.round((double) population * 5 / 1_000_000 * 1000) / 1000;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public int getSize() {
		return this.size;
	}
	
}
