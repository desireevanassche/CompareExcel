package com.parkwell;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
//	/*
//	 * File file1 = new File("/Users/desireevanassche/dogz.xlsx"); FileInputStream
//	 * fis1 = new FileInputStream(file1);
//	 */
//	
//	// Import the first workbook Sheet 
//
//	FileInputStream fis1 = new FileInputStream("/Users/desireevanassche/dogz.xlsx");
//	
//	XSSFWorkbook workbook1 = new XSSFWorkbook(fis1); 
//	
//	XSSFSheet worksheet1 = workbook1.getSheet("Sheet1"); 
//	
//	int rowCount1 = worksheet1.getPhysicalNumberOfRows(); 
//	
//	
//	// Import the workbook sheet we are comparing 
//
//	FileInputStream fis2 = new FileInputStream("/Users/desireevanassche/notdogz.xlsx"); 
//	
//	XSSFWorkbook workbook2 = new XSSFWorkbook(fis2); 
//	
//	XSSFSheet worksheet2 = workbook2.getSheet("Sheet1");
//	
//	int rowCount2 = worksheet2.getPhysicalNumberOfRows(); 
//	
//	// Iterate over all data from sheet 1 
//	
//	Iterator<Row> rowIterator1 = worksheet1.iterator();
//
//	while (rowIterator1.hasNext()) {
//		Row row = rowIterator1.next();
//
//	Iterator<Cell> cellIterator1 = row.cellIterator();
//	
//	while (cellIterator1.hasNext()) { 
//		Cell cell = cellIterator1.next(); 
//		
//		switch(cell.getCellType()) {
//		
//		case Cell.CELL_TYPE_STRING: 
//			System.out.println(cell.getStringCellValue() + "\t");
//			break; 
//			
//		case Cell.CELL_TYPE_NUMERIC:
//			System.out.println(cell.getNumericCellValue() + "\t");
//		break; 
//		
//		case Cell.CELL_TYPE_BOOLEAN: 
//			System.out.println(cell.getNumericCellValue() + "\t");
//		}
//	}
//		System.out.println(" ");
//	}
//	
//	// iterate over data from sheet 2 
//	
//	Iterator<Row> rowIterator2 = worksheet2.iterator();
//
//	while (rowIterator2.hasNext()) {
//		Row row = rowIterator2.next();
//
//	Iterator<Cell> cellIterator2 = row.cellIterator();
//	
//	while (cellIterator2.hasNext()) { 
//		Cell cell = cellIterator2.next(); 
//		
//		switch(cell.getCellType()) {
//		
//		case Cell.CELL_TYPE_STRING: 
//			System.out.println(cell.getStringCellValue() + "\t");
//			break; 
//			
//		case Cell.CELL_TYPE_NUMERIC:
//			System.out.println(cell.getNumericCellValue() + "\t");
//		break; 
//		
//		case Cell.CELL_TYPE_BOOLEAN: 
//			System.out.println(cell.getNumericCellValue() + "\t");
//		}
//	}
//		System.out.println(" ");
//	}
//}
}
	
