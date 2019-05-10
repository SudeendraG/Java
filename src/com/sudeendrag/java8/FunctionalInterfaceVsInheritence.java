package com.sudeendrag.java8;

//valid only if child doesn't contain any abstract methods
//
@FunctionalInterface
public interface FunctionalInterfaceVsInheritence extends FunctionalInterfaceExampleJava8 {
	//if you are using same name it is valid
	boolean isFunctional(boolean isfunctional);
}
