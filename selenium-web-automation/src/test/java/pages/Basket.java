package pages;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basket {
	WebDriver driver;
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Basket(WebDriver driver) {
	 this.driver=driver;
	 }
	 public void testBasket() {
		 
		 
		 //Get the actual price of the item in the item listing
		 String actualPrice = driver.findElement(By.xpath("//*[contains (@id, 'sp-price-discountPrice')]")).getText();
		 
		 //action variable for mouse operations
		   Actions action = new Actions(driver);
		   
		   //Locate and move the mouse to basketIcon
		   WebElement basketIcon 			= driver.findElement(By.xpath("//*[contains (@class, 'basket-container')]"));
		   action.moveToElement(basketIcon).perform();
		   
		   //Set a timeout for 10 seconds
		   WebDriverWait wait = new WebDriverWait(driver, 10);
		   
		   //Wait either until the item added appears on basket, or until timeout
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains (@id, 'cart-item')]")));
		 
		   //Locate and click on "Sepete Git" button
		   WebElement goToBasket 			= driver.findElement(By.xpath("//*[contains (@class, 'header-cart-hidden-link')]"));
		   goToBasket.click();
		   
		   //Retrieve the basket price of the item
		   String basketPrice = driver.findElement(By.xpath("//*[contains (@class, 'new-price')]")).getText();
		   
		   //Compare the listing price and basket price of the item
		   Assert.assertEquals (actualPrice, basketPrice);
	 }
}
