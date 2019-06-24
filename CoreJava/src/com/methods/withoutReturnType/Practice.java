package com.methods.withoutReturnType;

class RatanTata{ }
class Tcs{}


class Birla{}
class More{}



public class Practice {
	
	public void m1(RatanTata rt, Tcs tcs) {
		System.out.println("M1 method");
	}
	
	public static void m2(Birla br, More more) {
		System.out.println("M2 method");
	}
	


	public static void main(String[] args) {
		Practice prctice = new Practice();
		prctice.m1(new RatanTata(), new Tcs());
	
		Practice.m2(new Birla(), new More());

	}

}
