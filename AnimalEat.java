package com.xworkz.animal.interfaces;

public interface AnimalEat {
	String name="Cow";
	String age="10years";
	String eatingFood="Banana";
	 public void animalEatingFoodDetails(String name);
	 public static void eatFood(String age,String eatingFood) {
		 System.out.println("Animal Details:"+age+""+eatingFood);
	 }
		 default void eating() {
			 System.out.println("This is default method");
			 }
		 }
	 


