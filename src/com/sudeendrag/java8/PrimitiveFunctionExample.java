package com.sudeendrag.java8;

public class PrimitiveFunctionExample {
public static void main(String[] args) {
	/*
	 * For handling primitive types, there are specific Function interfaces – 
	 * 
	 * ToIntFunction,   						<Input int and any ReturnType>
		ToLongFunction,  					<Input long and any ReturnType>
	    ToDoubleFunction, 	 				<Input double and any ReturnType>
	    
	     ToIntBiFunction,						<TWO Inputs of  ints and any ReturnType>          applyAsInt()
	     ToLongBiFunction, 					<TWO Inputs of  longs and any ReturnType>       applyAsLong()
	     ToDoubleBiFunction, 	 		<TWO Inputs of  double and any ReturnType>     applyAsDouble()
	     
	     LongToIntFunction,    			<Input : long , return : int> ,         applyAsInt()
	     LongToDoubleFunction, 		<Input : long , return : double> ,  applyAsDouble()
	     
	     IntToLongFunction, 					<Input : int , return : long> ,         applyAsLong()
	     IntToDoubleFunction,				<Input : int , return : long> ,         applyAsDouble()
	     
	     DoubleToIntFunction,				<Input : double , return : int> ,           applyAsInt()
	     DoubleToLongFunction				<Input : double , return : long> ,         applyAsLong()
	 * 
	 * 
	 * 
	 * Using Function<T, Integer> instead of IntFunction<T> when the last one suffices has 2 disadvantages:

		Every returned int is boxed - meaning a larger memory footprint;
		Every returned Integer gets an automatic runtime check (which can be optimized away,);
	 * */
}
}
