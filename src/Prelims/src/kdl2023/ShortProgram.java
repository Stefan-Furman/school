package kdl2023;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortProgram {
	private int position;
	private String name;
	private String surname;
	private String nation; // prefix AFG
	private double points;

	public ShortProgram(int position, String fullName, String nation, double points) {
		this.position = position;
		this.nation = nation;
		this.points = points;

		// SEND FULLNAME TO SPLITNAME
		splitName(fullName);
	}

	private void splitName(String fullName) {
		// Adam SIAO HIM FA

		// extract the first part of name and store it
		// Scanner way

//		Scanner sc = new Scanner(fullName).useDelimiter(" ");
//		
//		String firstName = sc.next();
//		
//		String lastName = "";
//		
//		while (sc.hasNext()) {
//			String partSurname = sc.next();
//			
//			lastName += Character.toUpperCase(partSurname.charAt(0));
//			lastName += partSurname.substring(1).toLowerCase();
//			lastName += " ";
//			
//		}

		// [Adam, SIO, FA]
		String[] nameArr = fullName.split(" ");

		String firstName = nameArr[0];

		String lastName = "";

		for (int i = 1; i < nameArr.length; i++) {
			String partSurname = nameArr[i];

			lastName += Character.toUpperCase(partSurname.charAt(0));
			lastName += partSurname.substring(1).toLowerCase();
			lastName += " ";
		}

		name = firstName;
		surname = lastName;
	}

	public String getNation() {

		String output = "Unkown";

		try {
			Scanner scFile = new Scanner(new File("countries.txt"));

			boolean found = false;

			while (scFile.hasNext() && found == false) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("# ");

				String prefix = scLine.next();
				
				String full = scLine.next();

				if (prefix.equals(nation)) {
					// found
					output = full;
					found = true;
				}
			}

			scFile.close();

		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND");
		}

		return output;

	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public double getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return position + ") " + surname + ", " + name + "(" + getNation() + "): " + points
				+ " points. Did not qualify for Free Style.";
	}

}
