package com.sudeendrag.puzzles;

// Checked and Unchecked Propagation
public class ConstructorThrows {

	ConstructorThrows(int id) throws RuntimeException {
		if(id<=0)
			throw new IllegalArgumentException("Id should be greater than zero");
	 System.out.println("In ConstructorThrows");
	}
	
	public static void main(String[] args) {
 	try {
			ConstructorThrows ct = new ConstructorThrows(0);
			ConstructorThrows ct1 = new ConstructorThrows(2);
		}
		catch(Exception e) {
			System.out.println("Exception Occured..");
		}
		
	}
}
