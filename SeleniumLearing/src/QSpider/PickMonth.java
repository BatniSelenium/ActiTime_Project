package QSpider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickMonth {
	WebDriver driver=new ChromeDriver();
	
	
	public void MonthSelector(String reqMonth) throws InterruptedException
	{	
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/label[@for='departure']")).click();
		Thread.sleep(5000);
		WebElement arrow = driver.findElement(By.xpath("//div/span[@aria-label='Next Month']"));
		
		if(reqMonth.equals("June"))
		{
			for(int i=0; i<=1;i++)
			{
				arrow.click();
			}
			
		}
		else if(reqMonth.equals("July"))
		{
			for(int i=0; i<=2;i++)
				{
					arrow.click();
				}
			
		}
		else if(reqMonth.equals("August"))
		{
			for(int i=0; i<=3;i++)
			{
				arrow.click();
			}
			
		}
		else if(reqMonth.equals("September"))
		{
			for(int i=0; i<=4;i++)
			{
				arrow.click();
			}
			
		}
		else if(reqMonth.equals("October"))
		{
			for(int i=0; i<=5;i++)
			{
				arrow.click();
			}
		}
		else if(reqMonth.equals("November"))
		{
			for(int i=0; i<=6;i++)
			{
				arrow.click();
			}
			
		}
		else if(reqMonth.equals("December"))
		{
			for(int i=0; i<=7;i++)
			{
				arrow.click();
			}
			
		}	

	}
	
	public void dateSelector() throws InterruptedException
	{
	    driver.findElement(By.xpath("(//div[@class='DayPicker-Day']/div/p[.='23'])[1]")).click();
	    Thread.sleep(3000);
	    driver.close();
	}
	
	public void dateSelectorMay() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/label[@for='departure']")).click();
		Thread.sleep(5000);
		WebElement arrow = driver.findElement(By.xpath("//div/span[@aria-label='Next Month']"));
		arrow.click();
		driver.findElement(By.xpath("(//div[@class='DayPicker-Month']//div/p[.='25'])[1]")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	public void dateSelectorApril() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/label[@for='departure']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='DayPicker-Month']//div/p[.='30'])[1]")).click();
		driver.close();
	}
	
	
}
