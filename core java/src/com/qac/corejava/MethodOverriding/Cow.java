package com.qac.corejava.MethodOverriding;

public class Cow extends Animal {
	
	String foodtype = "veg";
	
	public void eating() {
		System.out.println("cow is eating wheat");//method overriding
	}
	
	public void sleeping() {
		System.out.println("Cow is sleeping");//method overriding
	}

}
