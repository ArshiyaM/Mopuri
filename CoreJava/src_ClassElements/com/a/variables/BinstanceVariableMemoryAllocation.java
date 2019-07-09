/**
 * Instance Variable Memory Allocation:
 * ------------------------------------
 * Instance variable memory is allocated when the object is created where as memory will be de-allocated when the object is destroyed.
 */

package com.a.variables;

public class BinstanceVariableMemoryAllocation {
	//Instance Variables
		int a = 100;
		int b = 200;
		int c = 300;
		int d = 400;
		
		//Instance Method
		void m1() {
			System.out.println("Accessing the instance variables DIRECTLY");
			System.out.println(a);
			System.out.println(b);
		}
		
		// Main method is also static method
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Accessing the instance variables using OBJECT REFERENCE VARIABLE");
			BinstanceVariableMemoryAllocation memoryAllocation = new BinstanceVariableMemoryAllocation();
			System.out.println(memoryAllocation.c);
			System.out.println(memoryAllocation.d);
			
			memoryAllocation.m1();

		}
}
