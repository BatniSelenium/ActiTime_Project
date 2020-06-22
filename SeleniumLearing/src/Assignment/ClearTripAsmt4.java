package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClearTripAsmt4 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testClearTrip() throws InterruptedException, AWTException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//i[@class='icon ir datePicker'])[1]")).click();
		driver.findElement(By.xpath("//a[.='25']")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		Thread.sleep(4000);
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
		Thread.sleep(4000);
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(4000);
		
		List<WebElement> allFlights = driver.findElements(By.xpath("//tbody[@class='segment  ']"));
		int count = allFlights.size();
		
		List<WebElement> flightName = driver.findElements(By.xpath("//small[contains(text(), '     ')]"));
		List<WebElement> dTime = driver.findElements(By.xpath("//small[contains(text(), '     ')]/../..//th[@class='depart']"));
		List<WebElement> aTime = driver.findElements(By.xpath("//small[contains(text(), '     ')]/../..//th[@class='arrive']"));
		
		Thread.sleep(3000);
		for(int i=0;i<count; i++)
		{
			WebElement flightNameIndex = flightName.get(i);
			String flightNameText = flightNameIndex.getText();
			
			WebElement flightDepartureTimeIndex = dTime.get(i);
			String flightDepartureText= flightDepartureTimeIndex.getText();
			
			WebElement flightArrivalTimeIndex = aTime.get(i);
			String flightArrivalText= flightArrivalTimeIndex.getText();
			Thread.sleep(3000);
			System.out.println(flightNameText + "   " + flightDepartureText + "   " + flightArrivalText );
		}
		driver.close();
	}
}
