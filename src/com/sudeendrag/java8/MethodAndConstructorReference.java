package com.sudeendrag.java8;

public class MethodAndConstructorReference {

    MethodAndConstructorReference() {
        System.out.println("Constructor");
    }
    // :: instead of lambda expressions we can go fro method reference for providing implementation for functional interface
    // Both methods should have same arguments type to apply method reference.
    // note : Arguments type must be matched for both method and constructor reference
    public static void main(String[] args) {
        // ClassName::method name for static methods
        Interf i1=MethodAndConstructorReference ::m2;
        i1.m1();
        MethodAndConstructorReference mcr = new MethodAndConstructorReference();
        // object reference for instance methods
        Interf i2 = mcr :: m3;
        i2.m1();

        // Create new Thread with Method Reference
        Runnable runnable = mcr::runnableImplementation;
        Thread t1 = new Thread(runnable);


        // constructor reference
        Interf2 interf2 =MethodAndConstructorReference ::new;
        MethodAndConstructorReference methodAndConstructorReference =interf2.getObject();
    }

    public static void m2(){
        System.out.println("Method Reference from m2..");
    }

    public  void m3(){
        System.out.println("Method Reference from m3..");
    }

    public void runnableImplementation() {
        for(int i=0;i<10;i++) {
             System.out.println("Thread runnable..");
        }
    }
}

interface Interf {
 public void m1();
}

interface  Interf2 {
    public  MethodAndConstructorReference getObject();
}

