package com.qac.corejava.Inheritance.Hierarchical;

public class ProductTester {

	public static void main(String[] args) {
	
		Television television = new Television();
		
		//properties of parent class
		television.name="sony";
		television.id = 1;
		television.colour= "gold";
		television.price=12000;
		
		//property of child television
		television.smart_tv = true;
		
		//methods of parent class product
		television.getproductdetails();
		television.getavailability(700);

		television.onlinestreaming();
		
		Cooker cooker = new Cooker();
		
		//properties of parent class through child class cooker
				cooker.name="pressure cooker";
				cooker.id = 2;
				cooker.colour= "silver";
			    cooker.price=2000;
			    
			    cooker.liter=5;
			    
			  //methods of parent class product through child class cooker
				cooker.getproductdetails();
				cooker.getavailability(100);
				
				

                Sunglass sunglass =  new Sunglass();
           
				//properties of parent class through child class sunglass
						sunglass.name="sun avatar";
						sunglass.id = 3;
						sunglass.colour= "multi colour";
					    sunglass.price=5000;
					    
					    sunglass.sunprotection=true;
					    
					  //methods of parent class product through child class sunglass
						sunglass.getproductdetails();
						sunglass.getavailability(500);
			    
	}

}
