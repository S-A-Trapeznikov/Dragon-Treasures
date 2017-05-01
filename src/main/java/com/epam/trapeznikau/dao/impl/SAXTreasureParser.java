package com.epam.trapeznikau.dao.impl;

import java.io.IOException;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.dao.TreasureDAO;
import com.epam.trapeznikau.dao.impl.treasurepaser.TreasureSaxHandler;

public class SAXTreasureParser implements TreasureDAO{

	@Override
	public List<Treasure> read() {
		List<Treasure> treasures = null;
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			TreasureSaxHandler handler = new TreasureSaxHandler();
			reader.setContentHandler(handler);
			reader.parse(new InputSource("resources/SmallTreasures.xml"));
			treasures = handler.getTresuresList();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return treasures;
	}
}
