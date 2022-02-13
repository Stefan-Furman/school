package com.itbulls.furman.oop.staticstuff;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Stefan", 2);
		System.out.println(User.numberOfUsers);
		User user4 = new User("Stefan", 4);
		System.out.println(User.numberOfUsers);
		User user6 = new User("Stefan", 6);
		System.out.println(User.numberOfUsers);
		
		System.out.println(User.foo());
		
	}

}
