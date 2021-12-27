package com.qac.corejava.Abstraction.AbstractionInterface;

public interface Iswitch {
	
	String voltage = "200v";

	void on();
	void off();// by default methods are public and abstract.at the time of compile it internally calls the public and abstract.

}
