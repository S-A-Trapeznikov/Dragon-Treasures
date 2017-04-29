package com.epam.trapeznikau.dao.impl.treasurepaser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.dao.provider.ProviderTreasureFactory;

public class TreasureSaxHandler extends DefaultHandler{
	private List<Treasure> treasures = new ArrayList<Treasure>();
	ProviderTreasureFactory factory;
	private StringBuilder text;
	private String currentElement;
		
	public List<Treasure> getTresuresList(){
		return treasures;
	}
	
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start parse document");
		factory = ProviderTreasureFactory.getInstance();
		super.startDocument();
	}
	
	@Override
	public void startElement(String arg0, String nodeElement, String arg2, Attributes attribute) throws SAXException {
		text = new StringBuilder();
		String id = attribute.getValue("id");
		if (id!=null){
		currentElement = nodeElement;
		factory.fill(treasures, nodeElement, "ID", attribute.getValue("id"));
		}
	}

	@Override
	public void characters(char[] str, int start, int length) throws SAXException {
		text.append(str,start,length);
	}
	
	@Override
	public void endElement(String arg0, String endNodeElement, String arg2) {
		treasures = factory.fill(treasures,currentElement,endNodeElement,text.toString());
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Finished parse document");
		super.endDocument();
	}

}
