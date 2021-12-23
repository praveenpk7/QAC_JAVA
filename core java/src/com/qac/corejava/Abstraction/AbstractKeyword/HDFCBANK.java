package com.qac.corejava.Abstraction.AbstractKeyword;

public class HDFCBANK extends RBIBANK{
	
	
public HDFCBANK() {
		
		System.out.println("HDFCBANK  bank called");//constructor
	}
	
	
	public void fixedinterest() {//abstract method is override
		
		System.out.println("HDFC will give 8% interest");
		
	}
	
}
