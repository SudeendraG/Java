package com.sudeendrag.java8;

public class StaticMethodTest implements StaticMethodInterface {

	@Override
	public void getReoprt(String str) {
		System.out.println("getting Resultss....");
	}
	static void sendNotification(){  
		  System.out.println("Sending email via test....");
	  }
	
		public static void main(String[] args) {
			StaticMethodTest.sendNotification();
			StaticMethodInterface.sendNotification();
		}
}
