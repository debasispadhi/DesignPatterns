package com.creational.singleton;

/*to stop refelction to break the Singleton*/
public enum EnumSingleton {
	INSTANCE;
	public static void invokeAnyMethods(){
		System.out.println("method calls via EnumSingleton");
	}
}
class Test{
	public static void main(String[] args) {
		EnumSingleton.INSTANCE.invokeAnyMethods();
	}
	
}