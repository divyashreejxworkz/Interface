package com.xworkz.animal.interfaces;

public interface AnimalTravel {
	String travelingPlace="Banavaara";
	public void animalTravelingDetails();
	 public static void travel(String travelingPlace) {
		 System.out.println("travel Details:"+travelingPlace);
	 }
		 default void travelling() {
			 System.out.println("This is default method");
			 }
		 }

