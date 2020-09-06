package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"); 
					
      // create object of chrome driver
		
		ChromeDriver driver = new ChromeDriver();
	//load url	
	  driver.get ("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		  
	   //Maximize window
	  driver.manage().window().maximize();
	  //implicitly wait
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		WebElement clickright = driver.findElementByXPath("//span[text()='right click me']");
		
		Actions action = new Actions(driver);//class.
		
		action.contextClick(clickright).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
