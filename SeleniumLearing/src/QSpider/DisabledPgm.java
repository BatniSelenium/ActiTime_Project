package QSpider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisabledPgm {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Satish%20Krishna%20Rao/Documents/SANJANA/HTML%20and%20CSS%20Learning/disabled.html");
		driver.findElement(By.id("d1")).sendKeys("Sanjana");
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("document.getElementById('d2').value='Manager'");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close(); 
	}

}
