package com.epam.trapeznikau.controller.impl.treasurefactory.impl;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.controller.impl.treasurefactory.CommandPrecious;

public class SetWeight implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setWeight(Float.valueOf(text));
		return prStone;
		
	}
	
}
