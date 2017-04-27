package com.epam.trapeznikau.controller.impl.treasurefactory.impl;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.controller.impl.treasurefactory.CommandPrecious;

public class SetPrice implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setPrice(Float.valueOf(text));
		return prStone;
		
	}
	
}
