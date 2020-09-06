package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
	
 
	   	System.setProperty("webdriver.chrome.driver","C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"); 
					
      // create object of chrome driver
		
		ChromeDriver driver = new ChromeDriver();
	//load url	
	  driver.get("https://jqueryui.com/droppable/");
	  
	  //Maximize window
	  driver.manage().window().maximize();
	  
	  //implicitly wait
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		//WebElement dra = driver.findElementById("draggable");
		
		     WebElement drag = driver.findElementById("draggable");
		     
		//WebElement dro = driver.findElementById("droppable");
		     
		   WebElement drop = driver.findElementById("droppable");
		   
		  //Actions action = new Actions(driver);  //
		   
		   Actions action = new Actions(driver);
		   
		   action.dragAndDrop(drag, drop).perform();
		   
		//frame action(extra practice)
		   
		 Thread.sleep(3000);
		 
		 driver.switchTo().defaultContent();
		
		
		
	   // Thread.sleep (3000);
	    
	    
		//action.dragAndDrop(dra,dro).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
