package learnSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		
		//lunch chromedriver		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		   
		   
		   ChromeDriver driver = new ChromeDriver();
		   
		 //load url
		   driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		   //Maximize window
		   driver.manage().window().maximize();
		   //Implicitly wait
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByLinkText("Try it Yourself »").click();
		  
		// curentWindow = driver.get windowHandle()
		//System.out.println(curentwindow); 
		  
		Set<String> allwind = driver.getWindowHandles();
		 // foreach loop
		 for(String eachwin : allwind) { 
		 System.out.println(eachwin);
		 
		 
		   driver.switchTo().window(eachwin);
		   System.out.println(driver.getTitle());
		
			 
			 
			 
			 
		 }
		  

	}

}
