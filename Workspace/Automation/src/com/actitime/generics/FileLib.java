package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib
{
	/**
	 * to read the data from the Property file
	 * @param path
	 * @param key
	 * @return String value
	 * @throws IOException
	 */
	public String getPropertyValue(String path,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
}
