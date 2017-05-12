package com.epam.trapeznikau.dao.provider.impl.ancientbookfactory;

import java.util.HashMap;
import java.util.Map;

import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.bean.impl.AncientBook;
import com.epam.trapeznikau.dao.provider.TreasureFactory;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl.SetAge;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl.SetId;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl.SetLanguage;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl.SetPageCount;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl.SetPrice;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl.SetTitle;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.impl.SetType;

public class AncientBookBuilder implements TreasureFactory{
	
private final static AncientBookBuilder instance = new AncientBookBuilder();
	
	private AncientBook ancientBook = new AncientBook();
	
	private Map<AncientBookTagName, CommandAncientBook> command = new HashMap<>();
	
	private AncientBookBuilder(){
		
		command.put(AncientBookTagName.ID, new SetId());
		command.put(AncientBookTagName.AGE, new SetAge());
		command.put(AncientBookTagName.PRICE, new SetPrice());
		command.put(AncientBookTagName.LANGUAGE, new  SetLanguage());
		command.put(AncientBookTagName.PAGE_COUNT, new SetPageCount());
		command.put(AncientBookTagName.TITLE, new SetTitle());
		command.put(AncientBookTagName.TYPE, new SetType());
		
	}
	
	public static AncientBookBuilder getBuilder(){
		return instance;
	}

	@Override
	public void fill(String node, String command, String text) {
		ancientBook = this.command.get(AncientBookTagName.valueOf(command.toUpperCase())).generalSet(ancientBook, text);
			
	}

	@Override
	public Treasure getTreasure() {
			return ancientBook;
	}
		
}


