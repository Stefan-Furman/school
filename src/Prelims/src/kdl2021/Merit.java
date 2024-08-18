package kdl2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Merit {
	private int studentID;
	private LocalDate offence; //<--
	private String code;
	
	
	public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


	public Merit(int s, String o, String c) {
		this.studentID = s;
		this.code = c;
		
		this.offence = LocalDate.parse(o, formatter);
	}


	public int getStudentID() {
		return studentID;
	}


	public String getCode() {
		return code;
	}
	
	public double calcPoint() {
		int level = code.charAt(1);
		
		return level * 5;
	}
	
	
	private String findDescription() {
		// code = M3_1 --> Half colours
		
		try {
			Scanner scFile = new Scanner(new File("codes.txt"));
			
			boolean found = false;
			String output = "";
			
			while (scFile.hasNext() || !found) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				
				String codeLine = scLine.next();
				String description = scLine.next();
				
				if (codeLine.equals(code)) {
					found = true;
					output = description;
				}
			}
			
			scFile.close();
			return output;
		} catch (FileNotFoundException e) {
			System.err.println("NOO FACK OFF. FILE NOT FOUND HANNAH!");
			return "";
		}
		
	}


	@Override
	public String toString() {
		return studentID + "\t" + offence.format(formatter) + "\t" + findDescription();
	}
	
	
	
	
}
