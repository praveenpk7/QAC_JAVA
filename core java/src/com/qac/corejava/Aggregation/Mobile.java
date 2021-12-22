package com.qac.corejava.Aggregation;

public class Mobile {

	String brand;
	String colour;
	double price;
	float battery;
	String proccer;

	HeadPhone headphone;//taking another object as a Reference(property). headphone is non primitive data(user defined class)
	
	
	public void calling() {
		System.out.println("calling...");
	}
	
	public void listeningmusic() {
		headphone.connection();
		headphone.listeningsound();
	
	}
	
	public void headphonedetails() {
		
		System.out.println("---headphone details---");
		System.out.println("brand:"+headphone.brand);
		System.out.println("colour:"+headphone.colour);
		System.out.println("wired:"+headphone.iswired);
		
	}
	
}
