/**
 * 
 */

package com.e.staticBlock;

public class StaticBlock1 {
	
	{
		System.out.println("Instance Block-1");
	}
	{
		System.out.println("Instance Block-2");
	}
	
	static {
		System.out.println("Static Block-1");
	}
	static {
		System.out.println("Static Block-2");
	}
	
	public StaticBlock1() {
	// TODO Auto-generated constructor stub
		System.out.println("0-Org constructor");
	}
	
	StaticBlock1(int a){
		System.out.println("1-Org constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticBlock1();
		new StaticBlock1(10);
	}

}
