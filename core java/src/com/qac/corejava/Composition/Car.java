package com.qac.corejava.Composition;

public class Car {

	String brand ;
	String fueltype;
	double price;
	String colour;
	double noofdoors;
	boolean isautomatic;
	
	final Engine engine;
	
	
	public Car(String brand, String fueltype, double price, String colour, double noofdoors, boolean isautomatic,
			Engine engine) {
		this.brand = brand;
		this.fueltype = fueltype;
		this.price = price;
		this.colour = colour;
		this.noofdoors = noofdoors;
		this.isautomatic = isautomatic;
		this.engine = engine;
	}

	public void starting () {
		engine.starting();
		System.out.println("car is starting");
	}
	public void driving() {
		System.out.println("car is running");
	}
	public void stop() {
		engine.stop();
		System.out.println("car is stoped");
	}
	
	public void enginedetails() {
		
		System.out.println("---engine details---");
		System.out.println("enginecc:"+engine.enginecc);
		System.out.println("noofcylinders:"+engine.noofcyliders);
		System.out.println("enginetype:"+engine.enginetype);
		System.out.println("cooling:"+engine.cooling);
		System.out.println("noofsparkplug:"+engine.noofsparkplug);
		System.out.println("enginespeed:"+engine.enginespeed);
		
	}
	
}
