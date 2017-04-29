package com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.dao.provider.impl.prciousfactory.CommandPrecious;

public class SetPrice implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setPrice(Float.valueOf(text));
		return prStone;
		
	}
	
}
