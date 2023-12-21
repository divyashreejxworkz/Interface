package com.xworkz.food.service;

public interface FoodItemService {
	boolean validateAndSave(String foodName);
	boolean isExists(String foodName);

}
