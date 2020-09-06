package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextPartial {

	public static void main(String[] args) {
		
	//lunch chrome driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
//	lunch url
	driver.get("http://tepeople.com/Client.html");
   //maximize window
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//click about us
	driver.findElementByXPath("//a[text()='About US']").click();
			
   //click IT service
	driver.findElementByXPath("//a[text()='IT Services']").click();
	//
	//click specialised training
	
	driver.findElementByXPath("//a[contains(text(),'Specialize]d Tr')").click();
	
	}

}
