package com.crm.actitime.genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	
	public String readdatafromproperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/Driven.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
}
}
