/**
 * Scope of the Instance Variables:
 * --------------------------------
 * Instance variables can be accessed --> Inside the class, all methods, Constructors and Blocks.
 * 
 */


package com.a.variables;

public class BInstanceVariableScope {
	
	//Instance Variables
	int a = 100;
	int b = 200;
	
	//Instance Method
	void m1() {
		System.out.println("Instance Block");
	}
	
	// Main method is also static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
