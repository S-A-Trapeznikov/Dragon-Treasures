package com.epam.trapeznikau.runner;

import java.util.Iterator;
import java.util.List;

import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.bean.impl.PreciousStone;
import com.epam.trapeznikau.service.ServiceFactory;

public class Runner {
	
	public static void main(String args []){
		
		ServiceFactory factory = ServiceFactory.getInstance();
		List<Treasure> treasures = factory.getOperation().read();
		Iterator<Treasure> it = treasures.iterator();
//		Iterator<Treasure> it = factory.getOperation().searchListTreasureByMaterial("Diamond").iterator();
//		Iterator<Treasure> it = factory.getOperation().searchListTreasureByPrice(9, 12).iterator();
//		Iterator<Treasure> it = factory.getOperation().searchListTreasureByWeight(0.015F).iterator();//		
		while (it.hasNext()){
			System.out.println(it.next());			
		}
		
//		Treasure treasure = factory.getOperation().mostExpensiveTreasure();
//		System.out.println(treasure.toString());
	}

}
