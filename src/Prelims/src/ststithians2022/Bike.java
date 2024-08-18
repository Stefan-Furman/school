package ststithians2022;

import java.time.LocalDate;

public class Bike {
	private int id;
	private LocalDate servDate;
	private String depot;
	
	
	public Bike(int inId, LocalDate inDate, String inDep) {
		this.id = inId;
		this.servDate = inDate;
		this.depot = inDep;
	}


	public int getId() {
		return id;
	}


	public LocalDate getSerDate() {
		return servDate;
	}


	public String getDepot() {
		return depot;
	}


	@Override
	public String toString() {
		return "Depot Name: " + depot + "\tbike id: " + id + ",\n\tServiced date: " + servDate;
	}
	
	
	
	
}
