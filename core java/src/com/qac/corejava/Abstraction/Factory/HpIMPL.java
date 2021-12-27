package com.qac.corejava.Abstraction.Factory;

public class HpIMPL implements ILaptop{

	@Override
	public void switchon() {
		System.out.println("HP laptop is switched on");
		
		
	}

	@Override
	public void use() {
		System.out.println("HP laptop is used");	
		
	}

	@Override
	public void shutdoown() {
		System.out.println("HP laptop is shutdown");
		
	}

}
