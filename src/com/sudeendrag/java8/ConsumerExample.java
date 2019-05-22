package com.sudeendrag.java8;

import java.util.function.Consumer;

public class ConsumerExample {
public static void main(String[] args) {
	//Consumer only consumes the input but not returns anything
	Consumer<Integer> c1 = i->System.out.println("Square of  number is "+i*i);
	Consumer<Integer> c2 = i->System.out.println("Cube of number is  "+i*i*i);
	Consumer<Integer> c3= i->System.out.println("Square root of number is  "+Math.sqrt(i));
	
	c1.accept(2);
	c1.accept(10);
	
	
	/*
	 *  CHAINING CONSUMERS , compose method is not available
	 * */
	System.out.println();
	c1.andThen(c2).andThen(c3).accept(4);
	
	// BiConsumer is same as Consumer but it will take two inputs .
	//CONSUMER<I1,I2>
}
}
