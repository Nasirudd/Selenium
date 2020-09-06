  package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//lunch chromedriver		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		 //create object of crome driver  
		
		ChromeDriver driver = new ChromeDriver();	
		
		 //load url
		  
			driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		   //Maximize window
		   driver.manage().window().maximize();
		   
		   //Implicitly wait
		   
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click submit btn
		   driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();    //collection xpath
		   
		   //driver. switchTo().alert()
		 //  Alert simpleAlert = driver.switchTo().alert();                            //using ctrl=2-L
		 //  System.out.println(simpleAlert.getText());
		   
		  // Thread.sleep(3000);
		   
		  //simpleAlert.accept();
		   
		  //2nd method of simple alert
		   String alertMessage = driver.switchTo().alert().getText();
		   System.out.println(alertMessage);
		   Thread.sleep(5000);
		   
		   driver.switchTo().alert().accept();
		   
		   
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
