package com.sudeendrag.java8.streams;

import java.util.ArrayList;
import java.util.List;

// sorted() method will be used t
public class SortingInStreams {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<Integer>() {{
            add(12);
            add(45);
            add(100);
            add(20);
        }};
        Integer min = integerArrayList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        Integer max = integerArrayList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        long length = integerArrayList.stream().count();
        System.out.println("length : " + length);
        System.out.println("min : " + min + "\nmax : " + max);
        //integerArrayList.stream().forEach(i-> System.out.println(i));
        integerArrayList.stream().forEach(System.out :: println);

    }
}
