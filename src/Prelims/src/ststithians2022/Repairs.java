package ststithians2022;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Repairs extends Bike {
	private String type;
	
	
	public static final char CHAIN = 'C';
	public static final char SEAT = 'S';
	public static final char BRAKES = 'B';
	public static final char TIRES = 'T';
	
	
	public Repairs(String inType, int inId, LocalDate inDate, String inDep) {
		super(inId, inDate, inDep);
		
		this.type = inType;
	}
	
	
	public double getCost() {

		/*
		 * C
		 * 
		 * C,S,T
		 * 
		 * S,B
		 */
		Scanner sc = new Scanner(type).useDelimiter(",");
		
		double cost = 0;
		
		while (sc.hasNext()) {
			char repair = sc.next().charAt(0);
			
			if (repair == CHAIN) cost += 300;
			else if (repair == SEAT) cost += 800;
			else if (repair == BRAKES) cost += 650;
			else if (repair == TIRES) cost += 900;
		}
		
		
		if (Period.between(super.getSerDate(), LocalDate.now()).getMonths() <= 3) cost = 0.75 * cost;
		
//		int monthNow = LocalDate.now().getMonthValue();
// 		int monthRepair = super.getSerDate().getMonthValue();
// 		
// 		if (monthNow - monthRepair <= 3) cost = 0.75 * cost;
		
		return cost;
	}


	@Override
	public String toString() {
		return super.toString() + "\tCost of repair R" + getCost(); 
	}
	
	
	
	
}
