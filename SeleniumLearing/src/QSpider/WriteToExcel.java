package QSpider;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./file_data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CreateCustomer");
		FileOutputStream fos= new FileOutputStream("./file_data/TestScript.xlsx");
		sheet.getRow(1).getCell(5).setCellValue("Fail");
		wb.write(fos);
		wb.close();
	}

	
	}


