package wrapper2;

import org.testng.annotations.Test;

public class ParametersDataSub extends ParamDataWrapper  {
	
    @Test(dataProvider = "getData")
		
        public void paraTest(String cName, String fName, String lName, String lcName) {	
		
		
		
		//click crm/sfa
		
		//click create lead
		//driver.findElementByLinkText("Create Lead").click();
	  	driver.findElementByLinkText("Create Lead").click();
	     //enter company name
	   //driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	  	driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	   
	  //enter forname
	  // driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	  	driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	  	
	  	
	  	driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	   //enter first name
	   //driver.findElementById("createLeadForm_companyName").sendKeys("GB");
	   

	   
	  driver.findElementById("createLeadForm_firstNameLocal").sendKeys(lcName);
	  
	    //enter salutation
	    driver.findElementById("createLeadForm_personalTitle").sendKeys("well");
	   //enter title
	   
	   driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms");
	   //enter annual revenue
	   driver.findElementById("createLeadForm_annualRevenue").sendKeys("200");
	   //enter code
	   driver.findElementById("createLeadForm_sicCode").sendKeys("23");
	   	   //enter description
	   driver.findElementById("createLeadForm_description").sendKeys("TCS");
	   //enter important
	   driver.findElementById("createLeadForm_importantNote").sendKeys("byjul");
	   //enter country code
	   driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
	   //enter area code
	   driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("234");
	   //enter extention
	   driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("8");
	   //enter email address
	  driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
	   //enter to name
	   driver.findElementById("createLeadForm_generalToName").sendKeys("mac");

	   //enter address line 
	   

		  //findElementByClassName("inputBox").sendKeys("local");
		  // driver.findElementById("createLeadForm_generalAddress1").sendKeys("main");
		   
		   //enter city
		  // driver.findElementById("createLeadForm_generalCity").sendKeys("sy");
		   //enter postal
		 //  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("22079");
		   //enter postal code ext
		//   driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1000");
		   //parent account
		 //  driver.findElementById("createLeadForm_parentPartyId").sendKeys("1000");
		   //enter surname
		  // driver.findElementById("createLeadForm_lastName").sendKeys("din");
		   	   //enter last name
		   driver.findElementById("createLeadForm_lastNameLocal").sendKeys("M");
		   //enter date of birth
		  // driver.findElementById("createLeadForm_birthDate").sendKeys("1/1/95");
		   //enter department 
		   driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		  //no employee
		   driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		  //enter symble
		  // driver.findElementById("createLeadForm_tickerSymbol").sendKeys("bird");
		   //enter phone
		   driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
		   //ask for
		  // driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("noor");
		   //web url
		  // driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		   //attendent name
		  // driver.findElementById("createLeadForm_generalAttnName").sendKeys("dhon mia");
		   //address 2
		 // driver.findElementById("createLeadForm_generalAddress2").sendKeys("gram");
		   //create lead
		   //driver.findElementByName("submitButton").click();/*

			  /* WebElement source = driver.findElementById("createLeadForm_dataSourceId");
			   Select dd = new Select(source);
			   dd.selectByVisibleText("Employee");
			   
			   WebElement indust = driver.findElementById("createLeadForm_industryEnumId");
			   Select dd1 = new Select(indust);
			   dd1.selectByValue("IND_AEROSPACE");
			   
			   WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
			   Select dd2 = new Select(owner);
			   dd2.selectByIndex(1);
			   
			  WebElement sour = driver.findElementById("createLeadForm_dataSourceId");
			  Select dd3 = new Select(sour);
			  dd3.selectByValue("LEAD_DIRECTMAIL");  	  
			     
			   
			//   WebElement findElementById = driver.findElementById("createLeadForm_dataSourceId");
			  
			 WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			  Select dd4 = new Select(state);
			  dd4.selectByVisibleText("Virginia");*/
    }  
			    
}   
	   
	   
	



	

	



