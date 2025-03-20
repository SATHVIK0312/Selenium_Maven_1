package exercise1_day2;


//import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class Inputbox_test1 {
	
	
	
	@Test
	public void VerifyLogin() throws Exception {


		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("enter firstName");
		
//		driver.findElement(By.cssSelector("input[name=\"fname\"]")).sendKeys("enter firstName");
		
		Thread.sleep(3000);
		//last name
		
		boolean isLastNameEnabled = driver.findElement(By.cssSelector("input[name=\"lname\"]")).isEnabled();
		
		System.out.println("isLastNameEnabled: " + isLastNameEnabled);
		
		
		if(isLastNameEnabled) {
			
			driver.findElement(By.cssSelector("input[name=\"lname\"]")).sendKeys("enter lastName");
			
		}
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		
		
		//close the application
		driver.close();
		
	}
}