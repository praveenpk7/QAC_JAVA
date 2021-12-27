package com.qac.corejava.Abstraction.AbstractionInterface;

public class LightIMPL implements Iswitch {

	@Override
	public void on() {
         System.out.println("light is on:"+voltage);
		
	}

	@Override
	public void off() {
		System.out.println("light is off");
		
	}
	
	

}
