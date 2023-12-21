package com.xworkz.food.repository;

public class FoodItemRepositoryImplementation implements FoodItemRepository {
private String[] food=new String[3];
private int index=0;
	@Override
	public boolean onSave(String foodName) {
		if(food==null||index>=food.length) {
		System.out.println("Array is null or check the length");
		}else {
			if(index<food.length) {
				food[index]=foodName;
				index++;
				return true;
				}
		}
		return false;
	}

	@Override
	public String[] read() {
		return food;
	}

}
