package com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl;

import com.epam.trapeznikau.bean.impl.AncientBook;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.CommandAncientBook;

public class SetLanguage implements CommandAncientBook {

	@Override
	public AncientBook generalSet(AncientBook ancientBook, String text) {
		ancientBook.setLanguage(text);
		return ancientBook;
	}

}
