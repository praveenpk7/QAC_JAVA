package com.qac.corejava.Aggregation;

public class MobileTester {

	public static void main(String[] args) {
		System.out.println("main method ended");
		
		HeadPhone headphone = new HeadPhone();
		
		headphone.brand = "boat";
		headphone.colour = "blue";
		headphone.iswired = true;	
		
		Mobile mobile = new Mobile();
		
		mobile.brand = "samsung";
		mobile.colour = "red";
		mobile.price = 25000;
		mobile.proccer = "snapdragon";
		mobile.headphone = headphone;
		
		mobile.headphonedetails();
		mobile.listeningmusic();
		
		System.out.println("main method ended");
		

	}

}  
