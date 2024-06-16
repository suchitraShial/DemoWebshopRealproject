package com.tricenties.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");

		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}
}
