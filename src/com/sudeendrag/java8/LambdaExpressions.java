package com.sudeendrag.java8;



/*
 * lambda expression is an anonymous function or sometime called as closures , No Return type, no name, no modifiers
 * A function that doesn’t have a name and doesn’t belong to any class
 * lambda operator ->
 * No return type – The java 8 compiler is able to infer the return type by checking the code. you need not to mention it explicitly.
 * To use function interface:
  	Pre Java 8: We create anonymous inner classes.
	Post Java 8: You can use lambda expression instead of anonymous inner classes only when annonymous inner class implementing Functional interface
	Anonymous inner class is  more powerful than lambda.
 * */
public class LambdaExpressions {
	public static void main(String[] args) {
		// java 8 to replace anonymous with lambda
		// single line you can skip return and {} , and only one argument paranthasys also we can remove
   FunctionalInterfaceExampleJava8 fn8 = (isboolean) -> { System.out.println("Callling Functional Interfaces Using Lambda"); return !isboolean;};
   fn8.isFunctional(true);
   //without flower bracket no need return , if we are using {} need return statement 
   FunctionalInterfaceExampleJava8 shortfn = isboolean -> !isboolean ;
   shortfn.isFunctional(true);
	}
	
}	
