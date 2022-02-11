package com.itbulls.furman.oop.examples.learner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Learner l = new Learner();
		
		while (true) {
			String input = JOptionPane.showInputDialog("N, D or S");
			
			switch (input) {
			case "N":
				String fullName = JOptionPane.showInputDialog("Enter full name");
				int term1 = Integer.parseInt(JOptionPane.showInputDialog("Enter term 1 mark"));
				int term2 = Integer.parseInt(JOptionPane.showInputDialog("Enter term 2 mark"));
				int term3 = Integer.parseInt(JOptionPane.showInputDialog("Enter term 3 mark"));
				
				l.setFullName(fullName);
				l.setTerm1(term1);
				l.setTerm2(term2);
				l.setTerm3(term3);
				break;
			case "D":
				System.out.println(l.toString());
				break;
			case "S":
				System.out.println("Exiting");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}

}
 