package com.epam.trapeznikau.dao;

import com.epam.trapeznikau.dao.impl.DOMParser;
import com.epam.trapeznikau.dao.impl.SAXParser;
import com.epam.trapeznikau.dao.impl.STAXParser;

public class DAOFactory {
	
	private final static DAOFactory instance = new DAOFactory();
	
	private DOMParser domParser = new DOMParser();
	private SAXParser saxParser = new SAXParser();
	private STAXParser staxParser = new STAXParser();
	
	public static DAOFactory getInstance(){
		return instance;
	}
	
	public DOMParser getDOMParser(){
		return domParser;
	}
	
	public SAXParser getSAXParser(){
		return saxParser;
	}
	
	public STAXParser getSTAXParser(){
		return staxParser;
	}
}
