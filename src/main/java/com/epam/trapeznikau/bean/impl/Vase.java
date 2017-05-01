package com.epam.trapeznikau.bean.impl;

import com.epam.trapeznikau.bean.abstarct.Artwork;

public class Vase extends Artwork {
	
	private int amount;
	private boolean picture;
	
	public Vase() {
		super();
	}
	
	public Vase(int id, float price, String title, String type, int amount, boolean picture) {
		super(id, price, title, type);
		this.amount = amount;
		this.picture = picture;
	
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isPicture() {
		return picture;
	}

	public void setPicture(boolean picture) {
		this.picture = picture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + amount;
		result = prime * result + (picture ? 1231 : 1237);
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
		Vase other = (Vase) obj;
		if (amount != other.amount)
			return false;
		if (picture != other.picture)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vase [ id= "+getId()+", price = "+getPrice()+", title = "+getTitle()+", type = "+getType()+", amount = " + amount + ", picture=" + picture + "]";
	}
	
	
	
	

}
