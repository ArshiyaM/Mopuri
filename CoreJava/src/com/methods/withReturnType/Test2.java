/**
 * Sub: Method Return Type with class names
 */

package com.methods.withReturnType;

class Employee{
	
}

class Student{
	
}
public class Test2 {
	
	public Employee m1() {
		System.out.println("M1 method");
		Employee e = new Employee();
		return e;
	}
	
	public Student m2() {
		System.out.println("M2 method");
		Student s = new Student();
		return s;
	}
	
	public static String m3() {
		System.out.println("M3 method");
		return "Arshiya";
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Employee emp = t2.m1();
		System.out.println("Return value of m1()="+emp);
		
		Student student = t2.m2();
		System.out.println("Return value of m2()="+student);
		
		String str = Test2.m3();
		System.out.println("Return value of m3()="+str);

	}

}
