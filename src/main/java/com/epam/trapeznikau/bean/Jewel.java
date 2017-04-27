package com.epam.trapeznikau.bean;

public abstract class Jewel extends TreasureValueable{
	
	protected String material;
	protected float weight;
	
	public Jewel (){}

	protected Jewel(int id,float price,String material, float weight) {
		super(id, price);
		this.material = material;
		this.weight = weight;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}
	
	
}
