
/**
 * Inner Methods are not allowed in Java where as
 * inner classes are allowed.
 */
package com.b.methods.withoutReturnType;

public class Test6 {
	
	public void m1() {
		m2();
		System.out.println("This is M1 method");
		m2();
	}
	
	public void m2() {
		m3(10);
		System.out.println("This is M2 method");
	}
	
	public void m3(int i) {
		System.out.println("This is M3 Method");
		System.out.println(i);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t6 = new Test6();
		t6.m1();

	}

}
