package com.xworkz.food.runner;

import com.xworkz.food.repository.FoodItemRepository;
import com.xworkz.food.repository.FoodItemRepositoryImplementation;
import com.xworkz.food.service.FoodItemService;
import com.xworkz.food.service.FoodItemsServiceImplementation;

public class FoodItemRunner {
	public static void main(String[] args) {
	FoodItemRepository repository = new FoodItemRepositoryImplementation();
	FoodItemService service = new FoodItemsServiceImplementation(repository);
	service.validateAndSave("Biriyani");
	service.validateAndSave("veg");
	//service.isExists("veg");
	}

}
