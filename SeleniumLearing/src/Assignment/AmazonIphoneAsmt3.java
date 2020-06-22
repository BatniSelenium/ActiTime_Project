package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonIphoneAsmt3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testAmazonIphone() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> productName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> productCost = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../../../../..//span[@class='a-price-whole']"));
		int count = productName.size();
		for(int i=0; i<count; i++)
		{
				WebElement name = productName.get(i);
				String nameText = name.getText();
				WebElement cost = productCost.get(i);
				String costText = cost.getText();
				System.out.println("Product Name=> "+ nameText +"   "+ "Product Cost=> "+ costText);
		}
		driver.close();
	}
}
