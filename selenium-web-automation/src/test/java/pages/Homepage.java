package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import org.junit.Assert;
import junit.framework.TestCase;

public class Homepage {
	public void testHomepage() {
	// Create an instance of the driver
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    
    // Navigate to a web page
    driver.get("https://gittigidiyor.com");
    
    //Get homepage title and confirm if it's correct
    String message                 = driver.getTitle();
    String successMsg             = "GittiGidiyor - Türkiye'nin Öncü Alýþveriþ Sitesi";
    Assert.assertEquals (message, successMsg);
    
	}
}
