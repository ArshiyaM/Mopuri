/**
 * Instance Block will be executed first even if the there are more number of objects are created.
 */

package com.d.instance.block;

public class Instance3 {
	
	Instance3(){
		System.out.println("0-Arg Constructor");
	}
	
	{
		System.out.println("***Instance Block***");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Instance3();
		new Instance3();
		new Instance3();

	}

}
