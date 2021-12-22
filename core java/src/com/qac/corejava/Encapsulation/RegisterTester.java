package com.qac.corejava.Encapsulation;

public class RegisterTester {

	public static void main(String[] args) {
		
		Registration registration1 = new Registration();
		
		registration1.setName("karun");
		registration1.setEmail("karun@gmail");
		registration1.setUserid("karun123");
		registration1.setPassword("karunnnnn");
		
		System.out.println(registration1.getEmail());
		System.out.println(registration1.getUserid());

	}

}
