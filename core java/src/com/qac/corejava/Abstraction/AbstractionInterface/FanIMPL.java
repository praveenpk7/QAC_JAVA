package com.qac.corejava.Abstraction.AbstractionInterface;

public class FanIMPL implements Iswitch{

	@Override
	public void on() {
		System.out.println("fan is on:"+voltage);
		
	}

	@Override
	public void off() {
		System.out.println("fan is off");		
	}

}
