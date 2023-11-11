package grade11.nov2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Uber {

	public static void main(String[] args) {
		String[] plateArr = new String[50];
		double[] costArr = new double[20];
		int size = 0;

		try {
			Scanner scFile = new Scanner(new File("uber.txt"));

			while (scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");

				plateArr[size] = scLine.next();
				costArr[size] = Double.parseDouble(scLine.next());
				size++;
			}

			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!");
		}

		boolean valid = true;
		int i = 0;
		
		while (valid && i < size) {
			String plate = plateArr[i];
			for (int j = 0; j < plate.length(); j++) {
				if (!Character.isLetterOrDigit(plate.charAt(j)) && plate.charAt(j) != ' ') valid = false;
			}
			
			i++;
		}
		
		
		
		if (!valid) {
			for (int j = i - 1; j < size - 1; j++) {
				plateArr[j] = plateArr[j + 1];
				costArr[j] = costArr[j + 1];
			}
			
			
			size--;
		}
		
		
		double totalCost = 0;
		for (int j = 0; j < size; j++) {
			totalCost += costArr[j];
		}
		
		System.out.println("Average cost: R" + (totalCost/size));
	}

}
