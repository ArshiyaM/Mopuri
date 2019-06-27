package com.b.methods.withoutReturnType;

public class Test1 {
	
	//Instance Method
	public void m1() {
		System.out.println("M1 method");
	}
	
	//Static Method
	public static void m2() {
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
			t1.m1();
			Test1.m2();

	}

}
