package com.qac.corejava.StaticKeyword;

public class Employee {
	
	public int id;
	public String name;
	public String email;
	public long number;
	
	
	public static String companyname = "tesla";
	
	public void login() {
		System.out.println("employee login:"+name);
	}
	public static void working() {
		companyname="tesla";
		System.out.println("employee working:");
	}
    public void logout() {
	   System.out.println("employee logout:"+name);
		}
    
   public void displayemployeedetails() {
	   System.out.println("employee details");
	   System.out.println("name:"+name);
	   System.out.println("email:"+email);
	   System.out.println("number:"+number);
	   System.out.println("companyname:"+companyname);
	   
	   
   }

}
