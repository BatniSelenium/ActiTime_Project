package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Sanjana Batni
 *
 */
public class FileLib {
	
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyValue(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./data/CommonData.property");
		Properties p= new Properties();
		p.load(fis);
		String pvalue = p.getProperty(key);
		return pvalue;
	}
	
	/**
	 * This is used to read the data from excel file while executing test case
	 * @param sheetname
	 * @param rownum
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelvalue(String sheetname, int rownum, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./data/TestScripts.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String eValue = wb.getSheet(sheetname).getRow(rownum).getCell(cell).getStringCellValue();
		return eValue;
	}
	
	/**
	 * This is used to write value into excel file
	 * @param sheetname
	 * @param rownum
	 * @param cell
	 * @param text
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelValue(String sheetname, int rownum, int cell, String text) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./data/TestScripts.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rownum).getCell(cell).setCellValue(text);
		FileOutputStream fos= new FileOutputStream("./data/TestScripts.xlsx");
		wb.write(fos);
		wb.close();
	}

}
