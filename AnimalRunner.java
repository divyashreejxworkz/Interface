package com.xworkz.animal.runner;

import com.xworkz.animal.dto.AnimalDto;
import com.xworkz.animal.interfaces.AnimalEat;
import com.xworkz.animal.interfaces.AnimalTravel;

public interface AnimalRunner {
	public static void main(String[] args) {
		AnimalDto a=new AnimalDto();
		a.animalEatingFoodDetails("Cow");
		a.animalTravelingDetails();
		a.travelling();
		a.eating();
		//we can access static method using the interfaceName
		AnimalEat.eatFood("7Years","Banana");
		AnimalTravel.travel("Banavaara");
		
	}
}
