package kdl2023;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SkaterArray {
	protected ShortProgram[] skater = new ShortProgram[100];
	protected int size = 0;
	
	
	
	public SkaterArray() {
		try {
			Scanner scFile = new Scanner(new File("skaters.txt"));
			
			while (scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				
				for (int i = 0; i < 2; i++) {
					String name = scLine.next();
					String nation = scLine.next();
					double points = Double.parseDouble(scLine.next());
					int positionSP = scLine.nextInt();
					String positionFS = scLine.next();
					
					
					//always parent
					ShortProgram obj = null;
					
					if (positionFS.equals("N/A") || points < FreeStyle.QUALIFY) {
						// short program
						
						obj = new ShortProgram(positionSP, name, nation, points);
					}
					else {
						// free style
						obj = new FreeStyle(positionSP, Integer.parseInt(positionFS), name, nation, points);
					}
					
					skater[size] = obj;
					size++;
				}
				
			}
			
			
			
			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND");
		}
		
		
	}
	
	
	public void sortSurname() {
		
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (skater[i].getSurname().compareToIgnoreCase(skater[j].getSurname()) > 0) {
					// SWAP
					ShortProgram temp = skater[i];
					skater[i] = skater[j];
					skater[j] = temp;
				}
			}
		}
		
	}


	@Override
	public String toString() {
		String output = "";
		
		for (int i = 0; i < size; i++) {
			output += skater[i].toString() + "\n";
		}
		
		
		return output;
	}
	
	
	
	
}
