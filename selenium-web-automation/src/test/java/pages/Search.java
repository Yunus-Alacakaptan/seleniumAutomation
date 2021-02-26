package pages;

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
		   
		}
}
