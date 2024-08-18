package ststithians2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BikeManager {
	private Bike[] arr = new Bike[150];
	private int size = 0;
	
	
	public BikeManager() {
		try {
			Scanner scFile = new Scanner(new File("Bikes.txt"));
			
			while (scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				
				int id = scLine.nextInt();
				LocalDate date = LocalDate.parse(scLine.next(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
				String depot = scLine.next();
				
				Bike obj = null;
				
				if (scLine.hasNext()) {
					String type = scLine.next();
					 
					obj = new Repairs(type, id, date, depot);
				} else {
					obj = new Bike(id, date, depot);
				}
				
				
				arr[size] = obj;
				size++;
			}
			
			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!");
		}
	}

	
	
	public String allBikes() {
		String output = "";
		
		for (int i = 0; i < size; i++) {
			output += arr[i].toString() + "\n\n";
		}
		
		return output;
	}
	
	
	public int countBikes(String depot1, String depot2) {
		int count = 0;
		
		for (int i = 0; i < size; i++) {
			if (arr[i].getDepot().equals(depot1) || arr[i].getDepot().equals(depot2)) count++;
		}
		
		
		return count;
	}
	
	
	public void allRepairs() {
		// can rather do individual syso's instead of an output
		
		String output = "";
		double total = 0;
		
		for (int i = 0; i < size; i++) {
			if (arr[i] instanceof Repairs) {
				Repairs obj = (Repairs) arr[i];
				
				total += obj.getCost();
				
				output += obj.toString() + "\n\n";
			}
		}
		
		output += "Total cost to repair all bikes: R" + total;
		
		
		System.out.println(output);
	}
	
	
	
	
	
	// QUESTION 7
	
	public String getBikeByID(int id) {
		String output = "No bike found with id: " + id;
		
		int i = 0;
		boolean found = false;
		
		while (i < size && !found) {
			if (arr[i].getId() == id) {
				found = true;
				output = arr[i].toString();
			}
			
			i++;
		}
		
		
		
		return output;
	}
	
	
	
	public String getSponsors() {
		String output = "";
		
		try {
			Scanner scFile = new Scanner(new File("Advert.txt"));
			
			while (scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter(",");
				
				String sponsor = scLine.next();
				
				output += sponsor + "\n";
				
				while (scLine.hasNext()) {
					int id = scLine.nextInt();
					output += getBikeByID(id) + "\n";
				}
				
				output += "\n";
			}
			
			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!");
		}
		
		
		
		
		return output;
	}
	
}
