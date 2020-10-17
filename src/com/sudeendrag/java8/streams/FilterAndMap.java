package com.sudeendrag.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
*  Configure and processing are two steps in using the streams..
* */
public class FilterAndMap {
    public static void main(String[] args) {

        System.out.println("".isEmpty());
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(25);
        list.add(20);
        list.add(15);
        //filter , Predicate
        List<Integer> evenlist =list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenlist);
        //map , Function
        List<Integer> doublelist = list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(doublelist);

        Stream stream =list.stream();
    }
}
