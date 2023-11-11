package grade11.nov2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GamesApp {

	public static void main(String[] args) {
		try {
			Scanner scFile = new Scanner(new File("games.txt"));
			
			while (scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				
				String name = scLine.next();
				String genre = scLine.next();
				char other = scLine.next().charAt(0);
				
				Game obj;
				
				if (scLine.hasNext()) {
					double price = Double.parseDouble(scLine.next());
					int discount = 0;
					
					if (scLine.hasNext()) {
						discount = scLine.nextInt();
					}
					
					 obj= new PaidGame(name, genre, other, price, discount);
				} else {
					obj = new Game(name, genre, other);
				}
				
				System.out.println(obj.toString());
			}
			
			scFile.close();
			
			
			System.out.println("Action games: " + Game.countAction);
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!!");
		}
		
	}

}
