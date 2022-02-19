package com.itbulls.furman.oop.examples.countries;

import javax.swing.JOptionPane;

public class CountryApp {

	public static void main(String[] args) {
		while (true) {
			String name = JOptionPane.showInputDialog("Enter country name or STOP to exit");
			if (name.equals("STOP")) {
				break;
			}
			int size = Integer.parseInt(JOptionPane.showInputDialog("Enter size of country (km^2)"));
			int population = Integer.parseInt(JOptionPane.showInputDialog("Enter population of country"));
			double pollution = Double
					.parseDouble(JOptionPane.showInputDialog("Enter pollution of country (million metric tons)"));
			Country country = new Country(name, size, population, pollution);
			System.out.println(country.toString());
		}
	}

}
