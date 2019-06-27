/**
 * Constructor Calling - Case-1:
 * ------------------------------
 * Use 'this' keyword in order to call the current class constructor.
 * 
 * Here, we are calling a constructor inside an constructor in order to know the
 * execution flow.
 */
package com.c.constructor;

public class Constructor5Case1 {
	
	public Constructor5Case1() {
		this(10);
		System.out.println("0-Argument constructor");
	}
	
	
	public Constructor5Case1(int a) {
		this(10,20);
		System.out.println("1-Argument constructor");
	}
	
	public Constructor5Case1(int a, int b) {
		System.out.println("2-Arguments constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Constructor5Case1 con5 = new Constructor5Case1();

	}

}
