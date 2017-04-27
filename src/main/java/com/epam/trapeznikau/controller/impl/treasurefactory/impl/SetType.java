package com.epam.trapeznikau.controller.impl.treasurefactory.impl;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.controller.impl.treasurefactory.CommandPrecious;

public class SetType implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setType(text);
		return prStone;
		
	}
	
}
