package com.xworkz.food.service;

import com.xworkz.food.repository.FoodItemRepository;

public class FoodItemsServiceImplementation implements FoodItemService {
private FoodItemRepository repository;
public FoodItemsServiceImplementation(FoodItemRepository repository) {
	this.repository=repository;
}
	@Override
	public boolean validateAndSave(String foodName) {
	if(foodName.isEmpty()||
			foodName.isBlank()||
			foodName.length()<3 && 
			foodName.length()>25||foodName==null) {
	System.out.println("Give the correct name");
	}else {
		boolean exist=isExists(foodName);
		if(exist!=true) {
			boolean save=repository.onSave(foodName);
			if(save) {
				System.out.println("added food succesfully");
				return true;
			}else {
				System.out.println("not added food succesfully");
				return false;
			}
			}
		return false;
	}
	return false;
	
	}

	@Override
	public boolean isExists(String foodName) {
		String[] food=repository.read();
		if(food !=null && foodName != null) {
			for(String name:food) {
				if(name!=null) {
					if(name.equals(food)) {
						return true;
						
					}
				}
			}
		}
		return false;
	}

}
