package com.creational.factory;
public class PSTN implements Product {
	@Override
	public void selectProduct() {
		System.out.println("You are selected a PSTN Product");
	}
}