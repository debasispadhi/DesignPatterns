package com.creational.singleton;

public class EagerInitializationTest {
	public static void main(String[] args) {
		MyNonSingleton myNonSingleton1 = new MyNonSingleton();	
		MyNonSingleton myNonSingleton2 = new MyNonSingleton();
		/*like this we can not write
		MySingleton mySingleton = new MySingleton();*/
		
		//create instance by calling the getInstance() method only
		EagerInitialization instace1 = EagerInitialization.getInstance();
		EagerInitialization instance2 = EagerInitialization.getInstance();
		
		
		System.out.println(myNonSingleton1.hashCode());
		System.out.println(myNonSingleton2.hashCode());
		
		System.out.println(instace1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
