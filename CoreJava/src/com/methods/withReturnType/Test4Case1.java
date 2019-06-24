/**
 * Sub: when method returning a variables
 * 
 * Case-1: 
 * when Instance and Local Variables are present
 * The first priority will go for the local variables during the execution
 * 

 */

package com.methods.withReturnType;

public class Test4Case1 {
	
	int a=100;
	public int m1(int a) {
		System.out.println("M1 method");
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4Case1 t4 = new Test4Case1();
		int x = t4.m1(10);
		System.out.println("return type of m1()="+x);

	}

}

