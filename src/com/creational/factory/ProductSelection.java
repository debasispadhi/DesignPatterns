package com.creational.factory;

public class ProductSelection {
	 public static void main(String[] args) {
	      ProductFactory ProductFactory = new ProductFactory();

	      //get an object of PSTN.
	      Product pstnProduct = ProductFactory.getProduct("PSTN");
	      pstnProduct.selectProduct();

	      //get an object of Broadband.
	      Product broadbandProduct = ProductFactory.getProduct("Broadband");
	      broadbandProduct.selectProduct();

	      //get an object of TV.
	      Product tvProduct = ProductFactory.getProduct("TV");
	      tvProduct.selectProduct();
	      
	      //get an object of Mobile.
	      Product mobileProduct = ProductFactory.getProduct("Mobile");
	      mobileProduct.selectProduct();
	   }
}

