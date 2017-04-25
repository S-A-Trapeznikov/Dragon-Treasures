package com.epam.trapeznikau.bean;

public abstract class Treasure {
	
	private int id;
	
	protected Treasure() {}

	public Treasure(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
