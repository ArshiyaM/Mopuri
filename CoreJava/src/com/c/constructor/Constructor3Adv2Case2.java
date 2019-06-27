package com.c.constructor;

/*Advantage-2:
	Case-2: Constructors are used to initialize some values to the instance variables during object creation.
*/
public class Constructor3Adv2Case2 {
	
	
	//Instance Variables
	int empNum;
	String empName;
	float empSal;
	
	public Constructor3Adv2Case2() {
		empNum=1770;
		empName="Raham";
		empSal=21.90f;
	}

	public void display() {
		System.out.println("Employee Number = "+empNum);
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee salary = "+empSal);
	}
	
	public static void main(String[] args) {
		Constructor3Adv2Case2 cons333 = new Constructor3Adv2Case2();
		cons333.display();
	}
	
	}


