package com.qac.corejava.Inheritance.SingleInheritance;

public class AppleMobileTester {

	public static void main(String[] args) {
	
   AppleMobile applemobile = new AppleMobile();
   
   applemobile.displaymobiledetails();
   
   //parent class properties
   applemobile.brand= "apple 5";
   applemobile.colour= "gold";
   applemobile.cameraMP= 64;
   applemobile.battery= "5000 mah";
   
   //child class methods
   System.out.println("IOS:"+applemobile.ios);
   System.out.println("Ear phone jack:"+applemobile.earphonejack);

   //parent class method
   applemobile.calling();
   applemobile.messaging();
   
   applemobile.hdrecording();//child class method
   
   Mobile m = new Mobile();
  // m.hd recording();// cannot access from parent object
	}

}
