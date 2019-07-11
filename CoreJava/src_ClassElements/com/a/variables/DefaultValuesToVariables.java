package com.a.variables;

public class DefaultValuesToVariables {
	
	//Instance Variables
	int a ;
	float b;
	
	//Static Variables
	static short s;
	static boolean bool;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DefaultValuesToVariables def = new DefaultValuesToVariables();
		System.out.println("For Instance Variables JVM will provide the default values:");
		System.out.println(def.a);
		System.out.println(def.b);
				
		System.out.println("For Static Variables JVM will provide the default values:");
		System.out.println(DefaultValuesToVariables.s);
		System.out.println(DefaultValuesToVariables.bool);
		
		//Local Variables
		byte by;
		short s;
		System.out.println("**Note** For Local Variables JVM will not assign default values, makesure that Local Variables must be initialized");
	}

}
