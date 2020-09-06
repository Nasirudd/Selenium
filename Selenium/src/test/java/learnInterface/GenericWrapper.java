package learnInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods {


	public  ChromeDriver driver;


	public void launchBrowser(String url) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasir\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	public void enterById(String locatorValue, String data) {

		driver.findElementById(locatorValue).sendKeys(data);
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);

	}

	
	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);

	}

	public void clickByName(String locatorValue) {
	driver.findElementByName(locatorValue).click();

	}


	public void clickByClassName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();

	}

	
	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText( locatorValue).click();

	}


	public void enterByPartialLinkText(String locatorValue, String data) {
		driver.findElementByPartialLinkText( locatorValue).sendKeys(data);

	}

	
	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath( locatorValue).click();

	}

	
	public void selectVissibleTextById(String locatorValue, String data) {
		WebElement elem = driver.findElementById(locatorValue);
		Select dd =  new Select(elem);
		dd.selectByVisibleText(data);		
	}

	
	public void selectVissibleTextByName(String locatorValue, String data) {
		WebElement elem1 = driver.findElementByName(locatorValue);
		Select dd1 = new Select (elem1);
		dd1.selectByVisibleText(data);

	}

	
	public void selectValueById(String locatorValue, String data) {
		WebElement elem2 = driver.findElementById(locatorValue);
		Select dd2 = new Select (elem2);
		dd2.selectByValue(data);


	}

	
	public void selectValueByName(String Name, String value) {
		WebElement elem3 = driver.findElementByName(Name);
		Select dd3 = new Select(elem3);
		dd3.selectByValue(value);


	}


	public void selectIndexById(String Id, int value) {
		WebElement elem4 = driver.findElementById(Id);
		Select dd4 = new Select(elem4);
		dd4.selectByIndex(value);

	}

	
	public String getTextById(String Id) {
		String text = driver.findElementById(Id).getText();
		return text;

	}
	 public void getTextByName(String Name){
	 
	 String text1 = driver.findElementByName(Name).getText();
	 } 
	 
	 		
	public void veryfyById(String locatorValue, String data) {
		
		String txt = driver.findElementById(locatorValue).getText();
		
		if(txt.equals(data)) {
			System.out.println("Name is Matched");
		}else 
		{System.out.println("Name not Matched");}	
	}

	

	public void closeBrowser() {

	}
}
