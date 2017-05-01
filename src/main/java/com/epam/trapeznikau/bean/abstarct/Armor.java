package com.epam.trapeznikau.bean.abstarct;

import com.epam.trapeznikau.bean.Weightable;
import com.epam.trapeznikau.bean.Materiable;

public abstract class Armor extends TreasureValuable implements Materiable{
	
	private String title;
	private String type;
	private String material;
	
	protected Armor() {
		super();
	}
	
	protected Armor(int id, float price, String title, String type, String material) {
		super(id, price);
		this.title = title;
		this.type = type;
		this.material = material;		
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
