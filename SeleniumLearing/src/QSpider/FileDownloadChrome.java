package QSpider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownloadChrome {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[.='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sanjana21batni@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("2sanjana123@");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='Sanjana S Batni']")).click();
		
		Actions a= new Actions(driver);
		WebElement download = driver.findElement(By.xpath("//div[@class='right download']"));
		Thread.sleep(3000);
		a.moveToElement(download).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@title='Click here to download your resume']")).click();
		
		Thread.sleep(5000);
		WebElement myNaukri = driver.findElement(By.xpath("//div[text()='My Naukri']"));
		a.moveToElement(myNaukri).perform();
		driver.findElement(By.className("logout-gnb")).click();
		
		driver.quit();

	}

}
