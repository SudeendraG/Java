package com.sudeendrag.java8;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndLambda {
	public static void main(String[] args) {
	List<String> list1 =new ArrayList<>();
	 List<String> list2 =new ArrayList<>();

	 list1.add("Minisha");
	 list1.add("Nimisha");
	 list1.add("Amithsha");
	 list1.add("Sachin");
	 list1.add("Rahul");
	 list1.add("Anshu");
	list2.addAll(list1);

	System.out.println("Sorting using Java7....");
	sortByJava7(list1);
	System.out.println("Sorting using Java8....");
	sortByJava8(list2);
}
	private static void sortByJava7(List<String> list1) {
		Collections.sort(list1, new Comparator<String>() {
						@Override
						public int compare(String o1, String o2) {
						return o1.compareTo(o2);
						}
		});
		System.out.println(list1);
	}
	
	private static void sortByJava8(List<String> list2) {
		Collections.sort(list2, (s1,s2)-> s1.compareTo(s2));
		System.out.println(list2);
	}
}
