package abstractfactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class Client2 {

	public static void main(String[] args) throws ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		System.out.println(factory.getClass());
		DocumentBuilder builder = factory.newDocumentBuilder();
		System.out.println(builder.getClass());
		Document document = builder.newDocument();
		System.out.println(document.getClass());
	}

}
