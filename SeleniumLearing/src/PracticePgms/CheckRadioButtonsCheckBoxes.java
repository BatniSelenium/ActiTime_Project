package PracticePgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckRadioButtonsCheckBoxes extends CheckAlignment{
	
	public void checkBox()
	{
		WebElement cb = driver.findElement(By.xpath("//label/input[@name='remember']"));
		cb.click();
		System.out.println("3-Test to check if Checkbox is selected or not");
		if(cb.isSelected())
		{
			System.out.println("It is selected");
		}
		else
		{
			System.out.println("It is not selected");
		}
	}
	
	public void checkSubmitButton()
	{
		WebElement sb = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("___________________________________________________");
		System.out.println("4-Test to check if Submit button is enabled or not");
		if(sb.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is disabled");
		}
			
	}
	
	public void checkImage()
	{
		WebElement ci = driver.findElement(By.xpath("//div/a[@class='site-logo']"));
		System.out.println("_____________________________________________________");
		System.out.println("5-Test to check if image is present or not");
		if(ci.isDisplayed())
		{
			System.out.println("Pass: Image is present");
		}
		else
		{
			System.out.println("Fail: Image is not present");
		}
	}

}
