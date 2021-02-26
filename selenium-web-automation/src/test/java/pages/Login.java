package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {
	WebDriver driver;
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Login(WebDriver driver) {
	 this.driver=driver;
	 }
	
	public void testLogin() {
		
		//Identify the login dropdown menu by finding it from name attribute
	   WebElement dropDown 			= driver.findElement(By.name("profile"));
	   
	   //action variable for mouse operations
	   Actions action = new Actions(driver);
	   
	   //Move the mouse to dropDown
	   action.moveToElement(dropDown).perform();
	   
	   //Set a timeout for 10 seconds
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   
	   //Wait until "Giriþ Yap" button is visible, or until timeout
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".sc-12t95ss-3")));
	   
	   //Identify the "Giriþ Yap" button and click on it
	   WebElement dropDownLogin 	= driver.findElement(By.cssSelector(".sc-12t95ss-3"));
	   dropDownLogin.click();
	}
}
