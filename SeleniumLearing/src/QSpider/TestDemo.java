package QSpider;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void testDemo()
	{
		 Reporter.log("Welcome to Qspider", true);
		
	}
	@Test
	public void demo2()
	{
		Reporter.log("This is TestNG", true);
	}
	@Test
	public void demo3()
	{
		Reporter.log("I am Gum", true);
	}
}
