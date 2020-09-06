package learnInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenaricWrapper1 implements WrapperInterface1 {
  
	public  ChromeDriver driver;

	
	public void lunchbrowser(String url) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		   		
		 driver = new ChromeDriver();	
		
		 driver.get(url); 
	
	   	 driver.manage().window().maximize();
		   		   		   
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	
	public void enterframe(String locator) {    //switch to frame
		
	driver.switchTo().frame(locator); 
	}	
	
	public void clicbyxpath(String locator) throws InterruptedException {
		driver.findElementByXPath(locator).click();  //click on 'Try it'button,
		Alert alrt = driver.switchTo().alert();  //switch to alert ,  create variable and store
		System.out.println(alrt.getText());        //print
		Thread.sleep(3000);
		alrt.sendKeys("Nasir");//send message
		alrt.accept();      //accept
	}
	
	
	public void enterbyid(String locator, String data) {
								
	}

	
	public void enterbyname(String locator, String data) {
		// TODO Auto-generated method stub
		
	}

	
	public void enterbyclassname(String locator, String data) {
		// TODO Auto-generated method stub
		
	}

	
	public void clicbyid(String locator) {
		// TODO Auto-generated method stub
		
	}


	public void clicbyname(String locator) {
		// TODO Auto-generated method stub
		
	}

	
		
	

	public void enteralert(String locator) {
		// TODO Auto-generated method stub
		
	}


	public void closebrowser() {
		// TODO Auto-generated method stub
		
	}

	

	}


