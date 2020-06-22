package QSpider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadNumericValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./file_data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CreateCustomer");
		String value1 = sheet.getRow(1).getCell(4).getStringCellValue();
		System.out.println(value1);
		wb.close();
		double value2= sheet.getRow(3).getCell(4).getNumericCellValue();
		System.out.println(value2);
		System.out.println(sheet.getRow(2).getCell(4));
	}

}
