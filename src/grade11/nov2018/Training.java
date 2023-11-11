package grade11.nov2018;

import java.util.Random;

public class Training {
	private String name;
	private double height;
	private double weight;
	
	
	
	public Training(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public double calcBMI() {
		return Math.round(weight/(height*height)*100)/100.0;
	}
	
	
	public String classify() {
		if (calcBMI() < 18.5) return "underweight";
		else if (calcBMI() >= 18.5 && calcBMI() <= 25) return "normal";
		else return "overweight";
	}
	
	
	
	public String code() {
		String temp = "";
		
		for (int i = 0; i < name.length(); i++) {
			char c = name.toUpperCase().charAt(i);
			
			if ("AEIOU".indexOf(c) == -1 && c != ' ') temp += c;
		}
		
		
		Random random = new Random();
		int randNum = random.nextInt(9) + 1; //or (int) (Math.random() * 9 + 1)
		
		int checkDigit = randNum + 10 + temp.length();
		
		return temp.substring(0, 3) + randNum + checkDigit;
	}



	@Override
	public String toString() {
		return "Member: " + code() + "\nBMI: " + calcBMI() + "-" + classify();
	}
	
	
}
