package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class SearchWiproJobs {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testSearchWiproJobs()
	{
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Search Wipro jobs" + Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='r']//h3"));
		int count = allLinks.size();
		for(int i=0; i<count; i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
