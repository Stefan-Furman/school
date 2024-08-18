package ststithians2022;

public class Advertisement {
	private String Company;
	
	private Bike[] bikes;
	
	
	public Advertisement(String inCompany, Bike[] bk) {
		this.Company = inCompany;
		this.bikes = bk;
	}


	@Override
	public String toString() {
		String output = "SPONSORED BY: \t" + Company.toUpperCase() + "\n";
		
		for (int i = 0; i < bikes.length; i++) {
			output += bikes[i].toString() + "\n";
		}
		
		return output;
	}
	
	
	
}
