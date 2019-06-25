package com.constructor;


//Advantage-2:
//Case-1: Problem: Default values are printed even after object is created.

public class Constructor3Adv2Case1 {
//Instance Variables
	int empNum;
	String empName;
	float empSal;
	
	public void display() {
		System.out.println("Employee Number is "+empNum);
		System.out.println("Employee Name is "+empName);
		System.out.println("Employee salary is: "+empSal);
		}

	public static void main(String[] args) {
		Constructor3Adv2Case1 cons3 = new Constructor3Adv2Case1();
		cons3.display();
	}

}
