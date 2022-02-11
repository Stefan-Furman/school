package com.itbulls.furman.oop.examples.clients;

import javax.swing.JOptionPane;

public class Label {

	public static void main(String[] args) {
		Client client = new Client();
		
		String name = JOptionPane.showInputDialog("Enter name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
		String program = JOptionPane.showInputDialog("Enter program");
		
		name = name.toUpperCase();
		
		client.setAge(age);
		client.setName(name);
		client.setProgram(program);
		
		System.out.println(client.toString());
	}

}
 