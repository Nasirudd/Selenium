package learnInterface;

import org.testng.annotations.Test;

public class TC001_login extends GenericWrapper {
	
  @Test
  
	public void login() throws InterruptedException {
	  
  launchBrowser("http://leaftaps.com/opentaps/control/main"); 
	  
  enterById("username" ,"demosalesmanager");
	  
  enterById("password" ,"crmsfa"); 
	  
  clickByClassName("decorativeSubmit");
	  
  clickByLinkText("CRM/SFA"); 
  
 /* clickByLinkText("Create Lead");
  
  Thread.sleep(2000);
  
  enterById("c" ,"Tcs"); 
  
  enterById("createLeadForm_firstName" ,"Hema"); 
  
  enterById("createLeadForm_firstNameLocal" ,"kuttee");
  
  enterById("createLeadForm_personalTitle" ,"MS");*/
}
  
  
  
}
