package com.b.methods.withoutReturnType;

public class Practice {
//Instance Variables
	int a=10;
	int b=20;
	
	public void add(int a, int b) {
		System.out.println("Add Result: ");
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	
	public int multiplication(int a, int b) {
		
		System.out.println("Multiplication Result: ");
		System.out.println(a*b);
		System.out.println(this.a*this.b);
		return a*b;
		
	}
	
	public static void main(String[] args) {
		Practice pra = new Practice();
		pra.add(100, 200);
		pra.multiplication(100, 200);
	}

}
