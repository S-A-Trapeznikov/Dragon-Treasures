package com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl;

import com.epam.trapeznikau.bean.impl.PreciousStone;
import com.epam.trapeznikau.dao.provider.impl.prciousfactory.CommandPrecious;

public class SetWeight implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setWeight(Float.valueOf(text));
		
		return prStone;
		
	}
	
}
