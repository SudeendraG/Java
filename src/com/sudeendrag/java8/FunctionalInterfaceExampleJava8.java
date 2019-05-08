package com.sudeendrag.java8;


/*In Java, a Marker interface is an interface without any methods or fields declaration, 
means it is an empty interface. Similarly, a Functional Interface is an interface with 
just one abstract method declared in it. Runnable interface is an example of a Functional Interface.
It has only run() method declared in it.

Lambda expression works on functional interfaces to replace anonymous classes.

*@FunctionalInterface is a new annotation added in Java 8 to indicate that an interface
* declaration is intended to be a functional interface as defined by the Java Language Specification
* . @FunctionalInterface can be used for 
*compiler level errors when the interface you have annotated is not a valid Functional Interface.
*/

@FunctionalInterface
public interface FunctionalInterfaceExampleJava8 {

	  boolean isFunctional(boolean isfunctional);
	  
	  default void m1() {
		  System.out.println("Functional interface can contain any number of  default and static methods");
	  }
	  
	  static void m2() {
		  System.out.println("Rule of Functional interface is. it should contain only one Abstract Method");
	  }
}
