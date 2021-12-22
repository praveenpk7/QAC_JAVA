package com.qac.corejava.Encapsulation;

public class BankAccount {

	//data member
	private long accountnumber;
	private String ifsc;
	private String branch;
	private double balance;
	
	
	public String name; 
	public String email;
	private String dob;
	
	public BankAccount (String name,String email,String dob,double balance,String branch) {
		System.out.println("inside 5 parameters");
		this.name=name;
		this.email=email;
		this.dob=dob;
	    this.balance=balance;
	    this.branch=branch;
	    
	    this.accountnumber=12345;
	    this.ifsc="asdfg";
	}
	
	//member function
	public void createaccount() {
		System.out.println("creating a bank account");
	}
	public void withdraw() {
		System.out.println("withdraw ammount");
	}
	
	public void deposite() {
		System.out.println("deposit ammount");
	}
	
	//geter method
	public double getbalance() {
		return this.balance;
	}
	
	public long getaccountnumber() {
		return this.accountnumber;
	}
	
	public String getifsc() {
		return this.ifsc;
	}
	
	public String getbranch() {
		return this.branch;
	}
	public String getdob() {
		return this.dob;
	}
	//setter method
	public void setdob(String dob) {
		this.dob="dob";
		
}
}
