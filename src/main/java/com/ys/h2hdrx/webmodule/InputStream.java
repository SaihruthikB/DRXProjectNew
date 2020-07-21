package com.ys.h2hdrx.webmodule;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputStream {
	static FileInputStream inputStream;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
public InputStream(String filepath) throws Exception
{
	try{
		 inputStream = new FileInputStream(filepath);
		 workbook = new XSSFWorkbook(inputStream);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}	       
}
public int rowCount(int sheetindex)
{
	int rownum = workbook.getSheetAt(sheetindex).getLastRowNum();
	rownum = rownum+1;
	return rownum;
}

public String getCellData(int sheetindex, int rownum, int cellnum )
{
	String data = workbook.getSheetAt(sheetindex).getRow(rownum).getCell(cellnum).getStringCellValue();
	return data;
}
}
