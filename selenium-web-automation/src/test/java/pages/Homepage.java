package pages;
import org.openqa.selenium.WebDriver;
 
import org.junit.Assert;


public class Homepage  {
	
	WebDriver driver;
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Homepage(WebDriver driver) {
	 this.driver=driver;
	 }
	 
	public void testHomepage() {

    // Navigate to a web page
    driver.get("https://gittigidiyor.com");
    
    //Get homepage title and confirm if it's correct
    String message                 = driver.getTitle();
    String successMsg             = "GittiGidiyor - T�rkiye'nin �nc� Al��veri� Sitesi";
    Assert.assertEquals (message, successMsg);
    
	}
}
