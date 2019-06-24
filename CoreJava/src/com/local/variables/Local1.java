package com.local.variables;

public class Local1 {
	
	public static void babyAge() {
		int age=0;
		age=age + 1;
		
		System.out.println("Baby age is : " +age);
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local1 locVariable = new Local1();
		locVariable.babyAge();

	}

}
