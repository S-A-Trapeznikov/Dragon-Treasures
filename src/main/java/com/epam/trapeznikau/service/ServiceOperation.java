package com.epam.trapeznikau.service;

import java.util.List;

import com.epam.trapeznikau.bean.Treasure;

public interface ServiceOperation {
	
	Treasure mostExpensiveTreasure();
	List<Treasure> searchListTreasureByName(Treasure treasure);
	List<Treasure> searchListTreasureByPrice(float from, float until);
	List<Treasure> searchListTreasureByMaterial(String material);
	List<Treasure> searchListTreasureByWeight(float weight);

}
