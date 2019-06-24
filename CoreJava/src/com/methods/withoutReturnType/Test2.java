package com.methods.withoutReturnType;

/**
 * Instance and static methods with parameters. Here, parameters are
 * primitive data types.
 * Local Variables are passed inside the method
 * @author rmopuri
 * 
 * While passing the parameters:If the method is expecting the 
 * parameters while calling that method we must pass the parameters
 * 
 * While passing the value to the parameter the order and the number
 * of parameters must be important.
 *
 */
public class Test2 {
	
	public void m1(int a, char ch) {
		System.out.println("M1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	
	public static void m2(String str,double d) {
		System.out.println("M2 method");
		System.out.println(str);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		t2.m1(10,'M');
		Test2.m2("Mopuri Rahamthulla", 29.9);
	}

}
