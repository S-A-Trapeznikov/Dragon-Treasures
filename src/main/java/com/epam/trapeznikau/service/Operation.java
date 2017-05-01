package com.epam.trapeznikau.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.trapeznikau.bean.Materiable;
import com.epam.trapeznikau.bean.Weightable;
import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.bean.abstarct.TreasureValuable;
import com.epam.trapeznikau.dao.DAOFactory;

public class Operation implements ServiceOperation {
	
	@Override
	public Treasure mostExpensiveTreasure() {
		DAOFactory factory = DAOFactory.getInstance();
		List<Treasure> treasures=new ArrayList<>();
		List<TreasureValuable> treasuresVal=new ArrayList<>();
		treasures = factory.getDOMParser().read();
		TreasureValuable treasure;
		Iterator<Treasure> it = treasures.iterator();
		while(it.hasNext()){
			Treasure compareTreasure = it.next();
			if (compareTreasure instanceof TreasureValuable){
				treasure = (TreasureValuable) compareTreasure;
				treasuresVal.add(treasure);				
			}
		}
		
		return Collections.max(treasuresVal,PriceComparator);
	}

	@Override
	public List<Treasure> searchListTreasureByName(Class<? extends Treasure> treasure) {
		DAOFactory factory = DAOFactory.getInstance();
		List<Treasure> treasures = new ArrayList<>();
		List<Treasure> treasuresByClass=new ArrayList<>();
		treasures = factory.getDOMParser().read();
		Iterator<Treasure> it = treasures.iterator();
		while(it.hasNext()){
			Treasure compareTreasure = it.next();
			if (compareTreasure.getClass().equals(treasure)){				
				treasuresByClass.add(compareTreasure);
				}				
			}
		return treasuresByClass;
	}

	@Override
	public List<Treasure> searchListTreasureByPrice(float from, float until) {
		if ((validation(from))&(validation(until))){
		DAOFactory factory = DAOFactory.getInstance();
		List<Treasure> treasures = new ArrayList<>();
		List<Treasure> treasuresVal=new ArrayList<>();
		treasures = factory.getDOMParser().read();
		TreasureValuable treasure;		
		Iterator<Treasure> it = treasures.iterator();
		while(it.hasNext()){
			Treasure compareTreasure = it.next();
			if (compareTreasure instanceof TreasureValuable){
				treasure = (TreasureValuable) compareTreasure;
				float price = treasure.getPrice();
				if ((price>=from)&(price<=until)){
					treasuresVal.add(treasure);
				}				
			}
		}
		return treasuresVal;
		}
		return null;
	}

	@Override
	public List<Treasure> searchListTreasureByMaterial(String material) {
		if (validation(material)){
		DAOFactory factory = DAOFactory.getInstance();
		List<Treasure> treasures = new ArrayList<>();
		List<Treasure> treasuresByMaterial=new ArrayList<>();
		treasures = factory.getDOMParser().read();
		Iterator<Treasure> it = treasures.iterator();
		Materiable treasure;
		while(it.hasNext()){
			Treasure compareTreasure = it.next();
			if (compareTreasure instanceof Materiable){
				treasure = (Materiable)compareTreasure;
					if(treasure.manufactureMaterial().equals(material)){
					treasuresByMaterial.add(compareTreasure);
					}
				}				
			}
		return treasuresByMaterial;
		} else {
			throw new IllegalArgumentException("Only string format expected");
		}
	}

	@Override
	public List<Treasure> searchListTreasureByWeight(Float weight) {
		if (validation(weight)){
		DAOFactory factory = DAOFactory.getInstance();
		List<Treasure> treasures = new ArrayList<>();
		List<Treasure> treasuresByWeight = new ArrayList<>();
		treasures = factory.getDOMParser().read();
		Iterator<Treasure> it = treasures.iterator();
		Weightable treasure;
		while(it.hasNext()){
			Treasure compareTreasure = it.next();
			if (compareTreasure instanceof Weightable){
				treasure = (Weightable)compareTreasure;
					if(treasure.weightCalculation().equals(weight)){
							treasuresByWeight.add(compareTreasure);
					}					
				}				
			}
		return treasuresByWeight;
		}
		return null;
	}

	public List<Treasure> read() {
		DAOFactory factory = DAOFactory.getInstance();
		return factory.getDOMParser().read();
		// return factory.getSTAXParser().read();

	}
	
	private boolean validation(String str){
		if (str!=null){
			Pattern p = Pattern.compile("[a-zA-Z]+");
			Matcher m = p.matcher(str);
			return m.matches();
		}
		return false;
	}
	
	private boolean validation(Float num){
		String str = String.valueOf(num);
		if (str!=null){
			System.out.println(str);
			Pattern p = Pattern.compile("[\\d\\.]+");
			Matcher m = p.matcher(str);
			return m.matches();
		}
		return false;
	}

	private final Comparator<TreasureValuable> PriceComparator = new Comparator<TreasureValuable>() {

		public int compare(TreasureValuable o1, TreasureValuable o2) {
			float result = o1.getPrice() - o2.getPrice();
			if (result != 0) {
				return (int) (result / Math.abs(result));
			}
			return 0;
		}
	};
}
