package exercise1_day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class example_packageIMPORT_Referencing {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		System.out.println("Application URL: " + Constants.SampleApp_DEV);
		driver.get(Constants.SampleApp_DEV);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
	}
	
	@Test
	public void login() {
		
				
		System.out.println("login test case");
		driver.findElement(By.cssSelector("[value=\"Boat\"]")).click();
				
		
	}
	
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(6000);
		System.out.println("=================closing app========================");
		driver.close();
		driver.quit();
		
	}
	
	
	
	
	

}