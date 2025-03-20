package DAY6_18_03;

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

public class Amazon_parentChild_seemore {
	
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
	
	@Test
	public void verify() throws Exception{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='desktop-grid-4']/div[contains(@class,'a-c')]/div[contains(@class,'a-c')]/a[contains(@class,'a')]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='nav-logo-sprites']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='desktop-grid-1']/div[contains(@class,'a-c')]/div[contains(@class,'a-c')]/a[contains(@class,'a')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='nav-logo-sprites']")).click();

		
	}
	
	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	

	
}
