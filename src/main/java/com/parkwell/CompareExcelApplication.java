package com.parkwell;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompareExcelApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CompareExcelApplication.class, args);

		// Create an array list to store all of the accounts
		List accountList = new ArrayList<>();

		// Second array list to store all of billing accounts
		List billingList = new ArrayList<>();

		/*
		 * File file1 = new File("/Users/desireevanassche/dogz.xlsx"); FileInputStream
		 * fis1 = new FileInputStream(file1);
		 */

		// Import the first workbook Sheet

		FileInputStream fis1 = new FileInputStream("/Users/desireevanassche/dogz.xlsx");

		XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);

		XSSFSheet worksheet1 = workbook1.getSheet("Sheet1");

		int rowCount1 = worksheet1.getPhysicalNumberOfRows();

		// Import the workbook sheet we are comparing

		FileInputStream fis2 = new FileInputStream("/Users/desireevanassche/notdogz.xlsx");

		XSSFWorkbook workbook2 = new XSSFWorkbook(fis2);

		XSSFSheet worksheet2 = workbook2.getSheet("Sheet1");

		int rowCount2 = worksheet2.getPhysicalNumberOfRows();

		// Iterate over all data from sheet 1

		Iterator<Row> rowIterator1 = worksheet1.iterator();

		System.out.println("Active Accounts: ");
		while (rowIterator1.hasNext()) {
			Row row = rowIterator1.next();

			Iterator<Cell> cellIterator1 = row.cellIterator();

			while (cellIterator1.hasNext()) {
				Cell cell = cellIterator1.next();

				//This says check the account number in row 0 only, later we can add other columns that contain account numbers
				// by adding || & the columns numbers that are necessary 
					if (cell.getColumnIndex() == 0) {
						if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
							System.out.print(cell.getNumericCellValue() + "\t");
							accountList.add(cell.getNumericCellValue());
						} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							System.out.print(cell.getRichStringCellValue() + "\t");
							accountList.add(cell.getRichStringCellValue());
						} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
							System.out.print(cell.getBooleanCellValue() + "\t");
							accountList.add(cell.getBooleanCellValue());
						}

					
				}
			}

			System.out.println(" ");
		}

		System.out.println(" ");

		// iterate over data from sheet 2

		System.out.println("Billed Accounts: ");
		Iterator<Row> rowIterator2 = worksheet2.iterator();

		while (rowIterator2.hasNext()) {
			Row row = rowIterator2.next();

			Iterator<Cell> cellIterator2 = row.cellIterator();

			
			
			while (cellIterator2.hasNext()) {
				Cell cell2 = cellIterator2.next();

				if (cell2.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					System.out.print(cell2.getNumericCellValue() + " |  " );
					billingList.add(cell2.getNumericCellValue());
				} else if (cell2.getCellType() == Cell.CELL_TYPE_STRING) {
					System.out.print(cell2.getRichStringCellValue() + " | ");
					billingList.add(cell2.getRichStringCellValue());
				} else if (cell2.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
					System.out.print(cell2.getBooleanCellValue() );
					billingList.add(cell2.getBooleanCellValue() + " | ");
				}
			}
			System.out.println();

		}


//		boolean bool = accountList.equals(billingList);
//		System.out.println(bool);

// .Contains Practice 
		for (int i = 0; i < accountList.size(); i++) {
			if (!billingList.contains(accountList.get(i))) {
				System.out.println(accountList.get(i) + " is not being billed at this time.");

			} 
			System.out.println();
		}

	}
}
