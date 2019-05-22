package com.sudeendrag.java8;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicateExample {
	/* PRIMITIVE PREDICATE TYPES
	 * */
public static void main(String[] args) {
//	Predicate<Integer>  --> can be replaced by IntPreicate   int values
//	Predicate<Double>  --> can be replaced by DoublePreicate  double 
//	Predicate<Long>     --> can be replaced by LongPreicate   long
	
	IntPredicate isEven = i->{
		if(i%2==0){
			return true;
		}
		return false;
	};
	
	System.out.println("Is 10 an even number? : "+isEven.test(10));
	
	
	DoublePredicate isLengthEven = doubleVal->{
		if(Double.toString(doubleVal).length()%2==0){
			return true;
		}
		return false;
	};
	
	System.out.println("Is 10.33 of even length? : "+isLengthEven.test(10.33));
	
	
	LongPredicate isLengthEven2 = longVal->{
		if(Long.toString(longVal).length()%2==0){
			return true;
		}
		return false;
	};
	
	System.out.println("Is Length of 10003 even? : "+isLengthEven2.test(1003L));
}
}
