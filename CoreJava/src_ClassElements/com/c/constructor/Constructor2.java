/**
 * Subject: User-defined Parameterized/non-parameterized Constructor
 */

package com.c.constructor;

public class Constructor2 {
	
	void m1() {
		System.out.println("M1 method");
	}
	
	/**
	 * Zero-Argument Constructor
	 * @param args
	 */
	public Constructor2() {
		// TODO Auto-generated constructor stub
		System.out.println("0-Argument COnstructor");
	}
	
	/**
	 * 1-Argument Constructor
	 * @param args
	 */
	public Constructor2(int a) {
		System.out.println("1-Argument Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 cons1 = new Constructor2();
		Constructor2 cons2 = new Constructor2(10);
		
		cons1.m1();
		cons2.m1();

	}

}
