package qsp.Week6;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\QSpiders_2019\\html\\testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Get the max row count
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		//get the max column count
		int colCount=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
			//print the first row values
			String data = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
			System.out.println(data);
			}
		}

	}

}
