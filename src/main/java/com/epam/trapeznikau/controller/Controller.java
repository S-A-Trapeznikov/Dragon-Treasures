package com.epam.trapeznikau.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.controller.impl.treasurefactory.PreciousStoneFactory;

public class Controller {
	private final static Controller instance = new Controller();
	
	private Treasure treasure;
	private TreasureFactory prStoneFactory = PreciousStoneFactory.getBuilder();
	
	private Map<TreasureName,TreasureFactory> repTr = new HashMap<>();
		
	private Controller(){
		repTr.put(TreasureName.PRECIOUS_STONE, prStoneFactory);
		repTr.put(TreasureName.UNEXIST_ELEMENT, new WrongRequest());
				
	}
	
	public static Controller getInstance(){
		return instance;
	}

	public List<Treasure> fill(List<Treasure> treasures, String node, String command, String text){
		TreasureName treasureName = null;	
		try{			
			treasureName = TreasureName.valueOf(node.toUpperCase());
			 
			 if (node.equals(command)){ 
				 treasure = repTr.get(treasureName).getTreasure();
				 treasures.add(treasure);
			 return treasures;
			 }else {
				 repTr.get(treasureName).fill(node,command, text);
			 }
		 
			 
		}catch(IllegalArgumentException | NullPointerException e){
			 repTr.get(TreasureName.UNEXIST_ELEMENT);

		}
		 return treasures;						
	}		
}
