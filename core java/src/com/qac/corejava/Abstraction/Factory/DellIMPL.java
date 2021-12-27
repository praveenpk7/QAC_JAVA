package com.qac.corejava.Abstraction.Factory;

public class DellIMPL implements ILaptop {

	@Override
	public void switchon() {
		System.out.println("dell laptop is switched on");
		
	}

	@Override
	public void use() {
		System.out.println("dell laptop is used");		
	}

	@Override
	public void shutdoown() {
	System.out.println("dell laptop is shutdown");
		
	}

}
