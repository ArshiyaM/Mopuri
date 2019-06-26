package com.methods.withReturnType;

 class Employeee{}
 class Studentt{}
 
public class PracticeReturn {
	public Employeee m1() {
		Employeee ee = new Employeee();
		System.out.println("M1 method");
		return ee;
	}
	
	public Studentt m2() {
		System.out.println("M2 method");
		Studentt s = new Studentt();
		return s;
	}
	
	public static void main(String[] args) {
		PracticeReturn practi = new PracticeReturn();
		Employeee emp = practi.m1();
		System.out.println("M1 method Return Type = "+emp);
		
		Studentt std = practi.m2();
		System.out.println("M2 method Return Type = "+std);
	}

}
