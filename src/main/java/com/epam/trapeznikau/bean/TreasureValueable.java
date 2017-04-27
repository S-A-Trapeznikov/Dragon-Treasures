package com.epam.trapeznikau.bean;

public abstract class TreasureValueable extends Treasure{
	
	protected float price;
	
	public TreasureValueable(){
		super();
	}

	public TreasureValueable(int id, float price){
		super(id);
		this.price=price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public abstract float calculationValue(); 
}
