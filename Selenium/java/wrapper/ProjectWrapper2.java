package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectWrapper2 {

public   ChromeDriver driver ;
	
  @BeforeMethod
	
   public void login () {
		// TODO Auto-generated constructor stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		//create object of chromeDriver
	   driver = new ChromeDriver();
		
		//Load URL
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize window
		
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
				
		// Implicitly wait
		
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
										
		//Enter username
		//driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click Login

		//driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByClassName("decorativeSubmit").click();
		//click crm/sfa
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		
	}

 @AfterMethod
 public void aamm () {
	 driver.close();
	 
	 
 }
 
}
