
/**
 * Sub: Method with return types as primitive data types.
 */
package com.b.methods.withReturnType;

public class Test1 {
	
	//Non-static method with return type
	public int m1() {
		System.out.println("M1 method");
		return 10;
	}
	
	//Non-static method with return type
	public float m2() {
		System.out.println("M2 method");
		return 10f;
	}
	
	//Static method with return type
	public static double m3() {
		System.out.println("M3 method");
		return 22.2;
	}
	
	
	//Static method with return type
	public static char m4() {
		System.out.println("M4 method");
		return 'm';
	}

	public static void main(String[] args) {
		
		
		//Creating object to call non-static members
		Test1 t1 = new Test1();
		
		/**
		 * Calling a method directly using a its object with out 
		 * saving return value.
		 */
		t1.m1(); 
		
		/**
		 * Calling a method directly using a its object and also
		 * saving its return value.
		 */
		float x = t1.m2();
		System.out.println("return value of m2()="+x);
		
		/**
		 * Calling a static method with its class name and not saving its
		 * return value
		 */
		Test1.m3();
		
		
		/**
		 * Calling a static method with its class name and saving its 
		 * return value
		 */
		char y = Test1.m4();
		System.out.println("return value of m4()="+y);

	}

}
