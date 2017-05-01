package com.epam.trapeznikau.bean.impl;

import com.epam.trapeznikau.bean.abstarct.TreasureValuable;

public class Aroma extends TreasureValuable{

	private String title;
	private String type;
	private int count;
	
	public Aroma() {
		super();
		
	}
	public Aroma(int id, float price,String title, String type, int count) {
		super(id, price);
		this.title = title;
		this.type = type;
		this.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + count;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Aroma other = (Aroma) obj;
		if (count != other.count)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aroma [title=" + title + ", type=" + type + ", count=" + count + ", Price =" + getPrice()
				+ ", Id =" + getId() + "]";
	}
	
	
	
}
