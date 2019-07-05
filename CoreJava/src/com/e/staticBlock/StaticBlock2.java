/**
 * Static blocks execution without main method
 * --------------------------------------------
 * Till Java-1.5: In order to execute the static blocks main method is optional.
 * From Java-1.6: In order to execute the static blocks main method is mandatory.
 */

package com.e.staticBlock;

public class StaticBlock2 {

	static {
		System.out.println("Static Block-1");
	}
	
	static {
		System.out.println("Static Block-2");
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * }
	 */

}
