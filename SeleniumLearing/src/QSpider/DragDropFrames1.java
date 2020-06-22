package QSpider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropFrames1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		 Actions a= new Actions(driver);
		 WebElement draggable = driver.findElement(By.id("draggable"));
		 WebElement droppable= driver.findElement(By.id("droppable"));
		 a.dragAndDrop(draggable, droppable).perform();
		 Thread.sleep(5000);
		 driver.close();
	}

}
