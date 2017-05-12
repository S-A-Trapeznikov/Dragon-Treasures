package com.epam.trapeznikau.dao.provider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.dao.provider.impl.ancientbookfactory.AncientBookBuilder;
import com.epam.trapeznikau.dao.provider.impl.preciousfactory.PreciousStoneBuilder;

public class ProviderTreasureFactory {
	private final static ProviderTreasureFactory instance = new ProviderTreasureFactory();
	
	private Treasure treasure;
	private TreasureFactory prStoneFactory = PreciousStoneBuilder.getBuilder();
//	private TreasureFactory aromaFactory = AromaBuilder.getBuilder();
//	private TreasureFactory axeFactory = AxeBuilder.getBuilder();
//	private TreasureFactory helmetFactory = HelmetBuilder.getBuilder();
//	private TreasureFactory vaseFactory = VaseBuilder.getBuilder();
//	private TreasureFactory princessFactory = PrincessBuilder.getBuilder();
	private TreasureFactory ancientBookFactory = AncientBookBuilder.getBuilder();
	
	private Map<TreasureName,TreasureFactory> repTr = new HashMap<>();
		
	private ProviderTreasureFactory(){
		repTr.put(TreasureName.PRECIOUS_STONE, prStoneFactory);
//		repTr.put(TreasureName.AROMA, aromaFactory);
//		repTr.put(TreasureName.AXE, axeFactory);
//		repTr.put(TreasureName.HELMET, helmetFactory);
//		repTr.put(TreasureName.VASE, vaseFactory);
//		repTr.put(TreasureName.PRINCESS, princessFactory);
		repTr.put(TreasureName.ANCIENT_BOOK, ancientBookFactory);
		repTr.put(TreasureName.UNEXIST_ELEMENT, new WrongRequest());				
	}
	
	public static ProviderTreasureFactory getInstance(){
		return instance;
	}

	public List<Treasure> fill(List<Treasure> treasures, String currentNode, String childrenNode, String textChildrenNode){
		TreasureName treasureName = null;	
		try{			
			treasureName = TreasureName.valueOf(currentNode.toUpperCase());
			 
			 if (currentNode.equals(childrenNode)){ 
				 treasure = repTr.get(treasureName).getTreasure();
				 treasures.add(treasure);
			 return treasures;
			 }else {
				 repTr.get(treasureName).fill(currentNode,childrenNode, textChildrenNode);
			 }
		 
			 
		}catch(IllegalArgumentException | NullPointerException e){
			 repTr.get(TreasureName.UNEXIST_ELEMENT);
		}
		 return treasures;						
	}		
}
