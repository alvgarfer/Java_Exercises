package javaa.xml;

import org.xml.sax.helpers.DefaultHandler;

public class ParserLibroXML extends DefaultHandler
{

	public void startElement (String uri, String localName, String qName)
	{
		System.out.println("StartElement = " + localName);
	}
	
	public void endElement (String uri, String localName, String qName)
	{
		System.out.println("EndElement = " + localName);
	}
	
	public void characters (char[] ch, int start, int length)
	{
		System.out.println("Char [] = " + ch);
		System.out.println("Start [] = " + start);
		System.out.println("Length [] = " + length);

	}

}
