package com.sudeendrag.java8;

public class StaticMethodTest implements StaticMethodInterface {

	@Override
	public void getReoprt(String str) {
		System.out.println("getting Resultss....");
	}
 
	
		public static void main(String[] args) {
			//StaticMethodTest.sendNotification();  //wrong
			//sendNotification();  // compiler error
			StaticMethodTest test= new StaticMethodTest();
			//test.sendNotification();   // compiler error
			StaticMethodInterface.sendNotification();  //only way to access the static methods is using interface
		}
}
