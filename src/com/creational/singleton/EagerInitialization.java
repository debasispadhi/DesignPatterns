package com.creational.singleton;
/* Drawback : 
 * 1. This method doesn’t provide any options for exception handling.
 * 2. Instance is created even though client application might not be using it.*/

public class EagerInitialization {
private static final EagerInitialization instance = new EagerInitialization();
    
    //private constructor
    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return instance;
    }
}