package com.qac.corejava.Abstraction.AbstractKeyword;

public class BankTester {

	public static void main(String[] args) {
	
		//RBIBANK bank = new RBIBANK();//we can not create object of abstract class
		
		HDFCBANK bank = new HDFCBANK();

		bank.fixedinterest();
		
		Kotak kotakbank = new Kotak();
		
		kotakbank.fixedinterest();
	}

}
