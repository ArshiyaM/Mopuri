/**
 * Rule:: 'this' keyword is not allowed inside a static method 
 * 
 * If the user tries to use 'this' keyword inside a static method while
 * compile time following error will be displayed like "error: non-static 
 * variable 'this' cannot be referenced from static context"
 */

package com.methods.withoutReturnType;

public class Test9 {
	
	//Instance Variables
	int x=100;
	int y=200;
	
	static void add(int x, int y) {
		System.out.println(x+y);
		//System.out.println(this.x+this.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test9 t9 = new Test9();
		Test9.add(1000, 2000);

	}

}
