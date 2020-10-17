package com.sudeendrag.puzzles;

/*when there is exactly one pair of overloaded method 
and one of them has a parameter type Object then the 
compiler will always select the method with more specific type. 
	But when there is more than one specific type, 
then the compiler throws an ambiguous method error.*/

public class OvverloaingTricky {

	public void add(String str) {
		System.out.println("String Type "+str);
	}
	
	/*public void add(Integer obj) {
		System.out.println("Object Type "+obj);
	}*/
	
	public void add(Object obj) {
		System.out.println("Object Type "+obj);
	}
	
	
 
	
	public static void main(String[] args) {
		OvverloaingTricky ov = new OvverloaingTricky();
		//ov.add((Integer)null);
		ov.add(null);
		Object obj=null;
		ov.add(obj);
		
		
	}
}
