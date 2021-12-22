package com.qac.corejava.Encapsulation;

public class BankAccountTester {
	
	public static void main(String[] args){

	BankAccount account1 = new BankAccount("praveen","praveen@gmail","20/20/2020",1000.00,"mg road");
	
	account1.name="praveen";
	account1.email="praveenkumar@gamil";
	
	account1.setdob("10/20/2121");
	
	System.out.println(account1.email);
	
	System.out.println(account1.getbalance());
	System.out.println(account1.getbranch());
	System.out.println(account1.getdob());
	
	}
	
}
