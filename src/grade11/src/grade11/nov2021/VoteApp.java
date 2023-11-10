package grade11.nov2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VoteApp {

	public static void main(String[] args) {
		try {
			Scanner scFile = new Scanner(new File("analysis.txt"));
			
			while(scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				
				String wardID = scLine.next();
				String districtID = scLine.next();
				int total = scLine.nextInt();
				int resultA = scLine.nextInt();
				int resultB = scLine.nextInt();
				
				Votes obj;
				
				if (scLine.hasNext()) {
					int spoilt = scLine.nextInt();
					
					obj = new SpoiltVotes(wardID, districtID, total, resultA, resultB, spoilt);
				} else {
					obj = new Votes(wardID, districtID, total, resultA, resultB);
				}
				
				System.out.println(obj.toString());
			}
			
			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!");
		}
	}

}
