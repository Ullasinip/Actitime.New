package qsp.Week6;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\QSpiders_2019\\html\\testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Get the max row count
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			//print the first column values
			String data = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			System.out.println(data);
		}

	}

}
