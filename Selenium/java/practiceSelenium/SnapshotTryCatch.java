package practiceSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.google.common.io.Files;

public class SnapshotTryCatch {

	public static void main(String[] args) throws IOException {
		
										
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
			
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
			//Enter password
			driver.findElementById("password").sendKeys("crmsfa");
			
			//click Login
			//driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByClassName("decorativeSubmit").click();
			//click crm/sfa
			driver.findElementByLinkText("CRM/SFA").click();
			//click create lead  ***
		     
		  	driver.findElementByLinkText("Create Lead").click();
		    //enter company name
		   driver.findElementById("createLeadForm_companyName").sendKeys("Tcs");
		  //enter first name
		   driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		   
		   //enter first name***
		   //driver.findElementById("createLeadForm_companyName").sendKeys("xyz");
		 
			try {
				driver.findElementById("createLeadForm_firstNameLocalM").sendKeys("kuttee");//M added with local
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			File sorcs = driver.getScreenshotAs(OutputType.FILE);//take snapshot and store in temporary file.
		      
		    File dest = new File("C:\\Users\\nasir\\Desktop\\selsnap\\image.png");//define the the path where it will store.
		      
		    FileUtils.copyFile(sorcs, dest);//moving file store to destination
		  
		  
		 // Enter Last Name*
		  
		   //enter salutation
		   driver.findElementById("createLeadForm_personalTitle").sendKeys("well");
		   //enter title
		   
		   driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MS");
	       //enter annual revenue
		   driver.findElementById("createLeadForm_annualRevenue").sendKeys("200");
		   //enter code
		   driver.findElementById("createLeadForm_sicCode").sendKeys("23");
		   	   //enter description
		   driver.findElementById("createLeadForm_description").sendKeys("Tcs");  
		   	   
		  

		       //create lead
		 	   driver.findElementByName("submitButton").click();
		 	  	
				//close browser
				
				//	driver.close();	
				
		}
	    
}
