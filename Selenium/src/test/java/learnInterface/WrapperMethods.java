package learnInterface;

public interface WrapperMethods {
	
   public void launchBrowser(String url);
   
   public void enterById(String locatorValue, String data);
   
   public void enterByName(String locatorValue, String data);
   
   public void enterByPartialLinkText(String locatorValue,  String data);
   
   public void enterByXpath(String locatorValue, String data);
   
   
   
   public void clickByName(String locatorValue);
   
   public void clickByClassName(String locatorValue);  
   
   public void clickByLinkText(String locatorValue);
   
   public void clickByXpath(String locatorValue);
   
   
      
   public void selectVissibleTextById(String locatorValue, String data);
   
   public void selectVissibleTextByName(String locatorValue, String data);
   
   public void selectValueById(String locatorValue, String data);
   
   public void selectValueByName(String Name, String value);   //can use Name,Value instead of locator value and data.
   
   
      
   
   public void selectIndexById(String Id, int value);
   
   
   public void getTextByName(String Name);
   
   public String getTextById(String Id);
   
   public void veryfyById (String locatorValue, String data);
   
   
   public void closeBrowser();
   
   
   
} 
   
   
   
   
   
   
   
   

