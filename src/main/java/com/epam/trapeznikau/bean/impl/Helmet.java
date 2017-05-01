package com.epam.trapeznikau.bean.impl;

import com.epam.trapeznikau.bean.abstarct.Armor;

public class Helmet extends Armor{
	
	private float headProtection;
	private float headGirth;
	
	public Helmet() {
		super();	
	}
	
	public Helmet(int id, float price, String title, String type, String material, float headProtection, float headGirth) {
		super(id, price, title, type, material);
		this.headProtection = headProtection;
		this.headGirth = headGirth;
	}

	public float getHeadProtection() {
		return headProtection;
	}

	public void setHeadProtection(float headProtection) {
		this.headProtection = headProtection;
	}

	public float getHeadGirth() {
		return headGirth;
	}

	public void setHeadGirth(float headGirth) {
		this.headGirth = headGirth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(headGirth);
		result = prime * result + Float.floatToIntBits(headProtection);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helmet other = (Helmet) obj;
		if (Float.floatToIntBits(headGirth) != Float.floatToIntBits(other.headGirth))
			return false;
		if (Float.floatToIntBits(headProtection) != Float.floatToIntBits(other.headProtection))
			return false;
		return true;
	}

	@Override
	public String manufactureMaterial() {
		return getMaterial();
	}

	@Override
	public String toString() {
		return "Helmet [headProtection=" + headProtection + ", headGirth=" + headGirth + ", Title =" + getTitle()
				+ ", Type =" + getType() + ", Material =" + getMaterial() + ", Price =" + getPrice()
				+ ", Id =" + getId() + "]";
	}
	
	
	
	
	

}
