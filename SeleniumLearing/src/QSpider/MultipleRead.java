package QSpider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./file_data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CreateCustomer");
		int rowNum = sheet.getLastRowNum();
		for(int i=1; i<=rowNum; i++)
		{
			String tcnum = sheet.getRow(i).getCell(0).getStringCellValue();
			String cust_id= sheet.getRow(i).getCell(2).getStringCellValue();
			String pro_name= sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(tcnum +"\t"+ cust_id +"\t"+ pro_name);
		}
		

	}

}
