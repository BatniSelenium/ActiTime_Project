package QSpider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Resources')]"))).perform();
		driver.findElement(By.xpath("//h6[contains(text(),'Customers')]")).click();
		driver.findElement(By.xpath("//a[.='Agree']")).click();
		WebElement buttonClick = driver.findElement(By.xpath("//button[.='READ FULL STORY']"));
		a.doubleClick(buttonClick).perform();
		
		String url = driver.getCurrentUrl();
		if(url.contains("hackerearth"))
		{
			System.out.println("Button double clicked Successfully ");
		}
		else
		{
			System.out.println("Button double click failed");
		}
		
		WebElement dClick = driver.findElement(By.xpath("//strong[.='INDUSTRY']"));
		a.doubleClick(dClick).perform();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
