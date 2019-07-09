package com.d.instance.block;

public class Instance2 {
	public Instance2() {
		// TODO Auto-generated constructor stub
		System.out.println("0-Arg constructor");
	}
	
	public Instance2(int a) {
		System.out.println("1-Arg constructor...!!!");
	}
	
	public Instance2(int a, String str) {
		System.out.println("2-Arg constructor");
	}
	
	{
		System.out.println("Instance Block is here....");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new Instance2();
		new Instance2(10);
		new Instance2(10,"MRT");
		

	}

}
