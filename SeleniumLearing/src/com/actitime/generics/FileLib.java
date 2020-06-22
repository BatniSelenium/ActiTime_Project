package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This is the generic class for data driven testing
 * @author Sanjana S Batni
 *
 */

public class FileLib {
	/**
	 * Reading the data from PropertyFile
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyValue(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./file_data/CommonData.property");
		Properties p= new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
	
	/**
	 * This method is used to fetch the value of a specified cell in excel sheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @param epath
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelValue(String sheetname, int rownum, int cellnum, String epath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./file_data/TestScript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return value;
	}

	
	/**
	 * This method is used to modify the value in cell in excel sheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelValue(String sheetname, int rownum, int cellnum, String value, String epath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(epath);
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).setCellValue(value);
		FileOutputStream fos= new FileOutputStream(epath);
		wb.write(fos);
		wb.close();
	}
	
	
}
