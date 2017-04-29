package com.epam.trapeznikau.service;

import java.util.List;

import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.dao.DAOFactory;

public class Operation implements ServiceOperation {

	@Override
	public Treasure mostExpensiveTreasure() {
		
		return null;
	}

	@Override
	public List<Treasure> searchListTreasureByName(Treasure treasure) {
		
		return null;
	}

	@Override
	public List<Treasure> searchListTreasureByPrice(float from, float until) {
		
		return null;
	}

	@Override
	public List<Treasure> searchListTreasureByMaterial(String material) {
		
		return null;
	}

	@Override
	public List<Treasure> searchListTreasureByWeight(float weight) {
		
		return null;
	}
	
	public List<Treasure> read() {
		DAOFactory factory = DAOFactory.getInstance();
		return factory.getSAXParser().read();
//		return factory.getSTAXParser().read();
		
	}

}
