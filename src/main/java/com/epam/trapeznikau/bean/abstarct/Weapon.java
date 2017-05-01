package com.epam.trapeznikau.bean.abstarct;

public abstract class Weapon extends TreasureValuable {
	
	private String title;
	private String type;
	private float damage;
	
	protected Weapon() {
		super();
	
	}
	protected Weapon(int id, float price, String title, String type, float damage) {
		super(id, price);
		this.title=title;
		this.damage=damage;
		this.type=type;
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
	public float getDamage() {
		return damage;
	}
	public void setDamage(float damage) {
		this.damage = damage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(damage);
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
		Weapon other = (Weapon) obj;
		if (Float.floatToIntBits(damage) != Float.floatToIntBits(other.damage))
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
	
}
