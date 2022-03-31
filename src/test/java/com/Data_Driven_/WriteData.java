package com.Data_Driven_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
 public static void main(String[] args) throws IOException {
	 
	 File f = new File ("C:\\Users\\sathisea\\Documents\\Project class\\Write_data.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
	    // Sheet sht = wb.createSheet("user_data");
	   //  Row createRow = sht.createRow(0);
	   //  Cell createCell = createRow.createCell(0);
	   //  createCell.setCellValue("ID");
		wb.createSheet("userData").createRow(0).createCell(0).setCellValue("ID");
		wb.getSheet("userData").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("userData").createRow(1).createCell(0).setCellValue("sathish");
		wb.getSheet("userData").getRow(1).createCell(1).setCellValue("satz123");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

}

}
