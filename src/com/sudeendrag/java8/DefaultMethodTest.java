package com.sudeendrag.java8;

public class DefaultMethodTest implements DefualtMethodInterface {

	@Override
	public void getResults(String str) {
	
		System.out.println("getting Resultss....");
	}
	//we can override
	@Override
	  public void sendEmail()  {
		  System.out.println("Sending email via test....");
	  }
	
		public static void main(String[] args) {
			DefaultMethodTest test= new DefaultMethodTest();
			test.sendEmail();
		}
}
