/**
 * When a class contains Instance and Local variables with the same
 * name. 
 * 1. During the execution the priority will go first for 
 * local variables.
 * 2. In order to execute the instance variables user has to use 
 * 'this' keyword while executing them.
 */

package com.b.methods.withoutReturnType;

public class Test7 {
	
	//Instance Variables
	int x=100;
	int y=200;
	
	public void add(int x, int y) {
		System.out.println(x+y); //Local Varibles executiom
		System.out.println(this.x+this.y);//Instance Varibles execution
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t7 = new Test7();
		t7.add(1000, 2000);

	}

}
