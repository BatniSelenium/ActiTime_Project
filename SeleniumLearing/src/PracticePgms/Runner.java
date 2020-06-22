package PracticePgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner extends CheckRadioButtonsCheckBoxes{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		Runner r= new Runner();
		r.GetTextBoxHeightWidth_Email();
		r.GetTextBoxHeightWidth_Pwd();
		r.compareBoxes();
		r.checkAxisEmail();
		r.checkAxisPwd();
		r.checkBox();
		r.checkSubmitButton();
		r.checkImage();
	
	
	}	
		
}

	
	
	


