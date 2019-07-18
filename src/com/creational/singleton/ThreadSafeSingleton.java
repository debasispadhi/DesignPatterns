package com.creational.singleton;

/* Drawback : 
 * 1. It reduces the performance because of cost associated with the synchronized method, although
 *  we need it only for the first few threads who might create the separate instances 
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {}

	/*add synchronized to make it threadsafe */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

}
