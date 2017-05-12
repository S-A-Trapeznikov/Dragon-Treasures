package com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl;

import com.epam.trapeznikau.bean.impl.PreciousStone;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.CommandPrecious;

public class SetDiameter implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setDiameter(Float.valueOf(text));
		return prStone;
		
	}
	
}
