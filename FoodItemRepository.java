package com.xworkz.food.repository;

public interface FoodItemRepository {
	boolean onSave(String foodName);
	String[] read();
	}
