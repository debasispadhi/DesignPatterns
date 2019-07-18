package com.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionDestroySingleton {
	public static void main(String[] args) {
		EagerInitialization instance1 = EagerInitialization.getInstance();
		EagerInitialization instance2 = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }


}
