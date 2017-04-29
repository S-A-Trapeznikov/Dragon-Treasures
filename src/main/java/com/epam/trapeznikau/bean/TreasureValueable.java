package com.epam.trapeznikau.bean;

public abstract class TreasureValueable extends Treasure{
	
	private float price;
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TreasureValueable other = (TreasureValueable) obj;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price)) {
			return false;
		}
		return true;
	}
}
	
