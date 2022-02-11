package com.itbulls.furman.oop.examples.shapes;

public class Rectangle {
	private int width;
	private int length;
	
	public Rectangle() {
	}
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(int side) {
		this.width = side;
		this.length = side;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public double calcArea() {
		return length*width;
	}

	@Override
	public String toString() {
		if (width == length) {
			return "Square [width=" + width + ", length=" + length + ", area=" + calcArea() + "]";
		}
		
		return "Rectangle [width=" + width + ", length=" + length + ", area=" + calcArea() + "]";
	}
	
	
}
