package com.itbulls.furman.oop.examples.xyztrading;

public class Employee {
	private String firstName;
	private String surname;
	private String dob;
	private double salary;
	private int dependent;
	private char medAid;
	private double monthlySalary;
	
	public Employee(String firstName, String surname, String dob, double salary, int dependants, char medAid) {
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.salary = salary;
		this.dependent = dependants;
		this.medAid = medAid;
		this.monthlySalary = this.salary/12;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		this.monthlySalary = this.salary/12;
	}

	public int getDependants() {
		return dependent;
	}

	public void setDependants(int dependants) {
		this.dependent = dependants;
	}

	public char getMedAid() {
		return medAid;
	}

	public void setMedAid(char medAid) {
		this.medAid = medAid;
	}
	
	public double calcTax() {
		return 15*monthlySalary/100;
	}
	
	private double calcPension() {
		return 7.5*monthlySalary/100;
	}
	
	public double calcMedAid() {
		if (medAid == 'Y') {
			return 1500 + 300 * dependent;
		}
		
		return 0;
	}
	
	public double calcNetSalary() {
		return monthlySalary - calcTax() - calcPension() - calcMedAid();
	}
	
	public void displayPaySlip() {
		System.out.println(firstName + surname + dob + monthlySalary + calcTax() + calcPension() + calcMedAid() + calcNetSalary());
	}
	
	
}
 