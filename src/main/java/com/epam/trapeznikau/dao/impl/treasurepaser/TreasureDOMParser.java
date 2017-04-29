package com.epam.trapeznikau.dao.impl.treasurepaser;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.dao.provider.ProviderTreasureFactory;
import com.epam.trapeznikau.dao.provider.TreasureName;

public class TreasureDOMParser {

	public static List<Treasure> domParser(Document document) {
		Element root = document.getDocumentElement();
		List<Treasure> treasures = new ArrayList<>();
		ProviderTreasureFactory factory = ProviderTreasureFactory.getInstance();
		TreasureName[] trName = TreasureName.values();
		String nodeName;
		int len = trName.length;
		for (int i = 0; i < len; i++) {
			nodeName = trName[i].toString().trim().toLowerCase();
			NodeList nodeList = root.getElementsByTagName(nodeName);
			for(int j=0;j<nodeList.getLength();j++){
				Element nodeElement = (Element) nodeList.item(j);
				
				
			}
		}
	}

}
