package com.epam.trapeznikau.runner;

import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.epam.trapeznikau.dao.TreasureSaxHandler;

public class Runner {
	
	public static void main(String args []){
		
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			TreasureSaxHandler handler = new TreasureSaxHandler();
			reader.setContentHandler(handler);
			reader.parse(new InputSource("resources/SmallTreasures.xml"));
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
