package grade11.nov2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamApp {

	public static void main(String[] args) {
		try {
			Scanner scFile = new Scanner(new File("music.txt"));
			
			while(scFile.hasNext()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				
				String name = scLine.next();
				int status = scLine.nextInt();
				String instrument = scLine.next();
				
				MusicStudent obj;
				
				if (scLine.hasNext()) {
					String examBody = scLine.next();
					obj = new ExamStudent(name, status, instrument, examBody);
					
					
				} else {
					obj = new MusicStudent(name, status, instrument);
				}
				
				if (obj.getStatus().equals(MusicStudent.STATUS_GREEN)) {
					System.out.println(obj + "\n");
				}
				
			}
			
			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND!!");
		}

	}

}
