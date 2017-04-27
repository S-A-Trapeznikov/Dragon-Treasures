package com.epam.trapeznikau.controller.impl.treasurefactory;

import java.util.HashMap;
import java.util.Map;

import com.epam.trapeznikau.bean.PreciousStone;
import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.controller.TreasureFactory;
import com.epam.trapeznikau.controller.impl.treasurefactory.impl.SetDiameter;
import com.epam.trapeznikau.controller.impl.treasurefactory.impl.SetId;
import com.epam.trapeznikau.controller.impl.treasurefactory.impl.SetMaterial;
import com.epam.trapeznikau.controller.impl.treasurefactory.impl.SetPrice;
import com.epam.trapeznikau.controller.impl.treasurefactory.impl.SetType;
import com.epam.trapeznikau.controller.impl.treasurefactory.impl.SetWeight;


public class PreciousStoneFactory implements TreasureFactory{
	
	private final static PreciousStoneFactory instance = new PreciousStoneFactory();
	
	private PreciousStone prStone = new PreciousStone();
	
	private Map<PreciousStoneTagName, CommandPrecious> command = new HashMap<>();
	
	public PreciousStoneFactory(){
		
		command.put(PreciousStoneTagName.DIAMETER, new SetDiameter());
		command.put(PreciousStoneTagName.MATERIAL, new SetMaterial());
		command.put(PreciousStoneTagName.PRICE, new SetPrice());
		command.put(PreciousStoneTagName.WEIGHT, new  SetWeight());
		command.put(PreciousStoneTagName.TYPE, new SetType());
		command.put(PreciousStoneTagName.ID, new SetId());
		
	}
	
	public static PreciousStoneFactory getBuilder(){
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
