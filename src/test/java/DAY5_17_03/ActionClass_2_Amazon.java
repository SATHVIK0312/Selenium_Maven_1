package DAY5_17_03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass_2_Amazon {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	
	@Test
	public void verifyFrameElement() throws Exception {
		
		WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),', sign')]"));
		
		
		WebElement WishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(SignIn).perform();
		//act.moveToElement(WishList).perform();
		//act.click().perform();
		
		//app2
				//move to SignIn -----move to Wishlist ----click
				//act.moveToElement(SignIn).moveToElement(WishList).click().perform();
		
		//app3
				//move to SignIn -----move to Wishlist ----click
				act.moveToElement(SignIn).click(WishList).perform();
				
		
		
		System.out.println("title: " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("WIsh"));
		
		
		
	}
}