package com.creational.singleton;

/*
1. This way is good when memory is the concern
private static inner class that contains the instance of the singleton class, 
When the singleton class is loaded, inner class is not loaded into memory and 
only when someone calls the getInstance method, this class gets loaded and 
creates the Singleton class instance.

2. This approach doesn’t require synchronization to make Singleton thread safe
*/
public class InnerClassSingleton {

private InnerClassSingleton(){}
    
    private static class InnerClass{
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
    
    public static InnerClassSingleton getInstance(){
        return InnerClass.INSTANCE;
    }

}
