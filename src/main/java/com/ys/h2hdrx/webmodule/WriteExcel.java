package com.ys.h2hdrx.webmodule;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {
	private static String status[];

	public static int writepassfail(String TcID, String filepath, String... TcStatus) throws Exception {
		setStatus(new String[TcStatus.length]);
		FileInputStream inputStream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		DateFormat format = new SimpleDateFormat("MM.dd.yyyy hh.mm.ss");
		Date date = new Date();
		String dateInFormat = format.format(date);
		int lastrow = sheet.getLastRowNum();
		int rowcount = lastrow + 1;
		int SNo = rowcount;

		Row row = null;
		int cellcount = 0;
		row = sheet.createRow(rowcount);
		String[] s = new String[3 + TcStatus.length];
		s[0] = Integer.toString(SNo);
		s[1] = dateInFormat;
		s[2] = TcID;
		for (int i = 0; i < TcStatus.length; i++) {
			getStatus()[i] = TcStatus[i];
			s[i + 3] = TcStatus[i];// to write pass and fail
		}
		int columnCount = 0;
		for (int i = 0; i < 3 + TcStatus.length; i++) {
			columnCount = cellcount + i;
			Cell cell = row.createCell(columnCount);
			cell.setCellValue(s[i]);
		}
		FileOutputStream outputStream = new FileOutputStream(filepath);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
		return columnCount;
	}

	public static String[] getStatus() {
		return status;
	}

	public static void setStatus(String status[]) {
		WriteExcel.status = status;
	}
}