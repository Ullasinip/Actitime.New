package com.actitime.generics;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		FileLib fb=new FileLib();
		String url=fb.getPropertyValue("./data/config.properties.txt", "url");
		System.out.println(url);
		FileExcel fe=new FileExcel();
		String data=fe.getExcelData("./data/testData.xlsx", "Sheet1", 0, 1);
		System.out.println(data);
		

	}

}
