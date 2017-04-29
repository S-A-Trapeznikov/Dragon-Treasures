package com.epam.trapeznikau.dao.provider.impl.prciousfactory;

import java.util.HashMap;
import java.util.Map;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.dao.provider.TreasureFactory;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl.SetDiameter;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl.SetId;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl.SetMaterial;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl.SetPrice;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl.SetType;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.impl.SetWeight;


public class PreciousStoneBuilder implements TreasureFactory{
	
	private final static PreciousStoneBuilder instance = new PreciousStoneBuilder();
	
	private PreciousStone prStone = new PreciousStone();
	
	private Map<PreciousStoneTagName, CommandPrecious> command = new HashMap<>();
	
	public PreciousStoneBuilder(){
		
		command.put(PreciousStoneTagName.DIAMETER, new SetDiameter());
		command.put(PreciousStoneTagName.MATERIAL, new SetMaterial());
		command.put(PreciousStoneTagName.PRICE, new SetPrice());
		command.put(PreciousStoneTagName.WEIGHT, new  SetWeight());
		command.put(PreciousStoneTagName.TYPE, new SetType());
		command.put(PreciousStoneTagName.ID, new SetId());
		
	}
	
	public static PreciousStoneBuilder getBuilder(){
		return instance;
	}

	@Override
	public void fill(String node, String command, String text) {
		prStone = this.command.get(PreciousStoneTagName.valueOf(command.toUpperCase())).generalSet(prStone, text);
			
	}

	@Override
	public Treasure getTreasure() {
			return prStone;
	}
		
}
