package com.epam.trapeznikau.bean.impl;

import com.epam.trapeznikau.bean.abstarct.Weapon;

public class Axe extends Weapon {
	
	private String typeHandle;
	private String typeBlade;
	public Axe(String typeHandle, String typeBlade) {
		super();
		
	}
	
	public Axe() {
		super();
	}
	
	public Axe(int id, float price, String title, String type, float damage, String typeHandle, String typeBlade) {
		super(id, price, title, type, damage);
		this.typeHandle = typeHandle;
		this.typeBlade = typeBlade;
	}

	public String getTypeHandle() {
		return typeHandle;
	}

	public void setTypeHandle(String typeHandle) {
		this.typeHandle = typeHandle;
	}

	public String getTypeBlade() {
		return typeBlade;
	}

	public void setTypeBlade(String typeBlade) {
		this.typeBlade = typeBlade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((typeBlade == null) ? 0 : typeBlade.hashCode());
		result = prime * result + ((typeHandle == null) ? 0 : typeHandle.hashCode());
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
		Axe other = (Axe) obj;
		if (typeBlade == null) {
			if (other.typeBlade != null)
				return false;
		} else if (!typeBlade.equals(other.typeBlade))
			return false;
		if (typeHandle == null) {
			if (other.typeHandle != null)
				return false;
		} else if (!typeHandle.equals(other.typeHandle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Axe [typeHandle=" + typeHandle + ", typeBlade = " + typeBlade + ", Title =" + getTitle()
				+ ", Type =" + getType() + ", Damage = " + getDamage() + ", Price =" + getPrice()
				+ ", Id =" + getId() + "]";
	}
	
	
	
}
