package com.qac.corejava.Inheritance.SingleInheritance;

public class Mobile {
	
	String brand;
	String colour;
	int ram;
	int rom;
	float cameraMP;
	String battery;
	
	public void calling() {
		System.out.println("calling from mobile");
	}
	
	public void messaging() {
		System.out.println("messaging from mobile");
	}
	
	public void capturing() {
		System.out.println("captiuring from mobile");
	}
	
   public void displaymobiledetails() {
	   
	   System.out.println("mobile details");
	   System.out.println("brand="+this.brand);
	   System.out.println("colour="+this.colour);
	   System.out.println("ram="+this.ram);
	   System.out.println("rom="+this.rom);
	   System.out.println("camera MP="+this.cameraMP);
	   System.out.println("battery capacity="+this.battery);
   }
}
