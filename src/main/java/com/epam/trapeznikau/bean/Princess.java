package com.epam.trapeznikau.bean;

public class Princess extends TreasureUnvalueable {

	private String name;
	private Integer age;
	private Boolean damnnation;
	private String birthPalce;
	
	protected Princess() {
		super();
	}

	protected Princess(int id, String name, Integer age, Boolean damnnation, String birthPalce) {
		super(id);
		this.name = name;
		this.age = age;
		this.damnnation = damnnation;
		this.birthPalce = birthPalce;
	}

	@Override
	public void calculationUnvalueable() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getDamnnation() {
		return damnnation;
	}

	public void setDamnnation(Boolean damnnation) {
		this.damnnation = damnnation;
	}

	public String getBirthPalce() {
		return birthPalce;
	}

	public void setBirthPalce(String birthPalce) {
		this.birthPalce = birthPalce;
	}

}
