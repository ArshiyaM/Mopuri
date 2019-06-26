/*
 * Methods with different signatures.
 * 
 * Note: Inside a class, it is not possible to declare 2-methods with 
 * same signature
 * 
 */
package com.methods.withoutReturnType;

public class Test4 {
	
	public void m1() {
		System.out.println("This is M1 method");
	}
	
	public void m1(int a) {
		System.out.println("This is M1 method --->>> with Parameters");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t4 = new Test4();
		
		t4.m1();
		t4.m1(1111);
	}

}
