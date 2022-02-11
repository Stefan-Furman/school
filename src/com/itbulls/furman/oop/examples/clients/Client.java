package com.itbulls.furman.oop.examples.clients;

public class Client {
	private String name;
	private int age;
	private String program;
	
	public Client() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return "Name: " + name.toUpperCase() + "\nAge: " + age + "\nProgram: " + program;
	}
	
	
}
