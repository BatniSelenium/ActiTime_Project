package QSpider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Satish%20Krishna%20Rao/Documents/SANJANA/HTML%20and%20CSS%20Learning/page1.html");
		Thread.sleep(2000);
		WebElement tb1= driver.findElement(By.xpath("//input[@id='t1']"));
		WebElement tb2= driver.findElement(By.id("t2"));
		tb1.sendKeys("Q");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		tb2.sendKeys("J");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		tb1.sendKeys("S");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		tb2.sendKeys("S");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		tb1.sendKeys("P");
		Thread.sleep(2000);
		driver.switchTo().frame(tb2);
		tb2.sendKeys("P");
		Thread.sleep(2000);
		driver.close();
	}	
}
