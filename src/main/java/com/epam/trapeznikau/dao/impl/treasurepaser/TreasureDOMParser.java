package com.epam.trapeznikau.dao.impl.treasurepaser;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.epam.trapeznikau.bean.abstarct.Treasure;
import com.epam.trapeznikau.dao.provider.ProviderTreasureFactory;
import com.epam.trapeznikau.dao.provider.TreasureName;

public class TreasureDOMParser {

	public static List<Treasure> domParser(Document document) {
		Element root = document.getDocumentElement();
		List<Treasure> treasures = new ArrayList<>();
		ProviderTreasureFactory factory = ProviderTreasureFactory.getInstance();
		TreasureName[] trName = TreasureName.values();
		String currentNode;
		String childrenNode;
		int len = trName.length;
		for (int i = 0; i < len; i++) {
			currentNode = trName[i].toString().trim().toLowerCase();
			NodeList nodeList = root.getElementsByTagNameNS("*", currentNode);
			for (int j = 0; j < nodeList.getLength(); j++) {
				Element nodeElement = (Element) nodeList.item(j);
				String id = nodeElement.getAttribute("id");
				factory.fill(treasures, currentNode, "ID", id);
				NodeList childNodes = nodeElement.getChildNodes();
				for (int k = 0; k < childNodes.getLength(); k++) {
					childrenNode = childNodes.item(k).getNodeName().trim();
					if (childrenNode.equals("#text") != true) {
						String textChildrenNode = childNodes.item(k).getTextContent().trim();
						childrenNode = childrenNode.split(":")[1];
						factory.fill(treasures, currentNode, childrenNode, textChildrenNode);
					}
				}
				childrenNode = currentNode;
				treasures = factory.fill(treasures, currentNode, childrenNode, null);
			}
		}
		return treasures;
	}

}
