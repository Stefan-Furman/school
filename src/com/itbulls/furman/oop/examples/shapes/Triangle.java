package com.itbulls.furman.oop.examples.shapes;

public class Triangle {
	private int base;
	private int height;
	
	public Triangle() {
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double calcArea() {
		return 0.5*base*height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", area=" + calcArea() + "]";
	}
	
}
 