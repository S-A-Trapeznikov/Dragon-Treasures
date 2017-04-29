package com.epam.trapeznikau.dao.provider;

import com.epam.trapeznikau.bean.Treasure;

public class WrongRequest implements TreasureFactory {

	@Override
	public void fill(String node, String command, String text){}

	@Override
	public Treasure getTreasure() {		
		return null;
	}

}
