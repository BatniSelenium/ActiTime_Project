package QSpider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopUp {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a/div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sanjana21batni@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("2sanjana123@");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@title='Sanjana S Batni']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='right download']")).click();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
	}

}
