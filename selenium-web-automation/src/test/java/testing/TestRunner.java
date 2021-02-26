package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;


import pages.Homepage;
import pages.Login;
public class TestRunner {
	public static void main(String[] args) { 
		// Create an instance of the driver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Assign home variable for invoking the testHomepage function from Homepage class
		Homepage home = new Homepage(driver);
		
		//Navigate to homepage and confirm if it's correct
		home.testHomepage();
		
		//Assign login variable for invoking the testHomepage function from Login class
		Login login = new Login(driver);
		
		//Perform a login to the site and confirm it's correct
		login.testLogin();
	}
}
