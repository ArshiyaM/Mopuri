package com.e.staticBlock;

public class AllClassElementsExample {
	
	/**
	 * Variables
	 * @param args
	 */
	
	int a =10;
	static int b=20;
	
	/**
	 * Instance Method
	 * @param args
	 */
	void m1(int a) {
		System.out.println("Instance Method here");
	}
	
	/*
	 * Static Method
	 */
	static void m2(String str) {
		System.out.println("Static Method here");
	}
	
	/**
	 * Constructor
	 * @param args
	 */
	
	public AllClassElementsExample() {
		// TODO Auto-generated constructor stub
		System.out.println("0-org Constructor");
	}
	
	public AllClassElementsExample(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("1-org Constructor");
	}
	
	/**
	 * Static Block
	 * @param args
	 */
	static {
		System.out.println("Static Block");
	}
	
	/**
	 * Instance Method
	 * @param args
	 */
	
	{
		System.out.println("Instance Block");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllClassElementsExample a1 = new AllClassElementsExample();
		AllClassElementsExample a2 = new AllClassElementsExample(22);
		a1.m1(33);
		AllClassElementsExample.m2("MOPURI");
		
	}

}
