package com.sudeendrag.java8;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
    // Supplier will not take any input but returns output of type any  no supplier chaining
		Supplier<String> s1 = () -> {
			// Generate OTP
			String otp = "";
			for (int i = 0; i < 6; i++) {
				// Math.random() --> 0>x<1 ie , b/w 0 to 0.99999
				otp = otp + (int)( Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
}
	
	// no BiSupplier since it has no input
}
