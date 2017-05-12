package com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl;

import com.epam.trapeznikau.bean.impl.AncientBook;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.CommandAncientBook;

public class SetPageCount implements CommandAncientBook {

	@Override
	public AncientBook generalSet(AncientBook ancientBook, String text) {
		ancientBook.setPageCount(Integer.valueOf(text));
		return ancientBook;
	}

}
