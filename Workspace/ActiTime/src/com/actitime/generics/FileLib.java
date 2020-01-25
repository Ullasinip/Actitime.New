package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
public String getPropertyValue(String path, String key) throws IOException
{
	FileInputStream fis=new FileInputStream(path);
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
}
public String getPropertyValue(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/config.properties.txt");
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
}

public String getExcelData(String path) throws IOException
{
FileInputStream fis=new FileInputStream(path);
Workbook wb=WorkbookFactory.create(fis);
String excelData=wb.getSheet("CreateCustomer").getRow(0).getCell(0).toString();
return excelData;
}

public String getExcelData(String sheetname,int rownum,int cellnum) throws IOException
{
FileInputStream fis=new FileInputStream("./data/testData.xlsx");
Workbook wb=WorkbookFactory.create(fis);
String excelData=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
return excelData;
}

}
