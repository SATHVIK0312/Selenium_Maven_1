package Day4;

import utility.Constants; 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class BaseTest{
	WebDriver driver = new ChromeDriver();
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(3000);
		System.out.println("#####CLOSING APP####");
		driver.close();
	}
	
	@BeforeTest
	public void openApp() throws Exception {
		System.out.println("####Launching APP####");	
		driver.get(Constants.SampleApp);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}