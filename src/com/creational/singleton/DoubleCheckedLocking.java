package com.creational.singleton;
/* Drawback : 
 * 1. It reduces the performance because of cost associated with the synchronized method
 */
public class DoubleCheckedLocking {
	private static DoubleCheckedLocking instance;
	private DoubleCheckedLocking() {}
	
	/*
	To avoid this extra overhead every time, double checked locking principle is used. 
	In this approach, the synchronized block is used inside the if condition with an additional
	check to ensure that only one instance of singleton class is created */
	public static DoubleCheckedLocking getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (DoubleCheckedLocking.class) {
	            if(instance == null){
	                instance = new DoubleCheckedLocking();
	            }
	        }
	    }
	    return instance;
	}

}
