/**@author rmopuri
 * Method with Parameters(Here, parameters are objects)
 * 
 * Note: Inside a class, it is not possible to declare 2-methods with 
 * same signature
 *
 */
package com.methods.withoutReturnType;

class Yasmine{}
class Arshu{}

class Mopuri{}
class Raham{}

public class Test3 {
	public void m1(Yasmine yas, Arshu arshi) {
		System.out.println("This is M1 method");
		
	}
	
	public static void m2(Mopuri mop, Raham rah) {
		System.out.println("This is M2 method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t3 = new Test3();
		
		t3.m1(new Yasmine(),new Arshu());
		Test3.m2(new Mopuri(),new Raham());
		


	}

}
