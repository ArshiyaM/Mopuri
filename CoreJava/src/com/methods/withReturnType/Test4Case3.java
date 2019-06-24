/**
 * Sub: when method returning a variables
 * 
 * Case-3: when Instance and Local Variables are present.
 * 
 * We need to use 'this' keyword in the return statement in order to give 
 * the first priority to Instance variable.
 * 
 */

package com.methods.withReturnType;

public class Test4Case3 {
	
	int c=30;
	
	public int m3(int c) {
		System.out.println("M3 method");
		return this.c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4Case3 tc3 = new Test4Case3();
		int z = tc3.m3(10);
		System.out.println("return value of m3()="+z);

	}

}
