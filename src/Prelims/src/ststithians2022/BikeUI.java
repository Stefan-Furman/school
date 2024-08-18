package ststithians2022;

public class BikeUI {

	public static void main(String[] args) {
		BikeManager bm = new BikeManager();
		
		System.out.println("ALL BIKES:\n");
		System.out.println(bm.allBikes() + "\n");
		
		System.out.println("COUNT:\n");
		System.out.println(bm.countBikes("Lion & Safari Park", "Cradle of Humankind") + "\n");
		
		System.out.println("ALL REPAIRS\n");
		bm.allRepairs();
		
		
		System.out.println("\nSPONSORS\n" + bm.getSponsors());
	}

}
