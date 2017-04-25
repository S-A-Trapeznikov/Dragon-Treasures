package com.epam.trapeznikau.bean;

public abstract class TreasureValueable extends Treasure{
	
	private float price;
	
	public TreasureValueable(){
		super();
	}

	public TreasureValueable(int id){
		super(id);
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public abstract float calculationValue(); 
}
