/*
 *  Adv-1:
 *  ------
 * Static blocks are used to initialize the static variables. Here, static blocks are used to initialize
 * static variables during class loading.
 */

package com.e.staticBlock;

public class Adv1StaticBlock3 {
	
	static int empId;
	
	static {
		empId=111;
	}
	
	static void display() {
		System.out.println(Adv1StaticBlock3.empId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adv1StaticBlock3.display();
	}

}
