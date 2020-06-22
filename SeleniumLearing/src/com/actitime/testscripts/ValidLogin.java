package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;

public class ValidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws IOException {
		FileLib f= new FileLib();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(f.getPropertyValue("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
