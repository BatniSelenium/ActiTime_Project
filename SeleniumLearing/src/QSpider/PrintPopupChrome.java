package QSpider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintPopupChrome {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		for(int i=0; i<=3;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_1);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(3000);
		for(int i=0; i<=1; i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		for(int i=0; i<=1; i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
		}
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();
		/*Thread.sleep(5000);
		driver.findElement(By.className("action-button")).click();
		driver.close();*?
		
		/*WebElement pages = driver.findElement(By.xpath("//div/select[@aria-labelledby='pages-label']"));
		Select s1= new Select(pages);
		s1.selectByValue("1");
		driver.findElement(By.xpath("//input[@aria-label='e.g. 1-5, 8, 11-13']")).sendKeys("1");
		
		WebElement layout = driver.findElement(By.id("layout-label"));
		Select s2= new Select(layout);
		s2.selectByVisibleText("Landscape");
		
		WebElement colour = driver.findElement(By.id("color-label"));
		Select s3= new Select(colour);
		s3.selectByValue("bw"); */
	}

}
