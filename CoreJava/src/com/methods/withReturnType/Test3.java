/**
 * Sub: Returning the current class object
 * 
 * If we are returning current class object, there are 2-approaches to return 
 * the current class objects
 * 
 * Approach-1: 
 *  create a object and return the reference variable.
 * 
 * Approach-2:
 * Use 'this' keyword
 * 
 * In project level, it is always recommended to use the APPROACH-2.
 * 
 */


package com.methods.withReturnType;

public class Test3 {
	
	public Test3 m1() {
		System.out.println("M1 method");
		Test3 t3 = new Test3();
		return t3;
		
	}
	
	public Test3 m2() {
		System.out.println("M2 Method");
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 tt1 = new Test3();
		@SuppressWarnings("unused")
		Test3 tt2 = tt1.m1();
		@SuppressWarnings("unused")
		Test3 tt3 = tt1.m2();

	}

}
