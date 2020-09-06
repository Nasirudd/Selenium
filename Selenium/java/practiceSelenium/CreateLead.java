package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead {

	
	
	public static void main(String[] args) {
		
		
		
		
    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
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
	  driver.findElementById("createLeadForm_firstNameLocal").sendKeys("kuttee");
	  
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
	   	   
	   //enter important
	   driver.findElementById("createLeadForm_importantNote").sendKeys("byjul");
	   //enter country code
	   driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("7");
	   //enter area code
	   driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("kl");
	   //enter extention
	   driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("8");
	   //enter email address
	   driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
	   //enter to name
	    driver.findElementById("createLeadForm_generalToName").sendKeys("mac");
	   //enter address line 
	    driver. findElementByClassName("inputBox").sendKeys("local");
	     driver.findElementById("createLeadForm_generalAddress1").sendKeys("main");
	   
	   //enter city
	   driver.findElementById("createLeadForm_generalCity").sendKeys("vsa");
	   //enter postal
	   driver.findElementById("createLeadForm_generalPostalCode").sendKeys("22079");
	   //enter postal code ext
	     driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("23");
	   //parent account
	   // driver.findElementById("createLeadForm_parentPartyId").sendKeys("12");
	   //enter surname
	   driver.findElementById("createLeadForm_lastName").sendKeys("din");
	   	   //enter last name
	   driver.findElementById("createLeadForm_lastNameLocal").sendKeys("M");
	   //enter date of birth
	   driver.findElementById("createLeadForm_birthDate").sendKeys("1/1/95");
	   //enter department 
	   driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
	  //no employee
	   driver.findElementById("createLeadForm_numberEmployees").sendKeys("200");
	  //enter symble
	   driver.findElementById("createLeadForm_tickerSymbol").sendKeys("bird");
	   //enter phone
	   driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("321");
	   //ask for
	   driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("noor");
	   //web url
	   driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("mmm");
	   //attendent name
	   driver.findElementById("createLeadForm_generalAttnName").sendKeys("dhon mia");
	   //address 2
	   driver.findElementById("createLeadForm_generalAddress2").sendKeys("gram");
	  
	       WebElement source = driver.findElementById("createLeadForm_dataSourceId");
	       Select dd = new Select(source);
	       dd.selectByVisibleText("Employee");
	       
	       
	       WebElement industy = driver.findElementById("createLeadForm_industryEnumId");
	       Select dd1 = new Select(industy);	       	      
	       dd1.selectByVisibleText("Distribution"); 
	              
	       WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
	       Select dd2 = new Select(owner);
	       dd2.selectByValue("OWN_PROPRIETOR");
	       
	       WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	       Select dd3 = new Select(state);
	       dd3.selectByVisibleText("Virginia");
	       
	       WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
	       Select dd4 = new Select(market);
	       dd4.selectByVisibleText("Demo Marketing Campaign");
	       
	 /*  WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
	   Select dd2 = new Select(owner);
	   dd2.selectByIndex(1);
	   
	 /* WebElement sour = driver.findElementById("createLeadForm_dataSourceId");
	  Select dd3 = new Select(sour);
	  dd3.selectByValue("LEAD_DIRECTMAIL");  	  
	     
	   
	//   WebElement findElementById = driver.findElementById("createLeadForm_dataSourceId");
	  
	 WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	  Select dd4 = new Select(state);
	  dd4.selectByVisibleText("Virginia");*/
	     

	       //create lead
	 	   driver.findElementByName("submitButton").click();
	 	  	
			//close browser
			
			//	driver.close();	
			
	
	}
}    
	    
	    
	