package org.frame.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcelwithDP {

	//@SuppressWarnings("resource")
	@DataProvider(name ="Data")
	public Object[] getData() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workBook.getSheet("LogIn_DATA");
		
		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);
		int colnum = sheet.getRow(0).getLastCellNum();
		System.out.println(colnum);
		
		Object[] data = new Object[rownum];
		Map <String, String> map;
		for (int i=1;i<=rownum;i++) {
	 		
			map = new HashMap<String, String>();
			for(int j=0;j<colnum;j++) {
				String key= sheet.getRow(0).getCell(j).getStringCellValue();
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i-1]=map;
			}
			
		}
		workBook.close();
		return data;
		
	}
}
