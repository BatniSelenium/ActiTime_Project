package QSpider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(), 'Resources')]"));
		Actions a= new Actions(driver);
		a.moveToElement(resources).perform();
		driver.findElement(By.xpath("//h6[contains(text(), 'Contact')]")).click();
		String phNum = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println("Bengaluru's Phone number is : "+ phNum);
		driver.close();

	}

}
