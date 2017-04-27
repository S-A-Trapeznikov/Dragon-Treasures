package com.epam.trapeznikau.controller;

import com.epam.trapeznikau.bean.Treasure;

public interface TreasureFactory {
	
	void fill(String node, String command, String text);
	
	Treasure getTreasure();

}
