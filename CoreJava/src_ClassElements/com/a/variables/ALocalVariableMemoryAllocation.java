/**
 * Local Variables Memory Allocation
 * ---------------------------------
 * Local Variables memory allocated when the method is invoked. And also memory is released when the method execution is completed.
 * 
 */

package com.a.variables;

public class ALocalVariableMemoryAllocation {
	
	public void m1() {   //memory allocates when the method is started
		
		/**
		 * Local Variables declared here
		 */
		int a = 10;
		int b = 20;
		
		
		/**
		 * Method Logic here
		 */
		System.out.println(a+b);
		
	} // Memory Released when the method is completed.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
