package grade11.nov2022;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class TShirt {
	private String name;
	private String surname;
	private char size;
	private LocalDate dob;
	
	public static int countSmall = 0;
	public static int countMedium = 0;
	public static int countLarge = 0;
	
	
	public TShirt(String name, String surname, String size, String dob) {
		char sizeChar = size.charAt(0);
		
		this.name = name;
		this.surname = surname;
		this.size = sizeChar;
		this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		if (sizeChar == 'S') countSmall++;
		else if (sizeChar == 'M') countMedium++;
		else if (sizeChar == 'L') countLarge++;
	}
	
	
	
	private String code() {
		String fullName = name + surname;
		
		fullName = fullName.toUpperCase();
		
		String output = "";
		
		for(int i = 0; i < fullName.length(); i++) {
			char c = fullName.charAt(i);
			if (Character.isLetter(c) && "AEIOU".indexOf(c) == -1) { // Or check all vowels with !=
				output += c;
			} 
		}
		
		output = output.substring(0, 3);
		
		if (output.length() < 3) output += " ";
		
		Random random = new Random();
		output += random.nextInt(10); // or (int) (Math.random()*10)
		
		
		return output;
		
	}



	@Override
	public String toString() {
		return surname + ", " + name + " (" + code() + ") - " + dob.format(DateTimeFormatter.ofPattern("d MMMM yy")); 
	}
	
	
	
}
