package com.itbulls.furman.oop.examples.course;

public class Cost {
	private int course;
	
	public Cost(int course) {
		this.course = course;
	}
	
	public int getCourse() {
		return this.course;
	}
	
	public int calcCost() {
		switch(course) { 	//no  break; because you cannot write code after the return keyword
		case 1:
			return 200;
		case 2:
			return 250;
		case 3:
			return 150;
		default:
			return 0;
		}
	}
	
	public int finalCost(int hours) {
		return calcCost() * hours;
	}
}
