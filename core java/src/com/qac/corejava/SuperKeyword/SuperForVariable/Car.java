package com.qac.corejava.SuperKeyword.SuperForVariable;

public class Car extends Vehical {
	
	int speed = 200;
	
public Car() {
		super();// refer the parent class default constructor //implicitly
		System.out.println("car object is created");
		
}

public Car(String model, String colour, int price) {
	super(model,colour,price);//call the Vehical class 3 parameter constructor
	System.out.println("car object is created with parameter");
	
}
public void start() {
	    super.start();
		System.out.println("car is started");//Super keyword is used call method
		
}
		

	public void maximumspeed() {
		
		System.out.println("maximum speed="+this.speed);//here 'this' keyword is used to call current child class speed
	}


       public void minimumspeed() {
		
		System.out.println("minimum speed="+super.speed);//here 'super' keyword  is used to call parent class speed
	}
       
       public void checkgear() {
   		super.start();//super keyword used to call method.....praveen
   		System.out.println("default gear="+super.gear);//here 'super' keyword  is used to call parent class gear
   	}
}


