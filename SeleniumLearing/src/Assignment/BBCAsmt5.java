package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BBCAsmt5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testBBC()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> headlines = driver.findElements(By.xpath("//h3/a[contains(text(),'     ')]"));
		
		for(int i=0; i<5; i++)
		{
			WebElement headIndex = headlines.get(i);
			String top5Headlines = headIndex.getText();
			System.out.println(top5Headlines);
		}
		driver.close();
		
	
	}
}
