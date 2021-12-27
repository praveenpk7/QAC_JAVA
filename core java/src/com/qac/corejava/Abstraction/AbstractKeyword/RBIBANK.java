package com.qac.corejava.Abstraction.AbstractKeyword;

public abstract class RBIBANK {// abstract class
	
	
	int interest = 8;
	
	public RBIBANK () {
		
		System.out.println("RBI bank called");//constructor
	}
	
	public abstract void fixedinterest();//abstract method(method without body)
	
 
}
