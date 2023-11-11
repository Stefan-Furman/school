package grade11.nov2018;

import javax.swing.JOptionPane;

public class TrainingApp {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter member's name");
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter member's height"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter member's weight"));

		
		Training obj = new Training(name, height, weight);
		
		System.out.println(obj.toString());
	}

}
