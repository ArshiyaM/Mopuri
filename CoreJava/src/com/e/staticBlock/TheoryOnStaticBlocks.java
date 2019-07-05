


/**
 * STATIC BLOCK
 * ------------
 * 1. Static Blocks are used to write the logics.
 * 2. Logics are executed during the .class file loading.
 * 3. Static blocks are executed only once since the .class file is loading only once.
 * 
 * Syntax
 * ------
 * static
 * {
 * Logica here
 * }
 *
 *
 *When we are trying to execute the test class JVM performs 2-actions at runtime
 *
 *Action-1:
 *--------
 *When we are trying to execute a particular class first of all JVM loads corresponding .class  file
 *byte code into memory, during .class file load into the memory static blocks are executed.
 *
 *Action-2:
 *--------
 *After loading the .class file JVM calls the main method to start the execution.
 *
 *Difference Between Static and Instance Blocks
 *----------------------------------------------
 *Static blocks are executed only once during the .class file loading. Also, .class file load only once where as Instance
 *blocks are executed depends on object creation(If we create 5-objects 5 times instance blocks are executed)
 *
 *
 *JAVA-1.5 Version
 *-----------------
 *In order to execute the static blocks main method is optional.
 *
 *JAVA-1.6 Version:
 *-----------------
 *In order to execute the static blocks main method is mandatory.
 *
 *
 *Interview Question:
 *-------------------
 *Is it possible to print the output without main method?
 *Ans: It is possible to execute the static blocks without main method till java-version-1.5(Java-1.5 main method is optional)
 * where as main method is mandatory to execute the static blocks.
 * 
 * Advantages:
 * -----------
 * Adv-1: Static blocks are used to initialize the static variables. Here, static blocks are used to initialize
 * static variables during class loading.
 * 
 * Ex: StaticBlock3
 *
 *
 */

package com.e.staticBlock;
public class TheoryOnStaticBlocks {

}
