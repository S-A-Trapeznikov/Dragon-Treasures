package com.epam.trapeznikau.bean.impl;

import com.epam.trapeznikau.bean.abstarct.AncientArtifact;

public class AncientBook extends AncientArtifact{
	
	private int pageCount;
	private String language;
	
	public AncientBook() {
		super();	
	}
	
	public AncientBook(int id, float price, String title, String type, float age,int pageCount, String language) {
		super(id, price, title, type, age);
		this.pageCount = pageCount;
		this.language = language;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + pageCount;
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
		AncientBook other = (AncientBook) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (pageCount != other.pageCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AncientBook [pageCount=" + pageCount + ", language=" + language + ", Title =" + getTitle()
				+ ", Type =" + getType() + ", Age =" + getAge() + ", Price =" + getPrice() + ", Id ="
				+ getId() + "]";
	}
	
	

}
