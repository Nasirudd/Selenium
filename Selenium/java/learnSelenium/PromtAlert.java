package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		 //create object of crome driver  
		
		ChromeDriver driver = new ChromeDriver();	
		
		 //load url
		  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); 

		

		   //Maximize window
		   driver.manage().window().maximize();
		   
		   //Implicitly wait
		   
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//entering frame
		   driver.switchTo().frame("iframeResult");
		 //click Try it btn
		   
		driver.findElementByXPath("//button[text()='Try it']  ").click();
		//create variable
		Alert promtalt = driver.switchTo().alert();
		System.out.println(promtalt.getText());
		
		//for message
		promtalt.sendKeys("nasir");
		
		Thread.sleep(3000);
		promtalt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
