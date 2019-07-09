/**
 * Inside a class
 * --------------
 * We can create more than 1-instance blocks in a class. Corresponding example is here.
 * In the example you can see that first instance blocks will be executed 
 */

package com.d.instance.block;

public class Instance4 {
	public Instance4() {
		// TODO Auto-generated constructor stub
		System.out.println("0-Arg Constructor");
	}
	
	public Instance4(int a){
		System.out.println("1-Arg Constructor");
	}
	
	{
		System.out.println("Instance Block-1");
	}
	
	{
		System.out.println("Instance Block-2");
	}
	
	public static void main(String[] args) {
		new Instance4();
		new Instance4(10);
	}

}
