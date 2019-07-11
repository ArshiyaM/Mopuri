package com.a.variables;

public class Assignment1 {
	/**
	 * Instance Variables
	 * @param args
	 */
	int a = 10;
	float f = 10.10f;
	double d = 10.1010;
	char ch = 'M';
	String str = "Raham";
	
	public static void m1() {
		System.out.println("Printing instance variables from the static method");
		Assignment1 assign = new Assignment1();
		System.out.println(assign.a);
		System.out.println(assign.f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CSaticVariableAssignment1.m1();
		m1();
		
	}

}
