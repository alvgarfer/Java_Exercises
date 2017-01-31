package javaa.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibroXML extends DefaultHandler
{
	
	@Override
	public void startDocument() throws SAXException
	{
		System.out.println("Inicio del Documento");
		//super.startDocument();
	}
	
	@Override
	public void endDocument() throws SAXException
	{
		System.out.println("Fin del Documento");
		//super.endDocument();
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
	{
		//super.startElement(uri, localName, qName, attributes);
	}
	
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException 
	{
		//super.endElement(uri, localName, qName);
	}
	
	@Override
	public void characters (char[] ch, int start, int length)
	{
		System.out.println ("Start [] = " + start);
		System.out.println ("Length [] = " + length);
		
		String str = new String(ch, start, length);
		System.out.println("String = " + str);
	}
}
