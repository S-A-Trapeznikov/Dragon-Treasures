package com.epam.trapeznikau.dao.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.dao.TreasureDAO;
import com.epam.trapeznikau.dao.impl.treasurepaser.TreasureStaxParser;

public class STAXParser implements TreasureDAO{

	@Override
	public List<Treasure> read() {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		XMLStreamReader reader;
		try {
			InputStream input = new FileInputStream("resources/SmallTreasures.xml");
			reader = inputFactory.createXMLStreamReader(input);
			return TreasureStaxParser.process(reader);
		} catch (FileNotFoundException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
