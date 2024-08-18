package kdl2023;

public class SkaterApp {

	public static void main(String[] args) {
		SkaterArray sArr = new SkaterArray();

		
		sArr.sortSurname();
		
		
		System.out.println(sArr.toString());
		
		System.out.println("Highest points: " + sArr.getHighest());
		
		System.out.println("\n" + sArr.getSummary());
		
	}

}
