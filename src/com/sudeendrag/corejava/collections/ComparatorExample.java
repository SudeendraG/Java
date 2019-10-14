package com.sudeendrag.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, Comparator.comparingInt((Student o) -> o.rollNo));

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, Comparator.comparing((Student o) -> o.name));

        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
}}



class Student
{
    int rollNo;
    String name, address;

    public Student(int rollno, String name,
                   String address)
    {
        this.rollNo = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return this.rollNo + " " + this.name +
                " " + this.address;
    }
}
