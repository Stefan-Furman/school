package grade11.nov2019;

import javax.swing.JOptionPane;

public class SpectatorApp {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter name. Enter 'stop' to stop");
		String id = JOptionPane.showInputDialog("Enter id number. Enter 'stop' to stop");

		while (!(name.equalsIgnoreCase("stop") || id.equalsIgnoreCase("stop"))) {
			Spectator spectator = new Spectator(name, id);
			
			System.out.println(spectator.toString() + "\n");
			
			
			name = JOptionPane.showInputDialog("Enter name. Enter 'stop' to stop");
			id = JOptionPane.showInputDialog("Enter id number. Enter 'stop' to stop");
		}
	}

}
