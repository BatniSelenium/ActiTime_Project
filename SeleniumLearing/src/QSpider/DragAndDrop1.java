package QSpider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(3000);
		WebElement src1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement dstn1 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		
		Actions a= new Actions(driver);
		a.dragAndDrop(src1, dstn1).perform();
		Thread.sleep(3000);
		
		
		driver.close();
	}

}
