package QSpider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AscDescListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\Satish Krishna Rao\\Documents\\SANJANA\\HTML and CSS Learning\\Hotel.html");
		WebElement krishnaLB = driver.findElement(By.id("krishna"));
		Select s= new Select(krishnaLB);
		ArrayList<String> al= new ArrayList();
		
		List<WebElement> allOptions = s.getOptions();
		int count= allOptions.size();
		System.out.println("Available options in Inserted order");
		for(int i=0; i<count; i++)
		{
			WebElement text = allOptions.get(i);
			String str = text.getText();
			System.out.println(str);
		}
		System.out.println("___________________________________");
		System.out.println("List in reverse order");
		for(int j=count-1; j>=0; j--)
		{
			WebElement text2 = allOptions.get(j);
			String str2 = text2.getText();
			System.out.println(str2);
		}
		
		System.out.println("__________________________________");
		System.out.println("List in Ascending order");
		for(int k=0; k<count; k++)
		{
			WebElement text1= allOptions.get(k);
			String str1 = text1.getText();
			al.add(str1);
			Collections.sort(al);
		}
		for(String sortedList: al)
		{
			System.out.println(sortedList);
		}
		System.out.println("__________________________________");
		System.out.println("List in descending order");
		Collections.reverse(al);
		for(String revsortedList: al)
		{
			System.out.println(revsortedList);
		}
		
		
		driver.close();
	}

}
