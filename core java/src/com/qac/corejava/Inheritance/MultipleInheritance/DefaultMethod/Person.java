package com.qac.corejava.Inheritance.MultipleInheritance.DefaultMethod;

public class Person implements Icar,Ibike {

	@Override
	public void driving() {
		
		System.out.println("---driving---");//own implementation can also provided
		
		Icar.super.driving();//calling the particular method from particular parent class
		
		Ibike.super.driving();//calling the particular method from particular parent class
	}

}
