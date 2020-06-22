package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAsmt1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone 11" + Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> productCost = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		int count= productName.size();
		System.out.println(count);
		/*for(int i=0; i<count; i++)
		{
			WebElement name = productName.get(i);
			WebElement cost = productCost.get(i);
			String text= name.getText();
			String price = cost.getText();
			System.out.println("Product Name=>"+ text +"          "+ "Product Cost=>"+ price);
		}*/
		String pcosttext = null;
		for(WebElement pname : productName)
		{
			String pnametext = pname.getText();
			
			for(WebElement pcost : productCost)
			{
				
				pcosttext= pcost.getText();
			}
			
			System.out.println(pnametext + " " + pcosttext);
			
		}
		driver.close();
	}

}
