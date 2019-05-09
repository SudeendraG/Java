package com.sudeendrag.java8;

public class MultithreadingAndLambda {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = -0; i < 10; i++) {
				System.out.println("executing from Thread 2 (Runnable)....");
			}
		};
		Thread t = new Thread(runnable);
		t.start();
		for (int i = -0; i < 10; i++) {
			System.out.println("executing from Thread main");
		}
	}
}
