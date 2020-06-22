package QSpider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFileTab {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//a[@class='nav-item'][1]")).click();
		WebElement downloadlink = driver.findElement(By.linkText("3.141.59"));
		downloadlink.click();
		Thread.sleep(3000);
		
		Robot r= new Robot();
		//using tab keys
		for(int i=0; i<=1; i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		//using arrow keys
		downloadlink.click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
	}

}
