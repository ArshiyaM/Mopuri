
/**
 * This example is for "operator overloading" and also printing
 * multiple variables in single line using "operator overloading"
 * 
 * How many overloaded operators supports in Java?
 * or
 * Does JAVA supports operator overloading concept?
 * Answer:
 * Java supports only one operator overloading i.e, '+'
 * '+' is implicit operator overloading
 */
package com.methods.withoutReturnType;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Raham"+"Yasmine");
		System.out.println("Raham"+"Arshiya"+"Yasmine");
		System.out.println(19+24+"Arshiya"+"Yasmine"+07+2018);
		
		int a=10;
		int b=20;
		int c=30;
		
		//Printing multiple variables in different lines
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		
		//Printing multiple variables in same line
		System.out.println(a+"---"+b+"---"+c);

	}

}
