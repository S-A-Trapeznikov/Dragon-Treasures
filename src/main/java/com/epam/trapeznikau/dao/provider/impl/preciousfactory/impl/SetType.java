package com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.dao.provider.impl.prciousfactory.CommandPrecious;

public class SetType implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setType(text);
		return prStone;
		
	}
	
}
