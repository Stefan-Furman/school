package grade11.nov2019;

import java.time.LocalDate;

public class Spectator {
	private String name;
	private String id;
	private int age;
	
	
	public Spectator(String name, String id) {
		this.name = name;
		this.id = id;
		
		setAge(id);
	}
	
	
	private boolean checkDigits() {
		boolean hasNonNumeric = false;
		
		for (int i = 0; i < id.length(); i++) {
			if (!Character.isDigit(id.charAt(i))) hasNonNumeric = true;
		}
				
		return hasNonNumeric;
	}
	
	
	public void setAge(String id) {
		if (!checkDigits()) {
			int yearBorn = Integer.parseInt(id.substring(0, 2));
			
			if (yearBorn < 19) yearBorn += 2000;
			else yearBorn += 1900;
			
			age = LocalDate.now().getYear() - yearBorn; 
		} else age = 0;
	}
	
	
	public String createHandle() {
		String handle = "@";
		
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isLetter(c)) handle += name.charAt(i);
		}
		
		handle += "!";
		
		return handle;
	}


	@Override
	public String toString() {
		return name + " with ID:\t " + id + " is " + age + (age>=16? "\nUse twitter handle " + createHandle() : "");
	}
	
	
	
}
