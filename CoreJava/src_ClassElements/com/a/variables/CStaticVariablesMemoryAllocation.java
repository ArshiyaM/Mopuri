package com.a.variables;

public class CStaticVariablesMemoryAllocation {
	
	//Static Variables
	static int a =1000;
	static int b =2000;
	static int c =3000;
	static int d =4000;
	static int e =5000;
	static int f =6000;
	
	
	//User defined Static method
	public static void m1() {
		
		/**
		 * Static variables are printing in static using the class name
		 */
		System.out.println("Static Area ---> Static method executing the static variables...!!!");
		System.out.println(CStaticVariablesMemoryAllocation.c);
		System.out.println(CStaticVariablesMemoryAllocation.d);
	}
	
	//Instance Method
	public void m2() {
		System.out.println("Instance Area ---> Instance method executing the static variables...!!!");
		System.out.println(CStaticVariablesMemoryAllocation.e);
		System.out.println(CStaticVariablesMemoryAllocation.f);
	}
	
	//Static method and also main method
	public static void main(String[] args) {
		
		CStaticVariablesMemoryAllocation staticMemoryAllocation = new CStaticVariablesMemoryAllocation();
		
		System.out.println("Static Area ---> Main method executing the static variables...!!!");
		System.out.println(CStaticVariablesMemoryAllocation.a);
		System.out.println(CStaticVariablesMemoryAllocation.b);
		
		/**
		 * Static method is executing using its class name
		 */
		CStaticVariablesMemoryAllocation.m1();
		
		/**
		 * Instance method executing using its object reference variable
		 */
		staticMemoryAllocation.m2();
		
	}

}
