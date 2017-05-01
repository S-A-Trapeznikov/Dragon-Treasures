package com.epam.trapeznikau.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.dao.TreasureDAO;
import com.epam.trapeznikau.dao.impl.treasurepaser.TreasureDOMParser;

public class DOMTreasureParser implements TreasureDAO{

	@Override
	public List<Treasure> read()  {
		DOMParser parser = new DOMParser();
		try {
			parser.parse("resources/SmallTreasures.xml");
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document document = parser.getDocument();
		return TreasureDOMParser.domParser(document);
		
	}

}
