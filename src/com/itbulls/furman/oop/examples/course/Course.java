package com.itbulls.furman.oop.examples.course;

import javax.swing.JOptionPane;

public class Course {

	public static void main(String[] args) {
		int course = Integer.parseInt(JOptionPane.showInputDialog("Enter course number"));
		
		if (course != 1 && course != 2 && course != 3) {
			System.out.println("Invalid Course Number!"); // you can decide what to do if invalid
		}
		
		int hours = Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours"));
		
		Cost cost = new Cost(course);
		
		System.out.println("Course number: " + course);
		System.out.println("Final cost: " + cost.finalCost(hours));
		
		
	}

}
