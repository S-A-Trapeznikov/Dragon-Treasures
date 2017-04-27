package com.epam.trapeznikau.controller.impl.treasurefactory.impl;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.controller.impl.treasurefactory.CommandPrecious;

public class SetId implements CommandPrecious{

	@Override
	public PreciousStone generalSet(PreciousStone prStone, String text) {
		prStone.setId(Integer.valueOf(text));
		System.out.println(prStone.getId());
		return prStone;
		
	}
	
}
