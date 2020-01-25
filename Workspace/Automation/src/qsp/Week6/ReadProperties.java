package qsp.Week6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException
	{
		//To convert external resource file into Java Object
		FileInputStream fis=new FileInputStream("D:\\QSpiders_2019\\html\\config.properties.txt");
		//Create an object of Properties class since getproperty() is a non-static method
		Properties prop=new Properties();
		//load the file into Properties class
		prop.load(fis);
		//read the data from Properties file using Key
		String URL =prop.getProperty("url");
		System.out.println(URL);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));

	}

}
