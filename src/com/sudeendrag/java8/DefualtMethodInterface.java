package com.sudeendrag.java8;

public interface DefualtMethodInterface {

	
	/* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void sendEmail(){  
        System.out.println("Sending Email via Default Method....");  
        
    }  
    
    void getResults(String str);  
    
}

