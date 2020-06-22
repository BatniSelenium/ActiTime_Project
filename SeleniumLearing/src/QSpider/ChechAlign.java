package QSpider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ChechAlign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\Satish Krishna Rao\\Documents\\SANJANA\\HTML and CSS Learning\\Hotel.html");
		WebElement udupiLB = driver.findElement(By.id("udupi"));
		Select s= new Select(udupiLB);
		List<WebElement> options = s.getOptions();
		int allCount = options.size();
		System.out.println("No of options: "+ allCount);
		System.out.println("Available options are");
		for(WebElement option : options)
		{
			String text = option.getText();
			System.out.println(text);
		}
		System.out.println("_______________________________________");
		
		s.selectByIndex(1);
		s.selectByValue("b");
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		int selectedCount = selectedoptions.size();
		System.out.println("No. of items selected: "+ selectedCount);
		System.out.println("Selected options");
		for(WebElement selectedOption: selectedoptions)
		{
			String text2= selectedOption.getText();
			System.out.println(text2);
		}
		s.deselectAll();
		if(s.isMultiple()) {
			System.out.println("Yes, it is multiple select list box");
		}
		else
		{
			System.out.println("It is not multiple select list box");
		}
		driver.close();
	}

}
