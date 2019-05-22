package com.sudeendrag.java8;

import java.util.function.Predicate;

import com.sudeendrag.corejava.collections.Employee;

/*
The Functional Interface PREDICATE is defined in the java.util.Function
package.It improves manageability of code,
helps in unit-testing them separately,
We can Replace Conditional Checks with predicates..*/
public class PredicateExample1 {
	
	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(7));
		
		Predicate<Employee> p2 = e -> e.getSalary()>200000;
		Employee e1= new Employee();
		e1.setSalary(100000);
		Employee e2= new Employee();
		e2.setSalary(200000);
		System.out.println(p2.test(e1));
		System.out.println(p2.test(e2));
	}
}
