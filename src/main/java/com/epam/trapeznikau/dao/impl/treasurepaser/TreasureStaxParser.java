package com.epam.trapeznikau.dao.impl.treasurepaser;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.dao.provider.ProviderTreasureFactory;

public class TreasureStaxParser {

	public static List<Treasure> process(XMLStreamReader reader) throws XMLStreamException {

		List<Treasure> treasures = new ArrayList<>();
		ProviderTreasureFactory factory = ProviderTreasureFactory.getInstance();
		String text = null;
		String currentElement =null;
		String nodeElement;
		while (reader.hasNext()) {
			int type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				text = new String();
				nodeElement = reader.getLocalName();
				String id = reader.getAttributeValue(null, "id");
				if (id != null) {
					currentElement = nodeElement;
					factory.fill(treasures, nodeElement, "ID", id);
				}
				break;
			case XMLStreamConstants.CHARACTERS:
				text = reader.getText().trim();
				break;
			case XMLStreamConstants.END_ELEMENT:
				String endNodeElement = reader.getLocalName();
				treasures = factory.fill(treasures,currentElement,endNodeElement,text);
				break;
			}
		}
		return treasures;
	}
}
