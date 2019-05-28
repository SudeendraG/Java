package com.sudeendrag.puzzleprograms;

/*A return statement inside a finally block will
		cause any exception that
		might be thrown in the try or catch 
		block to be discarded.
		
		We can write the return statement in a 
				finally block and it will override the other return value.*/
public class ReturnPuzzle1 {
	public static boolean isValid() { 
		try { 
			return true;
		}
		finally {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(ReturnPuzzle1.isValid());
	}
	
	// WHEN FINALLY BLOCK WONT EXECUTE ... ???
	/*
	 * The only times finally won't be called are:

If you invoke System.exit()
If the JVM crashes first
If the JVM reaches an infinite loop (or some other non-interruptable, non-terminating statement) in the try or catch block
If the OS forcibly terminates the JVM process; e.g., kill -9 <pid> on UNIX
If the host system dies; e.g., power failure, hardware error, OS panic, et cetera
If the finally block is going to be executed by a daemon thread and all other non-daemon threads exit before finally is called
	 
	   */
}
