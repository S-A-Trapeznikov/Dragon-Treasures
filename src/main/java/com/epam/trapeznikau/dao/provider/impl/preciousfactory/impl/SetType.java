package com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl;

import com.epam.trapeznikau.bean.impl.PreciousStone;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.CommandPrecious;

public class SetType implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setType(text);
		return prStone;
		
	}
	
}
