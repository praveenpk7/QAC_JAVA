package com.qac.corejava.FinalKeyword.FinalMethod;

public class RBIBank {

	String branch;
	String ifsccode;
	
	public final void printnotes() { //final method cannot override this method)
		
		System.out.println("RBI printing notes");
		
	}
}
