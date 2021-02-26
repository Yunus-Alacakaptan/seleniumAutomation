package testing;

import pages.Homepage;

public class TestRunner {
	public static void main(String[] args) { 
		
		//Assign home variable for invoking the testHomepage function from Homepage class
		Homepage home = new Homepage();
		
		//Navigate to homepage and confirm if it's correct
		home.testHomepage();
	}
}
