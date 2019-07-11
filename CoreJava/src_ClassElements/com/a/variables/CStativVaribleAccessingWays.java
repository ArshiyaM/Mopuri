/**
 * There are 3-ways to access the static variables
 * 1. Using the class name
 * 2. Direct access
 * 3. Using object reference variable.
 * 
 * Note:
 * Its good to go ahead with the way-2 in the project level.
 * 
 * Go through below example to understand it.
 */

package com.a.variables;

public class CStativVaribleAccessingWays {
	
	static int a =10000;

	public static void main(String[] args) {
		
		CStativVaribleAccessingWays ways = new CStativVaribleAccessingWays();
		
		//Accessing static variables using its class name
		System.out.println(CStativVaribleAccessingWays.a);
		
		//Accessing static variables directly'
		System.out.println(a);
		
		//Accessing Static Variables using its object reference variable
		System.out.println(ways.a);
	}

}
