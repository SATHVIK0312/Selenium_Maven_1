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

public class parent_child {
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}
	
	@Test
	public void verify() throws Exception{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id=\"contactList\"]/tbody/tr[5]/td[1]/input\r\n"
				+ "")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()='UK']/ancestor::tbody//tr[4]//input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/input")).click();

		////td[text()='UK']/following-sibling::td/input

        
        // following-sibling, preceeding-sibling, parent, ancestor, descendend
	}
	
	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	

	
}
