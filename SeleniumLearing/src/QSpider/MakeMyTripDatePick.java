package QSpider;

public class MakeMyTripDatePick extends PickMonth {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {	
		MakeMyTripDatePick mp= new MakeMyTripDatePick();
		mp.MonthSelector("December");
		mp.dateSelector();
		//mp.dateSelectorMay();
		//mp.dateSelectorApril();
	}

}
