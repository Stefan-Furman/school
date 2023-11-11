package grade11.nov2020;

import javax.swing.JOptionPane;

public class GameTags {

	public static void main(String[] args) {
		String[] gameTagArr = new String[50];
		int counter = 0;
		
		String gameTag = JOptionPane.showInputDialog("Enter game tag. Enter 'XXX' to stop");
		
		while (!gameTag.equals("XXX")) {
			gameTagArr[counter] = gameTag.toUpperCase(); 
			counter++;
			
			gameTag = JOptionPane.showInputDialog("Enter game tag. Enter 'XXX' to stop");
		}
		
		
		String[] tempArr = new String[50];
		int tempCounter = 0;
		
		for (int i = 0; i < counter; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < counter; j++) {
				if (gameTagArr[i].equals(gameTagArr[j])) duplicate = true;
			}
			
			if (!duplicate) {
				tempArr[tempCounter] = gameTagArr[i];
				tempCounter++;
			}
		}
		
		
		gameTagArr = tempArr;
		counter = tempCounter;
		
		
		for (int i = 0; i < counter; i++) {
			for (int j = i+1; j < counter; j++) {
				if (gameTagArr[i].compareTo(gameTagArr[j]) > 0) {
					String temp = gameTagArr[i];
					gameTagArr[i] = gameTagArr[j];
					gameTagArr[j] = temp;
				}
			}
		}
		
		
		for (int i = 0; i < counter; i++) {
			System.out.println(gameTagArr[i]);
		}
	}

}
