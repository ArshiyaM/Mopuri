/*
 * When there are 3-class(Block1,Block2 and Block3)
 * 
 * Block1: Contains static blocks and Main method.
 * Block2 and Block3: Contains only static blocks.
 * 
 * Here, without main method we cannot execute the Block2 and Block3 classes.
 * we can use "forName" method in order to dynamically execute the Block2 and Block3 classes.
 * So, main method is optional when we are using the "forName" method instead of main method.
 */

package com.e.staticBlock;

public class Block1 {
	
	static {
		System.out.println("Block1 class here");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("Block2");
		Class.forName("Block3");
	}

}
