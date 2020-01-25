package qsp.Week6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
		
	FileInputStream fis=new FileInputStream("D:\\QSpiders_2019\\html\\testData.xlsx");
	//Create Workbook
	Workbook wb=WorkbookFactory.create(fis);
	//get the sheet,get the row,get the cell and get value
	String data=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
	//OR
	//Workbook wb=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getData();
	//OR
	/*
	Sheet sheet = wb.getSheet("Sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	String cdata = cell.toString();
	*/
	System.out.println(data);
	}

}
