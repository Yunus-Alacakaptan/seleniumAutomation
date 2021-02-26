package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Basket {
	WebDriver driver;
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Basket(WebDriver driver) {
	 this.driver=driver;
	 }
	 public void testBasket() {
		 
		 //List all elements that contain the id "product_id"
		 List<WebElement> shoppingItems= driver.findElements(By.xpath("//*[contains (@id, 'product_id')]"));
		 
		 //Generate a random number
		 Random rand = new Random();
		 
		 //Assign randomItem to a random integer, limited by the list size of shoppingItems
		 int randomItem = rand.nextInt(shoppingItems.size());
		 
		 //Click on a random item
		 shoppingItems.get(randomItem).click();
		 
	 }
}
