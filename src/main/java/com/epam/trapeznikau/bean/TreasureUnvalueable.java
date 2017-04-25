package com.epam.trapeznikau.bean;

public abstract class TreasureUnvalueable extends Treasure{
	
	public TreasureUnvalueable(){
		super();
	}
	
	public TreasureUnvalueable(int id){
		super(id);
	}
	
	public abstract void calculationUnvalueable();

}
