package com.qac.corejava.Abstraction.Factory;

public class LaptopTester {

	public static void main(String[] args) {
		
	//	DellIMPL dell = new DellIMPL(); (In before examples we doing this for object creation)

		String laptopbrand = "DEll laptop";
		
		ILaptop laptopobject = LaptopFactory.getLaptop(laptopbrand);
		
		//laptopobject.switchon();
		
		//laptopobject.use();
		
		//laptopobject.shutdoown();
		
		if (laptopobject != null ) { // use this block to avoid exception when you call the other than availability
			
			laptopobject.switchon();
			
			laptopobject.use();
			
			laptopobject.shutdoown();
		}
		
		
		
		
	}

}
