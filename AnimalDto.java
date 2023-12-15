package com.xworkz.animal.dto;

import com.xworkz.animal.interfaces.AnimalEat;
import com.xworkz.animal.interfaces.AnimalTravel;

public class AnimalDto implements AnimalEat,AnimalTravel {

	@Override
	public void animalTravelingDetails() {
	System.out.println("The Traveling Details");
		
	}

	@Override
	public void animalEatingFoodDetails(String name) {
		System.out.println("Animal Eating Foods Details:"+name);
		
	}

}
