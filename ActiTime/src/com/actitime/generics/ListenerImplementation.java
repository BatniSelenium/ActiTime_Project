package com.actitime.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * 
 * @author Sanjana Batni
 *
 */
public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	/**
	 * Used to take Screenshot for successful tests
	 */
	public void onTestSuccess(ITestResult result) {
		String TestcaseNameSuccess= result.getName();
		TakesScreenshot t= (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dstn= new File("./Screenshot/"+TestcaseNameSuccess+".png");
		try {
			FileUtils.copyFile(src, dstn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	/**
	 * Used to Take Screenshots for Failed tests
	 */
	public void onTestFailure(ITestResult result) {
		String TestcaseNameFail= result.getName();
		TakesScreenshot t= (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dstn= new File("./Screenshot/"+TestcaseNameFail+".png");
		try {
			FileUtils.copyFile(src, dstn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	/**
	 * Used to Take screenshot for  Skipped test cases
	 */
	public void onTestSkipped(ITestResult result) {
		String TestcaseNameSkip= result.getName();
		TakesScreenshot t= (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dstn= new File("./Screenshot/"+TestcaseNameSkip+".png");
		try {
			FileUtils.copyFile(src, dstn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
