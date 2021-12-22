package com.qac.corejava.MethodOverriding;

public class AnimalTester {

	public static void main(String[] args) {
	
		Cow cow = new Cow();
		cow.eating();
		cow.sleeping();
		
		Lion lion = new Lion();
		lion.eating();
		lion.sleeping();
		

	}

}
