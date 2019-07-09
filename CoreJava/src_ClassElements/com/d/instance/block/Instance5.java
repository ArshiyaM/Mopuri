/**
 * Calling a 1-arg constructor from 0-org constructor
 * --------------------------------------------------
 * Instance block will be executed first even if we call 1-arg constructor from 0-org constructor
 */

package com.d.instance.block;

public class Instance5 {
	public Instance5() {
		// TODO Auto-generated constructor stub
		this(111);
		System.out.println("0-Org Constructor");
	}
	
	public Instance5(int a){
		System.out.println("1-Arg Constructor");
	}
	
	{
		System.out.println("Instance Block");
	}
	public static void main(String[] args) {
		new Instance5();
	}
}
