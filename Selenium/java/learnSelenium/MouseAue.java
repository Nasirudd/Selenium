package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
      // create object of chrome driver
		
		ChromeDriver driver = new ChromeDriver();
	//load url	
	  driver.get("http://mrbool.com/");
	  
	  //Maximize window
	  driver.manage().window().maximize();
	  //implicitly wait
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   
	     WebElement content = driver.findElementByClassName("menulink");
	     
	     Actions action = new Actions(driver);
	  
	     action.moveToElement(content).perform();
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
