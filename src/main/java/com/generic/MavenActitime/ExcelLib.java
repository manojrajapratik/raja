package com.generic.MavenActitime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib implements AutoConst {

	public static String readSheet(String sheet_name, int row, int cell) throws IOException {

		String cellValue;

		FileInputStream fis = new FileInputStream(sheet_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		cellValue = wb.getSheet(sheet_name).getRow(row).getCell(cell).getStringCellValue();

		return cellValue;
	}

}
