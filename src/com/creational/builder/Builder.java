package com.creational.builder;
public interface Builder {
    public void setAccountType(String type);
    public void setPersonalDetails(User user);
    public void generateAccountNumber();  
}