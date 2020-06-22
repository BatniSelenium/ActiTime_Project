package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.actitime.generics.FileLib;

public class ReadAndWriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f= new FileLib();
		f.getExcelValue("CreateCustomer", 1, 5, "./file_data/TestScript.xlsx");
		f.setExcelValue("CreateCustomer", 1, 5, "Pass", "./file_data/TestScript.xlsx");
		f.getExcelValue("CreateCustomer", 1, 5, "./file_data/TestScript.xlsx");

	}

}
