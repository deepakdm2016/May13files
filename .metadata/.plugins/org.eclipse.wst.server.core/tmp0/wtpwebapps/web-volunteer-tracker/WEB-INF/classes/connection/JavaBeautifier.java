package com.jdbc.connection;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.w3c.tidy.Tidy;


public class JavaBeautifier {

	public String prettyPrintHTML(String rawHTML)
	{    
	    Tidy tidy = new Tidy();
	    tidy.setXHTML(true);
	    tidy.setIndentContent(true);
	    tidy.setPrintBodyOnly(true);
	    tidy.setTidyMark(false);

	    // HTML to DOM
	    org.w3c.dom.Document htmlDOM = tidy.parseDOM(new ByteArrayInputStream(rawHTML.getBytes()), null);

	    // Pretty Print
	    OutputStream out = new ByteArrayOutputStream();
	    tidy.pprint(htmlDOM, out);

	    return out.toString();
	}
	
}
