package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

 public class TestFrame {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");	
       //create object of chrome driver
	ChromeDriver driver = new ChromeDriver();
		//Load URL
			
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get ("https://jqueryui.com/selectable/");
		//Maximize window
		
		driver.manage().window().maximize();
				
		// Implicitly wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click selectable
		driver.findElementByLinkText("Selectable").click();
		
		//switch to frame
		//way 1
		
		// driver.switchTo().frame("value");
			 		
				
		//switch to frame
		//way 2
		driver.switchTo().frame(0);
		
		//way  3
		// driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		//in frame
		
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
			
							
		//Thread.sleep(3000);
		
		driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
		
		driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
		
		//Thread.sleep(3000);
		
		driver.findElementByXPath("//ol[@d='selectable']/li [6]").click();
		
		
	}

}
