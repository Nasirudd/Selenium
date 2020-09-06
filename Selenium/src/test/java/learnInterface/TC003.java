package learnInterface;

import org.testng.annotations.Test;

public class TC003 extends GenaricWrapper1 {
	
 @Test
 
 public void login() throws InterruptedException {
 
	 lunchbrowser("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	 
	 enterframe("iframeResult");
	 
	 clicbyxpath("//button[text()='Try it']  ");
	 

}


	
	
}
