/**
 * INITIALIZING INSTANCE VARIABLES USING INSTANCE BLOCKS
 * ------------------------------------------------------
 * Instance Block initializing the value to instance variable during object creation
 * 
 */


package com.d.instance.block;

public class Instance6 {
	
	int empId;
	
	void display() {
		System.out.println(empId);
	}
	
	
	//Instance Block initializing the value to instance variable during object creation
	{
		empId=1111;
		System.out.println("Instance Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Instance6().display();
	}

}
