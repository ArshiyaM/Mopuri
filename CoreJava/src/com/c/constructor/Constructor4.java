package com.c.constructor;

public class Constructor4 {
	
	int empId;
	String empName;
	float empSalary;
	
	public Constructor4(int empId, String empName, float empSalary) {
		//Conversion of local variables to instance variables using 'this' keyword.
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		
	}
	
	public void display() {
		System.out.println("Employee Id =" +empId);
		System.out.println("Employee Name =" +empName);
		System.out.println("Employee Salary = " +empSalary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor4 const1 = new Constructor4(1, "Raham", 21.1f);
		const1.display();
		
		Constructor4 const2 = new Constructor4(2, "Mopuri", 22.23f);
		const2.display();
	}

}
