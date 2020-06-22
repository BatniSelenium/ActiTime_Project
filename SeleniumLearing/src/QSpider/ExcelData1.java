package QSpider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./file_data/TestScript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CreateCustomer");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(2);
		String value = cell.getStringCellValue();
		System.out.println(value);
		wb.close();

	}

}
