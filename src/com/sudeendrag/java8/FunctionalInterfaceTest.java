package com.sudeendrag.java8;

public class FunctionalInterfaceTest {
	public static void main(String[] args) {

// java 7 way using Anonymous class

		FunctionalInterfaceExampleJava7 fn = new FunctionalInterfaceExampleJava7() {

			@Override
			public boolean isFunctional() {
				System.out.println("Functional Interfaces In java7 way");
				return false;
			}
		};
		fn.isFunctional();

		// java 8 to replace anonymous with lambda
		// single line you can skip return and {}
		FunctionalInterfaceExampleJava8 fn8 = (isboolean) -> { System.out.println("Functional Interfaces In java8 way"); return !isboolean;};
		fn8.isFunctional(true);

	}
}
