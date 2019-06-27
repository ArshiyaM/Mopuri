package com.d.instance.block;

public class Instance1 {
	
	public Instance1() {
		// TODO Auto-generated constructor stub
		System.out.println("0-Arg constructor");
	}
	
	{
		System.out.println("Instance Block her...!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Named Object
		 * 
		 * @SuppressWarnings("unused") Instance1 isb1 = new Instance1();
		 */
		
		new Instance1();
	}

}
