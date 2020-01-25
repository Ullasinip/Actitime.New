package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileExcel 
{
	public String getExcelData(String path,String sheetname,int rownum,int cellnum) throws IOException
	{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	String excelData=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
	return excelData;
	}
}
