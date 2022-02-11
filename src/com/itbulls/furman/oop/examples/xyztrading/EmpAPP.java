package com.itbulls.furman.oop.examples.xyztrading;

import javax.swing.JOptionPane;

public class EmpAPP {

	public static void main(String[] args) {
		Employee e = new Employee("Stefan", "Furman", "21061129", 100_000, 2, 'N');

		while (true) {
			System.out.println(
					"1. Display the pay slip\n2. Change the annual salary\n3. Change the number of dependants\n");
			
			String input = JOptionPane.showInputDialog("Enter number");
			
			switch(input) {
			case "1":
				e.displayPaySlip();
				break;
			case "2":
				int newSalary = Integer.parseInt(JOptionPane.showInputDialog("Enter new salary"));
				e.setSalary(newSalary);
				break;
			case "3":
				int newDependents = Integer.parseInt(JOptionPane.showInputDialog("Enter new number of dependents"));
				e.setDependants(newDependents);
				break;
			case "exit":
				System.out.println("Exiting");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input try again");
			}
		}
	}

}
 