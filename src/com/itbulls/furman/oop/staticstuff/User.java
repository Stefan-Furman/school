package com.itbulls.furman.oop.staticstuff;

public class User {
	public String name;
	public int number;
	public static int numberOfUsers;
	
	public User(String name, int number) {
		this.name = name;
		this.number = number;
		numberOfUsers++;
	}
	
	public static int foo() {
		return 1;
	}
	
}
