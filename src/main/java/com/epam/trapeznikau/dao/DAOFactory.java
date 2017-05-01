package com.epam.trapeznikau.dao;

import com.epam.trapeznikau.dao.impl.DOMTreasureParser;
import com.epam.trapeznikau.dao.impl.SAXTreasureParser;
import com.epam.trapeznikau.dao.impl.STAXTreasureParser;

public class DAOFactory {
	
	private final static DAOFactory instance = new DAOFactory();
	
	private DOMTreasureParser domParser = new DOMTreasureParser();
	private SAXTreasureParser saxParser = new SAXTreasureParser();
	private STAXTreasureParser staxParser = new STAXTreasureParser();
	
	public static DAOFactory getInstance(){
		return instance;
	}
	
	public DOMTreasureParser getDOMParser(){
		return domParser;
	}
	
	public SAXTreasureParser getSAXParser(){
		return saxParser;
	}
	
	public STAXTreasureParser getSTAXParser(){
		return staxParser;
	}
}
