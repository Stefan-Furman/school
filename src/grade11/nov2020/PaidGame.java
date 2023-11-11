package grade11.nov2020;

public class PaidGame extends Game {
	private double price;
	private int discount;
	
	
	public PaidGame(String name, String genre, char other, double price, int discount) {
		super(name, genre, other);
		
		this.price = price;
		this.discount = discount;
	}
	
	
	public double calcCost() {
		return price - (discount/100.0*price);
	}


	@Override
	public String toString() {
		return super.toString() + "\n\tR" + calcCost(); 
	}
	
	

}
