package com.epam.trapeznikau.bean;

public abstract class Jewel extends TreasureValueable{
	
	private String material;
	private Float weight;
	
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

	public Jewel (){}

	protected Jewel(Integer id,String material, Float weight) {
		super(id);
		this.material = material;
		this.weight = weight;
	}
	
	

}
