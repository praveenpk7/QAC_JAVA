package com.qac.corejava.Abstraction.Factory;

public class CompacIMPL implements ILaptop {

	@Override
	public void switchon() {
		System.out.println("compac laptop is switched on");
		
	}

	@Override
	public void use() {
		System.out.println("compac laptop is used");
		
	}

	@Override
	public void shutdoown() {
		System.out.println("Compac laptop is shutdown");
		
	}

}
