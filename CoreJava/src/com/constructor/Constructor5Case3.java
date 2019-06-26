/**
 * Constructor Calling - Case-3:
 * ------------------------------ 
 * Inside a Constructor user must must be able to call only one constructor.
 * 
 * It means constructor doesn't allow to only one constructor to call it doesn't allow second constructor to call.
 * If we try to call 2-constructors in same constructor. Compiler will throw an error message as mentioned below:
 * "Constructor call must be the first statement in a constructor"
 * 
 * 
 */



/*
 * package com.constructor;
 * 
 * public class Constructor5Case3 {
 * 
 * public Constructor5Case3() { this(10); this(10,20);
 * System.out.println("0-Argument constructor"); }
 * 
 * 
 * public Constructor5Case3(int a) {
 * 
 * System.out.println("1-Argument constructor"); }
 * 
 * public Constructor5Case3(int a, int b) {
 * System.out.println("2-Arguments constructor"); }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * @SuppressWarnings("unused") Constructor5Case1 con5 = new Constructor5Case1();
 * 
 * }
 * 
 * }
 */
