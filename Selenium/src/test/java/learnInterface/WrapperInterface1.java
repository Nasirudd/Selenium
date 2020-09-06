package learnInterface;

public interface WrapperInterface1 {
	
	
	public void lunchbrowser(String url);
	public void enterbyid (String locator, String data); 
	public void enterbyname(String locator, String data); 
	public void enterbyclassname (String locator, String data);
	
	public void clicbyid(String locator);
	public void clicbyname(String locator);
    public void clicbyxpath(String locator) throws InterruptedException;
    
    public void enterframe(int value);
    public void enteralert(String locator);
    
    public void closebrowser();
    
    
    
    
    
    
}
