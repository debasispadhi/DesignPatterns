package com.creational.singleton;

/* Drawback : 
 * 1. Instance is created even though client application might not be using it*/
public class StaticBlockInitialization {
private static StaticBlockInitialization instance;
    
    private StaticBlockInitialization(){}
    
    //Static Block Initialization for exception handling
    static{
        try{
            instance = new StaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("instance not able to create ");
        }
    }
    
    public static StaticBlockInitialization getInstance(){
        return instance;
    }

}
