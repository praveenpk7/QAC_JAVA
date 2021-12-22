package com.qac.corejava.Inheritance.Hierarchical;

public class Product {
	
	String name; 
	int id;
	double price;
	String colour;
	double weight;
	
	public void getproductdetails() {
		
		System.out.println("----product details-----");
		System.out.println("product name:"+name);
		System.out.println("product id:"+id);
		System.out.println("product price:"+price);
		System.out.println("product colour:"+colour);
		System.out.println("product weight:"+weight);
		
	}
	
	
	public void getavailability(int available) {
		
		System.out.println("no of product available:"+available);
	}

}
