package com.epam.trapeznikau.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.controller.Controller;

public class TreasureSaxHandler extends DefaultHandler{
	private List<Treasure> treasures = new ArrayList<Treasure>();
	private Treasure treasure;
	Controller controller;
	private StringBuilder text;
	private String currentElement;
		
	public List<Treasure> getTresuresList(){
		return treasures;
	}
	
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start parse document");
		controller = Controller.getInstance();
		super.startDocument();
	}
	
	@Override
	public void startElement(String arg0, String nameElement, String arg2, Attributes attribute) throws SAXException {
		text = new StringBuilder();
		String id = attribute.getValue("id");
		if (id!=null){
		currentElement = nameElement;
		controller.fill(treasures, nameElement, "ID", attribute.getValue("id"));
		}
	}

	@Override
	public void characters(char[] str, int start, int length) throws SAXException {
		text.append(str,start,length);
	}
	
	@Override
	public void endElement(String arg0, String nameElement, String arg2) {
		treasures = controller.fill(treasures,currentElement,nameElement,text.toString());
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Finished parse document");
		Iterator<Treasure> it = treasures.iterator();
		while (it.hasNext()){
			System.out.println(it.next());			
		}
		super.endDocument();
	}

}
