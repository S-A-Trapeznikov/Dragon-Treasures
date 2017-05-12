package com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl;

import com.epam.trapeznikau.bean.impl.AncientBook;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.CommandAncientBook;

public class SetType implements CommandAncientBook {

	@Override
	public AncientBook generalSet(AncientBook ancientBook, String text) {
		ancientBook.setType(text);
		return ancientBook;
	}

}
