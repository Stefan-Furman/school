package grade11.nov2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TShirtApp {

	public static void main(String[] args) {
		try {
			Scanner scFile = new Scanner(new File("shirts.txt"));
			
			while (scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter(", ");
				
				String name = scLine.next();
				String surname = scLine.next();
				String size = scLine.next();
				String dob = scLine.next();
				
				TShirt obj = new TShirt(name, surname, size, dob);
				
				System.out.println(obj.toString());
			}
			
			scFile.close();
			
			System.out.println("\nTotals:\nSmall: " + TShirt.countSmall + "\nMedium: " + TShirt.countMedium + "\nLarge: " + TShirt.countLarge);
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!");
		}
	}

}
