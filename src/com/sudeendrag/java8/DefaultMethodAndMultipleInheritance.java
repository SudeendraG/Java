package com.sudeendrag.java8;
//Multiple Inheritance
public class DefaultMethodAndMultipleInheritance   implements DefualtMethodInterface,StaticMethodInterface {

	@Override
	public void getReoprt(String str) {
		
	}

	@Override
	public void getResults(String str) {
		
	}

	@Override
	public void sendEmail() {
		System.out.println("Implementation of default method");  
		
	}

}
