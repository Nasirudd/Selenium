package wrapper2;

import org.testng.annotations.Test;


public class Singlabash extends Superbash {


@Test (dataProvider = "getData")
	
	public void subclass (String cName, String fName, String lName) {
		
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		
		driver.findElementByName("submitButton").click();
			
	
}
}


