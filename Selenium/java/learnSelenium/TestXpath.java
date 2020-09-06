package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestXpath {

	//public static void main(String[] args) {
 @Test		
  public void testLtap() {
//lunch chromedriver		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
   
   
   ChromeDriver driver = new ChromeDriver();
   
 //load url
   driver.get("http://leaftaps.com/opentaps/control/main");
   //Maximize window
   driver.manage().window().maximize();
   //Implicitly wait
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
  //enter user name
  driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
  
   
//input[@id="username]"
	}

}
