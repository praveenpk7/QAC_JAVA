package com.qac.corejava.Inheritance.MultipleInheritance.UsingInterface;

public class Student implements Ijava,Isql {

	@Override
	public void learning() {
		System.out.println("student learining both java and sql");
		
	}

	@Override
	public void mysql() {
		System.out.println("student learining mysql");
		
	}

	@Override
	public void corejava() {
		System.out.println("student learining corejava");
		
	}

}
