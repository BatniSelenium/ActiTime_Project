package QSpider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelUploadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li/a/div[.='Login']")).click();
		driver.findElement(By.xpath("//div[@class='form-row']/input[@type='text']")).sendKeys("sanjana21batni@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-row']/input[@type='password']")).sendKeys("2sanjana123@");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//div[@title='Sanjana S Batni']")).click();
		Thread.sleep(5000);
		
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@value='Update Resume']"));
		Actions a= new Actions(driver);
		a.moveToElement(uploadBtn).perform();
		a.doubleClick(uploadBtn).perform();
		
		
		//driver.close(); 
		
	}

}
