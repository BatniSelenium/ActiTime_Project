package QSpider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMenu1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement link= driver.findElement(By.xpath("//a[@title='Google apps']"));
		Actions a= new Actions(driver);
		a.contextClick(link).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_W);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window : allWindows)
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.close();
		}
	}

}
