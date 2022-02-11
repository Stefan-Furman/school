package com.itbulls.furman.oop.examples.meal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Meal m = new Meal();
		
		String day = JOptionPane.showInputDialog("Enter day");
		m.setDay(day);
		
		String meal = JOptionPane.showInputDialog("Enter meal");
		m.setMeal(meal);
		
		while (true) {
			int fat = Integer.parseInt(JOptionPane.showInputDialog("Enter fat"));
			
			if (inRange(fat)) {
				m.setFat(fat);
				break;
			} else {
				System.out.println("Invalid input try again");
			}
		}
		
		while (true) {
			int prot = Integer.parseInt(JOptionPane.showInputDialog("Enter prot"));
			
			if (inRange(prot)) {
				m.setProt(prot);
				break;
			} else {
				System.out.println("Invalid input try again");
			}
		}
		
		while (true) {
			int carb = Integer.parseInt(JOptionPane.showInputDialog("Enter carb"));
			
			if (inRange(carb)) {
				m.setCarb(carb);
				break;
			} else {
				System.out.println("Invalid input try again");
			}
		}
		
		System.out.println(m.toString());
		
	}
	
	
	
	
	
	private static boolean inRange(int number) {
		if (number >= 0 && number <= 50) {
			return true;
		}
		
		return false;
	} 

}
