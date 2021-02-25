import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 


public class Automation {
	public static void main(String[] args) {
		
	//Assign Firefox Driver as "driver" named variable
	WebDriver driver = new FirefoxDriver();
	
	//Navigate to "gittigidiyor.com"
	driver.get("https://www.gittigidiyor.com");
	}
}
