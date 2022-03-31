package com.Data_Driven_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {



	public static void	particular_Cell_Data() throws IOException
	{

		File f = new File ("C:\\Users\\sathisea\\eclipse-workspace\\Maven\\Test case\\Test Case- Automation Practice.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {

			String CellValue = c.getStringCellValue();
			System.out.println(CellValue);

		}
		else if(ct.equals(CellType.NUMERIC))
		{
			double CellValue = c.getNumericCellValue();
			int value = (int) CellValue;  //narrow casting
			System.out.println(value);


		}

		wb.close();
	}

	public static void	allData() throws IOException
	{

		File f = new File ("C:\\Users\\sathisea\\eclipse-workspace\\Maven\\Test case\\Test Case- Automation Practice.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);// i represents row index

			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j); // j represents cell index
				
				CellType ct = c.getCellType();
				if (ct.equals(CellType.STRING)) {

					String CellValue = c.getStringCellValue();
					System.out.println(CellValue);

				}
				else if(ct.equals(CellType.NUMERIC))
				{
					double CellValue = c.getNumericCellValue();
					int value = (int) CellValue;  //narrow casting
					System.out.println(value);
			}


		}
		}

		wb.close();

	}	

	public static void main(String[] args) throws IOException {


		allData();
	}

}
