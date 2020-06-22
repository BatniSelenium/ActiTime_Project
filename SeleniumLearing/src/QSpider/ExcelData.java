package QSpider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./file_data/TestScript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);
	}

}
