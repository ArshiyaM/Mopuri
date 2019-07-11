package com.a.variables;

public class Assignment2 {
	
	//Instance Variables
	int a = 1;
	byte b = 2;
	
	//Static Variables
	static short s = 3;
	static char ch = 'A';
	
	
	/**
	 * INSTANCE METHOD
	 * @param args
	 */
	public void m1() {
		System.out.println("Printing static and instance variables from INSTANCE METHOD: ");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(Assignment2.s);
		System.out.println(Assignment2.ch);
	}
	
	public static void m2() {
		System.out.println("Printing static and instance variables from STATIC METHOD: ");
		Assignment2 assg1 = new Assignment2();
		System.out.println(assg1.a);
		System.out.println(assg1.b);
		
		
		System.out.println(Assignment2.s);
		System.out.println(Assignment2.ch);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 assg = new Assignment2();
		assg.m1();
		Assignment2.m2();
		
	}

}
