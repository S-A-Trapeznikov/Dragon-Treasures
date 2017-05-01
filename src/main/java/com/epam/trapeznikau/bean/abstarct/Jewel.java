package com.epam.trapeznikau.bean.abstarct;

import com.epam.trapeznikau.bean.Weightable;
import com.epam.trapeznikau.bean.Materiable;

public abstract class Jewel extends TreasureValuable implements Materiable, Weightable{
	
	private String material;
	private float weight;
	
	protected Jewel (){
		super();
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + Float.floatToIntBits(weight);
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
		Jewel other = (Jewel) obj;
		if (material == null) {
			if (other.material != null) {
				return false;
			}
		} else if (!material.equals(other.material)) {
			return false;
		}
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight)) {
			return false;
		}
		return true;
	}
	
	
	
}
