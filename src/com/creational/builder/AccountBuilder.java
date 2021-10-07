package com.creational.builder;
public class AccountBuilder implements Builder{
	private String type;
    private User user;
    private long accountNumber;

	@Override
	public void setAccountType(String type) {
		this.type=type;
	}

	@Override
	public void setPersonalDetails(User user) {
		
		
	}

	@Override
	public void generateAccountNumber() {
		long accountNumber = 12341234;
		this.accountNumber=accountNumber+1;
	}
   
}