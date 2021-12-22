package com.qac.corejava.Composition;

public class Engine {
	
	int enginecc;
	int noofcyliders;
	String enginetype;
	boolean cooling;
	int noofsparkplug;
	int enginespeed;
	
	

	public Engine(int enginecc, int noofcyliders, String enginetype, boolean cooling, int noofsparkplug,
			int enginespeed) {
		
		this.enginecc = enginecc;
		this.noofcyliders = noofcyliders;
		this.enginetype = enginetype;
		this.cooling = cooling;
		this.noofsparkplug = noofsparkplug;
		this.enginespeed = enginespeed;
	}

	public void starting() {
		System.out.println("engine is starting");
	}
	
	public void stop() {
		System.out.println("engine is stoped");
	}
	

}
