/**
 * Purpose of Variables
 * ---------------------
 * Variables are used to store the values by using these values we are achieving the project requirements.
 * 
 * Ex: Employee Project contains variables as mentioned below
 * int empId=111;
 * String emPname = "MRT";
 * 
 * Types of Variables
 * ==================
 * *****1. Local Variables*****
 * 
 * i. Local Variable Declaration:
 * Variables which are declared inside a method/inside constructor/ inside a blocks(static or instance) are called "Local Variables".
 *    EX: For better understanding refer the class ----> LocalVariable1
 *    
 * ii. Scope: 
 * Scope of the Local Variable is only within the method/within constructor/ within a blocks(static or instance)
 * 
 * iii. Memory Allocation: 
 * Local Variables memory allocated when the method is invoked. And also memory is released when the method execution is completed.
 * Ex: For better understanding refer the class ---> ALocalVariableMemoryAllocation
 * 
 * iv. Stack Memory:
 * Local Variables are stored in the stack memory.
 * 
 * 
 * *****2. Instance Variables******
 * Definition of Instance Variables: The variables which are declared inside a class and outside a method is called "Instance Variables"
 * 
 * i. Instance Variable Declaration:
 * Instance Variables are declared inside a class but outside a methods
 * 
 *  EX:
 *  For better understanding of Instance Variables declaration refer the class ---> BInstanceVariableDeclaration
 *    
 * ii. Scope: 
 * Instance variables can be accessed --> Inside the class, all methods, Constructors and Blocks.
 * 
 * EX:
 * For better understanding of Instance Variables scope refer the class ---> BInstanceVariableScope
 * 
 * iii. Memory Allocation: 
 * Instance variable memory is allocated when the object is created where as memory will be de-allocated when the object is destroyed.
 * 
 * EX:
 * For better understanding of Instance Variables memory allocation refer the class ---> BinstanceVariableMemoryAllocation
 * 
 * iv. Permission:
 * Permission-1: Instance Area ---> "Instance variables & methods" can be DIRECTLY ACCESSED
 * Permission-2: Static Area   ---> "Instance variables & methods" can be ACCESSED BY USING OBJECT REFERENCE VARIABLE
 * 
 * 
 * *****3. Static Variables*****
 * Def:
 * The variables which are declared inside a class and outside a method using STATIC modifier is called "Static Variables"
 *
 *i. Static Variables Declaration:
 *The variables which are declared inside a class and outside a method using STATIC modifier.
 *
 *EX:
 *For better understanding of STATIC variables declaration refere the class ---> CStaticVariablesDeclaration
 *
 *ii. Scope
 * Static variables can be accessed inside class.
 *
 *
 *iii. Memory Allocation:
 *As you know JVM perform 2-actions mentioned below in order to provide the memory allocation.
 * 
 * Action-1: JVM loads .class file byte code in to the memory
 * Action-2: JVM calls main method to start the execution.
 * 
 * So from this we can understand that the static variables gets the memory during the .class file loading.
 * 
 * iv.Permission:
 * Permission-1: Static Area     ---> "Static variables & methods" can be accessed by using CLASS_NAME
 * Permission-2: Instance Area   ---> "Static variables & methods" can be accessed by using CLASS_NAME
 * 
 * 
 * Extra Information:
 * -------------------
 * int a=10; --> Here 'a' is variable of type 'int'
 * Variable Types: 
 * 
 * Every variable must be contains with its own type. They are:
 * a. Primitive type ==> Ex- int a=10; float f=10.5f;
 * b. class-type     ==> Ex - Test t; Employee emp;
 * c. Array-type     ==> Ex - int[] a; Staring[] str;
 *  
 * 
 * 
 * 2. Instance Variables:
 * 3. Static Variables
 * 
 * 
 */

package com.a.variables;

public class TheroyOnVariables {

}
