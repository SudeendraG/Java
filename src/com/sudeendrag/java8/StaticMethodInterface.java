package com.sudeendrag.java8;

public interface StaticMethodInterface {

	
	/* This is a static method. Static method in interface is
     * similar to default method except that we cannot override 
     * them in the implementation classes.
     * Similar to default methods, we need to implement these methods
     * in implementation classes so we can safely add them to the 
     * existing interfaces.
     */
    static void sendNotification(){  
        System.out.println("Sending Email via Default Method....");  
    }  
    
    
    
	/* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void sendEmail(){  
        System.out.println("Sending Email via Default Method....");  
        
    }  
    void getReoprt(String str);  
}

