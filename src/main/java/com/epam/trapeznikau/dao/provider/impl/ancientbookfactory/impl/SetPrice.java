package com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl;

import com.epam.trapeznikau.bean.impl.AncientBook;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.CommandAncientBook;

public class SetPrice implements CommandAncientBook {

	@Override
	public AncientBook generalSet(AncientBook ancientBook, String text) {
		ancientBook.setPrice(Float.valueOf(text));
		return ancientBook;
	}

}
