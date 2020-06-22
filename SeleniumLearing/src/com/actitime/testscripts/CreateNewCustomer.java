package com.actitime.testscripts;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;

public class CreateNewCustomer {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileLib f= new FileLib();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(f.getPropertyValue("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.findElement(By.xpath("//span[.='New']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='comboboxButton'])[1]")).click();
		driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
		String custName = f.getExcelValue("CreateCustomer", 1, 2, "./file_data/TestScript.xlsx");
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys(custName);
		String projName= f.getExcelValue("CreateCustomer", 1, 3, "./file_data/TestScript.xlsx");
		driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys(projName);
		String taskName = f.getExcelValue("CreateCustomer", 1, 4, "./file_data/TestScript.xlsx");
		driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys(taskName);
		driver.findElement(By.xpath("//div[.='Create Tasks']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[.='Project']")).click();
		Thread.sleep(5000);
		WebElement newTask = driver.findElement(By.xpath("//tbody[@id='actualTTRows']//span[.='HDFC']"));
		Thread.sleep(5000);
		
		if(newTask.isDisplayed())
		{
			f.setExcelValue("CreateCustomer", 1, 6, "Pass", "./file_data/TestScript.xlsx");
		}
		else
		{
			f.setExcelValue("CreateCustomer", 1, 6, "Fail", "./file_data/TestScript.xlsx");
		}
		
		System.out.println(f.getExcelValue("CreateCustomer", 1, 6, "./file_data/TestScript.xlsx"));
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
