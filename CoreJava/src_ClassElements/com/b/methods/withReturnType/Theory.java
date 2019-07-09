/**
 * MetHODS WITH RETURN TYPE
 * ------------------------
 * There are different types of return types for the methods.
 * 1. Primitive return types(int,byte,short,char float etc)
 * 2. Class type
 * 3. Array Type etc.
 * 
 * Example-1: Method without 'return type'
 * ---------
 * void m1({
 * 
 * 
 * }
 * 
 * Example-2: Method with 'return type'
 * ---------
 * 1. In the method 'return type' is other than void we must return that type of 
 * value using return statement.
 * 
 * 2. Inside a method the 'return statement' must be last line/statement of the
 * method.
 * 
 * 3. If return statement is not added it will generate the error message
 * like"Missing return statement"
 * 
 * int m1(){
 * -----
 * -----
 * return 10;
 * }
 * 
 * Example-3: Invalid return type
 * ---------
 * 
 * Return statement followed by logic is invalid type as shown below:
 * 
 * int m1(){
 * 
 * return 10;
 * ---------
 * ---------
 * logic
 * --------
 * --------
 * 
 * }
 * 
 * Example-4:
 * ---------
 * Method is able to return a value but holding that value is optional.
 * In Project level it is always recommended to hold the value as shown in
 * below example.
 * 
 * int m1(){
 * ---------
 * ---------
 * logic
 * --------
 * --------
 * 
 *return 10;
 * }
 * 
 * Test t = new Test();
 * int a = t.m1();
 * system.out.println(a); //10
 */


package com.b.methods.withReturnType;

public class Theory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
