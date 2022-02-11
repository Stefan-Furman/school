package com.itbulls.furman.oop.examples.meal;

public class Meal {
	private String day;
	private String meal;
	private int fat;
	private int prot;
	private int carb;
	
	public Meal() {
	}


	public Meal(String day, String meal, int fat, int prot, int carb) {
		this.day = day;
		this.meal = meal;
		this.fat = fat;
		this.prot = prot;
		this.carb = carb;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getMeal() {
		return meal;
	}


	public void setMeal(String meal) {
		this.meal = meal;
	}


	public int getFat() {
		return fat;
	}


	public void setFat(int fat) {
		this.fat = fat;
	}


	public int getProt() {
		return prot;
	}


	public void setProt(int prot) {
		this.prot = prot;
	}


	public int getCarb() {
		return carb;
	}


	public void setCarb(int carb) {
		this.carb = carb;
	}
	
	public int calcPoints() {
		return (fat*4) + (prot*2) + (carb*2);
	}


	@Override
	public String toString() {
		return "Meal [day=" + day + ", meal=" + meal + ", fat=" + fat + ", prot=" + prot + ", carb=" + carb + ", total points=" + calcPoints() + "]";
	}
	
	
}
 