package com.epam.trapeznikau.dao.provider;

import com.epam.trapeznikau.bean.Treasure;

public interface TreasureFactory {
	
	void fill(String currentNode, String childrenNode, String textchldrenNode);
	
	Treasure getTreasure();

}
