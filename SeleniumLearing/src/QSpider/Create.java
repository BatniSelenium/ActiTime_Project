package QSpider;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Create {
	@Test(enabled = false)
	public void createCustomer()
	{
		Reporter.log("TC_1: Create Customer", true);
	}
	
	@Test(dependsOnMethods = "createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("TC_2: Modify Customer", true);
	}

}
