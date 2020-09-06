package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectWrapper;


public class CngXml extends ProjectWrapper {

	//public static void main(String[] args) {
	
	
	    @Test
		
	 public void cngTest() {	
		

	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		//create object of chromeDriver
	ChromeDriver driver = new ChromeDriver();
		
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
		
		//driver.findElementById("username").sendKeys("demosalesmanager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click Login

		//driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByClassName("decorativeSubmit").click();
		//click crm/sfa
		driver.findElementByLinkText("CRM/SFA").click();   */
		//click create lead
	     
	    	driver.findElementByLinkText("Create Lead").click();
	    //enter company name
	      driver.findElementById("createLeadForm_companyName").sendKeys("ADC");
		//click leads link
		driver.findElementByLinkText("Leads").click();
		//click find leeds
       driver.findElementByLinkText("Find Leads").click();
       //enter first name ?
           driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
        //   clic Find leads button?        
       driver.findElementByXPath("(//button[@class ='x-btn-text'])[7]").click();
        
        
       
       
       
       
	}

}
