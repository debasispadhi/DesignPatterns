package com.creational.factory;
public class ProductFactory {

    //use getShape method to get object of type shape
    public Product getProduct(String productType) {
        if (productType == null) {
            return null;
        } else if (productType.equalsIgnoreCase("PSTN")) {
            return new PSTN();
        } else if (productType.equalsIgnoreCase("Broadband") || productType.equalsIgnoreCase("BB")) {
            return new Broadband();
        } else if (productType.equalsIgnoreCase("TV") || productType.equalsIgnoreCase("Vision")) {
            return new TV();
        } else if (productType.equalsIgnoreCase("Mobile")) {
            return new Mobile();
        }

        return null;
    }
 }