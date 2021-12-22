package com.qac.corejava.Inheritance.Multi;

public class AnimalTester {

	public static void main(String[] args) {
		
		BabyDog babydog = new BabyDog();
		
		System.out.println(babydog.age);
		System.out.println(babydog.loyal);

		String name= babydog.name ="baby dog";
		             babydog.legs= 4;
		             babydog.breed="lab";
		             babydog.colour="brown";
		
		babydog.drinkingmilk(name);
		babydog.barking(name);
		babydog.walking(name);
	}

}
