package com.sudeendrag.java8;

import java.util.function.Function;

import com.sudeendrag.corejava.collections.Employee;

//Function will take one argument and return any output
public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer,Integer> f1= i->i*2;
		System.out.println(f1.apply(10));
		
		Function<Integer,Integer> f2= i->i*i*i;
		System.out.println(f2.apply(4));
		
		/* 
		 *  ``FUNCTION CHAINING``
		 * */
		// andThen menaing output of f1-> passed to f2 and result will be populated, i.e,
		// 2*2 = 4 and -> 4*4*4 =64 output
		System.out.println(f1.andThen(f2).apply(2));
		// andThen menaing output of f1-> passed to f2 and result will be populated, i.e,
		// 2*2*2 =8 and ->  8*2 =16 output
		System.out.println(f1.compose(f2).apply(2));
		
		Function<Employee,Integer> f3 = e ->e.getSalary()+5000;
		System.out.println(f3.apply(new Employee("Shiva", 212, 20000)));
		
	}
	//Bi Function is same as Function except that it will take two inputs
	//Function<I1,I2,R>
}
