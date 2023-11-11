package grade11.nov2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Codes {

	public static void main(String[] args) {
		String[] nameArr = new String[20];
		String[] checkArr = new String[20];
		int size = 0;

		try {
			Scanner scFile = new Scanner(new File("codes.txt"));

			while (scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");

				nameArr[size] = scLine.next();
				checkArr[size] = scLine.next();
				size++;
			}

			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!!");
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (nameArr[i].compareToIgnoreCase(nameArr[j]) > 0) {
					String temp = nameArr[i];
					nameArr[i] = nameArr[j];
					nameArr[j] = temp;

					temp = checkArr[i];
					checkArr[i] = checkArr[j];
					checkArr[j] = temp;
				}
			}
		}

		System.out.println("Alphabetical list of members");
		for (int i = 0; i < size; i++) {
			System.out.println(nameArr[i] + "\t" + checkArr[i]);
		}

		System.out.println("\nFemale members with allergies");
		for (int i = 0; i < size; i++) {
			if (nameArr[i].charAt(nameArr[i].length() - 1)== 'F' && checkArr[i].contains("*"))
				System.out.println(nameArr[i] + "\t" + checkArr[i]);
		}
		
		
		int totalAllergies = 0;
		for (int i = 0; i < size; i++) {
			if (checkArr[i].contains("*")) totalAllergies++;
		}
		
		System.out.println("\nTotal number of members with allergies\n" + totalAllergies); // her memo does for total females
	}

}
