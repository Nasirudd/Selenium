package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditList {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		

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
        //click leads link
        driver.findElementByLinkText("Leads").click();
        //click find leads
        driver.findElementByLinkText("Find Leads").click();
        //Enter first  name as Hema
        driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
        //click find leads button
        driver.findElementByXPath("//button[text() = 'Find Leads']").click();
        
        Thread.sleep(2000);//without tread sleep next code dose not works
        //click on first resulting lead(Parent child+indexing?)
         driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
         //verify title of the page
         String title = driver.getTitle();
         System.out.println(title);
         if(title.contains("View")) {
        	 System.out.println("Title matched");
         }else {
        	 System.out.println("Title not matched");
         }
         
        //click edit
        driver.findElementByLinkText("Edit").click();
        driver.findElementById("updateLeadForm_companyName").clear();
        driver.findElementById("updateLeadForm_companyName").sendKeys("xyz");
        driver.findElementByClassName("smallSubmit").click();
        
       //confirm the change name appears
        
        String changedName = driver.findElementById("viewLead_companyName_sp").getText();
        System.out.println(changedName);
        
        if(changedName.contains("xyz")){
        System.out.println("Name is matched");
        } else {
         
        	System.out.println("Not matched");
        }
        
        
       //close the browser 
       driver.close(); 
	}
	
}

