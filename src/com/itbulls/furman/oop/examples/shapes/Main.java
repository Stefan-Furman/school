package com.itbulls.furman.oop.examples.shapes;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		while (true) {
			String input = JOptionPane.showInputDialog("Enter triangle, rectangle, or square");
			
			switch (input) {
			case "triangle":
				int base = Integer.parseInt(JOptionPane.showInputDialog("Enter base"));
				int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
				
				Triangle t = new Triangle(base, height);
				
				System.out.println(t.toString());
				break;
			case "rectangle":
				int width = Integer.parseInt(JOptionPane.showInputDialog("Enter width"));
				int length = Integer.parseInt(JOptionPane.showInputDialog("Enter length"));
				
				Rectangle r = new Rectangle(width, length);
				
				System.out.println(r.toString());
				break;
			case "square":
				int side = Integer.parseInt(JOptionPane.showInputDialog("Enter side"));
				
				Rectangle s = new Rectangle(side);
				
				System.out.println(s.toString());
				break;
			case "exit":
				System.out.println("Exiting");
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
			}
		}

	}

}
 