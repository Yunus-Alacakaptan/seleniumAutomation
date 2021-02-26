package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	WebDriver driver;
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Search(WebDriver driver) {
	 this.driver=driver;
	 }
	 public void testSearch() {
		   
		   //Identify the search box
		   WebElement searchBox 			= driver.findElement(By.name("k"));
		   
		   //Identify the search submit button
		   WebElement searchSubmit 			= driver.findElement(By.cssSelector(".hKfdXF"));
		   
		   //Enter "Bilgisayar" to search box and submit
		   searchBox.sendKeys("Bilgisayar");
		   searchSubmit.submit();
		   
	        
		   //action variable for mouse operations
		   Actions action = new Actions(driver);
		   
		   //Move the mouse to dropDown
		   action.moveToElement(driver.findElement(By.className("pager"))).perform();
		   
		   //To reach the 2nd page button, you have to close the cookie alert, which is blocked by an ad alert.
		   //You have to close both of them in sequence in order to reach the 2nd page button
		   
		   //Locate the advertisement popup and close it
		   WebElement adAlert = driver.findElement(By.className("wis-clsbtn-77005"));
		   adAlert.click();
		   
		   //Locate the cookie popup and close it
	       WebElement cookieAlert = driver.findElement(By.className("policy-alert-close"));
		   cookieAlert.click();
		   
		   //Locate the 2nd page button and click it
		   WebElement pageList = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[5]/ul/li[2]/a"));
		   pageList.click();
		}
}
