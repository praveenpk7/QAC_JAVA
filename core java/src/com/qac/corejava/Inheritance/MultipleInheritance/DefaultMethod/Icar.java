package com.qac.corejava.Inheritance.MultipleInheritance.DefaultMethod;

public interface Icar extends DiamondproblemIVehical{
	
	@Override
    default void driving() {//abstract will not allow method body but by using 'default' can achieve the method body in abstract.
    	
    	System.out.println("Driving the car");
	
    	
	
}

}
