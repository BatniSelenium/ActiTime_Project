package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	public FileLib f= new FileLib();
	
	@BeforeClass(groups= {"SanityTest", "RegressionTest"})
	public void openBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser opened", true);
	}
	
	@AfterClass(groups= {"SanityTest", "RegressionTest"})
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Browser closed", true);
	}
	
	@BeforeMethod(groups= {"SanityTest", "RegressionTest"})
	public void login() throws IOException
	{
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get(f.getPropertyValue("url"));
		 driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
		 driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
		 driver.findElement(By.xpath("//div[.='Login ']")).click();
		 Reporter.log("Logged in", true);
	}
	
	@AfterMethod(groups= {"SanityTest", "RegressionTest"})
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("logged out" , true);
	}
	

}
