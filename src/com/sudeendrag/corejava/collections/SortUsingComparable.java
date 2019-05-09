package com.sudeendrag.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparable {
	 public static void main(String args[]) {
		 List<Employee> emp1 =new ArrayList<>();
		 List<Employee> emp2 =new ArrayList<>();
		 Employee e1= new Employee();
		 e1.setId(1);
		 e1.setName("Dhoni");
		 e1.setSalary(800000);
		 
		 Employee e2= new Employee();
		 e2.setId(2);
		 e2.setName("Rahul");
		 e2.setSalary(700000);
		 
		 Employee e3= new Employee();
		 e3.setId(3);
		 e3.setName("AMIR");
		 e3.setSalary(600000);
		
		 emp1.add(e1);
		 emp1.add(e2);
		 emp1.add(e3);
		 emp2.addAll(emp1);
		 
    System.out.println("Ascending Order Sorting Using Comparable .....");
		  Collections.sort(emp2);
	System.out.println(emp2);
	System.out.println("Descending  Order Sorting Using Comparable .....");
	Collections.sort(emp1, Comparator.reverseOrder());
	System.out.println(emp1);
}
 
}
