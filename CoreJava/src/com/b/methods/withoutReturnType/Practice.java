package com.b.methods.withoutReturnType;

class Practice1{}
class Practice2{}
class Practice3{}
class Practice4{}

public class Practice {
	
	public void m1(Practice1 practice1, Practice2 p2) {
		System.out.println("M1 method");
	}
	
	public static void m2(Practice3 p3, Practice4 p4) {
		System.out.println("M2 method");
	}
	
	public static void main(String[] args) {
		Practice practi = new Practice();
		practi.m1(new Practice1(), new Practice2());
		Practice.m2(new Practice3(), new Practice4());
	}

}
