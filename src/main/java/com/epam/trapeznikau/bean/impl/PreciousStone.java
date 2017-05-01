package com.epam.trapeznikau.bean.impl;

import com.epam.trapeznikau.bean.abstarct.Jewel;

public class PreciousStone extends Jewel {
	
	private float diameter;
	private String type;
	
	public PreciousStone(){
		super();
	}
	
	public PreciousStone(int id, float price, String material, float weight, float diameter, String type){
		super(id, price, material,weight);
		this.diameter=diameter;
		this.type=type;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	@Override
	public String toString() {
		return "PreciousStone [diameter=" + diameter + ", type=" + type + ", id=" + getId() +", price=" + getPrice() +", material=" + getMaterial()+ ", weight=" + getWeight()+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(diameter);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		PreciousStone other = (PreciousStone) obj;
		if (Float.floatToIntBits(diameter) != Float.floatToIntBits(other.diameter)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}

	@Override
	public String manufactureMaterial() {
		return getMaterial();
	}

	@Override
	public Float weightCalculation() {
		return getWeight();
	}
	
	
}
