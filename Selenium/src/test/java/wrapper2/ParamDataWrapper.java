package wrapper2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;





public class ParamDataWrapper {
	public ChromeDriver driver;
	
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
      public void login(String url, String uname, String pwd) {
	

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		//create object of chromeDriver
	driver = new ChromeDriver();
		
		//Load URL
		 driver.get(url);
		 
	     // driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize window
		
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
				
		// Implicitly wait
		
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
										
		//Enter username
		
		driver.findElementById("username").sendKeys(uname);
		//driver.findElementById("username").sendKeys("demosalesmanager");
		//Enter password
		driver.findElementById("password").sendKeys(pwd);
		//driver.findElementById("password").sendKeys("crmsfa");
		//click Login
		//driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByClassName("decorativeSubmit").click();
		//click crm/sfa
		driver.findElementByLinkText("CRM/SFA").click();
		//click create lead
	
	}
	@AfterMethod
	public void closebrwoser () {
	driver.close();
	
	
	
}
	
    @DataProvider
    public String[][] getData() throws IOException{
    	
     // Redexinteg r1 = new Redexinteg();
     // return r1.readExcel();
    	
    	
	String[][] data = new String[2][4];
	
	  data [0][0] = "Tcs";
	  data [0][1] = "Rumman";
	  data [0][2] = "Chy";
	  data [0][3] = "Kuttee";
	           
	           
	           
	  data [1][0] = "ABC";
	  data [1][1] = "Twaha";
	  data [1][2] = "Abdullah";
	  data [1][3] = "Gaowa";
	   return data;
    	
    	    	} 
}
	
	
	
	
