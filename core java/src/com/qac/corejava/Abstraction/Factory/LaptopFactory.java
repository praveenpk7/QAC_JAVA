package com.qac.corejava.Abstraction.Factory;

public class LaptopFactory {

	public static ILaptop getLaptop(String BrandName) {
		
		if (BrandName.equalsIgnoreCase("dell laptop")) {
			DellIMPL dellimpl = new DellIMPL();//first object is created
			return dellimpl;                  // then the return the value(this can done in single that shown in object)
		}
		
		else if (BrandName == "hp laptop") { // this is also right '=='
			//HpIMPL hpimpl = new HpIMPL();
			return new HpIMPL();            //This is the another way of creating the object in simple way.
		}
		
		else if (BrandName.equalsIgnoreCase("compac laptop")) {//'equalsIgonrecase' is used to avoid case sensitive.
			CompacIMPL compacimpl = new CompacIMPL();
			return compacimpl;
		}
		
		else {
			System.out.println(BrandName+"laptop is not available");
			return null;
		}
	}
}
