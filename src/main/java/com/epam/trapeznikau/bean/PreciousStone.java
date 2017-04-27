package com.epam.trapeznikau.bean;

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
	public float calculationValue() {
		// TODO Auto-generated method stub
		return 0;
	}	
	

	@Override
	public String toString() {
		return "PreciousStone [diameter=" + diameter + ", type=" + type + ", id=" + super.id +", price=" + super.price +", material=" + super.material+ ", weight=" + super.weight+"]";
	}
}
