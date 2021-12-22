package com.qac.corejava.Composition;

public class CarTester {

	public static void main(String[] args) {
	
		Engine engine = new Engine(200, 4, "v", false, 2, 100);
		
		Car car = new Car("maruthi", "petrol", 100, "gold", 4, false, engine);
		
		car.enginedetails();
		car.starting();
		car.stop();
		
	}

}
