package com.epam.trapeznikau.bean.abstarct;

public abstract class AncientArtifact extends TreasureValuable {
	
	private String title;
	private String type;
	private float age;
	
	protected AncientArtifact() {
		super();		
	}	
	
	protected AncientArtifact(int id, float price, String title, String type, float age) {
		super(id, price);
		this.title = title;
		this.type = type;
		this.age = age;
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
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(age);
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
		AncientArtifact other = (AncientArtifact) obj;
		if (Float.floatToIntBits(age) != Float.floatToIntBits(other.age))
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
