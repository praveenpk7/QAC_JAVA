package com.qac.corejava.MethodOverriding;

public class Lion extends Animal {
	
	String foodtype = "non - veg";
	
	public void eating() {
		System.out.println("Lion is eating meat");//method overriding
	}
	
	public void sleeping() {
		System.out.println("Lion is sleeping");//method overriding
	}

}
