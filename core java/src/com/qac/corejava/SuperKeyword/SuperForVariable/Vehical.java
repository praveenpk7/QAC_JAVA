package com.qac.corejava.SuperKeyword.SuperForVariable;

public class Vehical {
	
	public Vehical() {
		System.out.println("vehical object is created");
	}
	
	
	
	public Vehical(String model, String colour, int price) {
		System.out.println("vehical object is created with 3 parameter constructor");
		this.model = model;
		this.colour = colour;
		this.price = price;
	}



	String model;
	int speed=100;
	int gear=5;
	String colour;
	int price;
	
	public void start() {
		
		System.out.println("vehical is started");
		
	}

	public void stop() {
		
		System.out.println("vehical is stoped");
		
	}
	
	public void VehicalDetails() {
		System.out.println("model:"+model);
		System.out.println("colour:"+colour);
		System.out.println("price:"+price);
		
	}
}
