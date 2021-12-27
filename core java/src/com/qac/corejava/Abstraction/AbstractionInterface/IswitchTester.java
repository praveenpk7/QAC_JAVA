package com.qac.corejava.Abstraction.AbstractionInterface;

public class IswitchTester {

	public static void main(String[] args) {
	
		Iswitch impl = new LightIMPL();//UPCASTING(This means where the parent class can also be used in object for child class)
		
		impl.on();
		impl.off();
		
		FanIMPL fan = new FanIMPL();
		
		fan.on();
		fan.off();

	}

}
