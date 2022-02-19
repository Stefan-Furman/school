package com.itbulls.furman.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		System.out.println(addNumbers(3.5, 5.0));
		
	}
	
	
//(return type)     (signature)
//			(↓)      (↓    +    ↓) [name & values passed in] 
	static int addNumbers(int i1, int i2) {
		return (i1 + i2);
	}
	
	
	static double addNumbers(double d1, double d2) {
		return (d1 + d2);
	}
	
}
 