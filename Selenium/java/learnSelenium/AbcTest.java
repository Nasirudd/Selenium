package learnSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbcTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		//create object of chromeDriver
	ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize window
		
		
	}

}
