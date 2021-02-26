package pages;

import org.openqa.selenium.WebDriver;


public class Login {
	WebDriver driver;
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Login(WebDriver driver) {
	 this.driver=driver;
	 }
	
	public void testLogin() {
	    // Navigate to a web page
	    driver.get("https://gittigidiyor.com/3");
	}
}
