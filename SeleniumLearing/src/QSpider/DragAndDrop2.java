package QSpider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(3000);
		WebElement src1 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		WebElement dstn1 = driver.findElement(By.xpath("//h1[.='Block 3']"));
	
		Actions a= new Actions(driver);
		a.dragAndDrop(src1, dstn1).perform();
		a.release(dstn1);
		Thread.sleep(3000);
		
		WebElement src2 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		WebElement dstn2 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		a.dragAndDrop(src2, dstn2).perform();
		a.release(dstn2);
		Thread.sleep(3000);
		
		WebElement src3 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement dstn3 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		int x1 = dstn3.getLocation().getX();
		int y1 = dstn3.getLocation().getY();
		int x2= src3.getLocation().getX();
		int y2= src3.getLocation().getY();
		int x= x1-x2;
		int y= y1-y2;
		a.dragAndDropBy(src3, x, y).perform();
		Thread.sleep(3000);
		
		WebElement src4 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		WebElement dstn4 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		int x3= dstn4.getLocation().getX();
		int y3= dstn4.getLocation().getY();
		int x4= src4.getLocation().getX();
		int y4= src4.getLocation().getY();
		int X= x3=x4;
		int Y= y3-y4;
		a.dragAndDropBy(src4, X, Y).perform();
		Thread.sleep(3000);
		
		driver.close();
	}

}
