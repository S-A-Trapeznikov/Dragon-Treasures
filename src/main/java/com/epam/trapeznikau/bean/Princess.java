package com.epam.trapeznikau.bean;

public class Princess extends Treasure {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((birthPalce == null) ? 0 : birthPalce.hashCode());
		result = prime * result + ((damnnation == null) ? 0 : damnnation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Princess other = (Princess) obj;
		if (age == null) {
			if (other.age != null) {
				return false;
			}
		} else if (!age.equals(other.age)) {
			return false;
		}
		if (birthPalce == null) {
			if (other.birthPalce != null) {
				return false;
			}
		} else if (!birthPalce.equals(other.birthPalce)) {
			return false;
		}
		if (damnnation == null) {
			if (other.damnnation != null) {
				return false;
			}
		} else if (!damnnation.equals(other.damnnation)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}	
}
