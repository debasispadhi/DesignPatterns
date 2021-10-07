package com.creational.builder;
public class AccountBuilderTest {
    public static void main(String[] args) {
        Account acc= new Account.AccountBuilder("Debasis", "Padhi").build();
        System.out.println(acc);

    }
}