package com.qac.corejava.StaticKeyword;

public class EmployeeTester {

	public static void main(String[] args) {
		
		System.out.println(Employee.companyname);//calling a static variable
		
		Employee.working();
	
		Employee employee1= new Employee();
		
		employee1.name="praveen";
		employee1.id=7;
		employee1.email="praveenkumar.msd.07@gmail.com";
		employee1.number=9900;
		
		
		
		employee1.displayemployeedetails();
		
Employee employee2= new Employee();
		
		employee2.name="kiran";
		employee2.id=8;
		employee2.email="nkumar.msd.07@gmail.com";
		employee2.number=7700;
		//employee2.companyname="infotech";
	   
		employee2.displayemployeedetails();

	}

}
