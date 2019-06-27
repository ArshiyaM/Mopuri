
/**
 * Sub: when method returning a variables
 * 
 * Case-2: 
 * When there is no Local Variable and only instance variable present
 * Since there is no local variable present in the method the priority goes for
 * instance variables
 */
package com.b.methods.withReturnType;

public class Test4Case2 {
	int b=20;
	public int m2() {
		System.out.println("M2 Method");
		return b;
	}
	
	public static void main(String[] args) {
		Test4Case2 case2 = new Test4Case2();
		int y = case2.m2();
		System.out.println("return value of m2()="+y);
	}

}
