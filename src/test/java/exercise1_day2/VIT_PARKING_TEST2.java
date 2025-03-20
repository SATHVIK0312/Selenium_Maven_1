package exercise1_day2;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

import utility.Constants;

public class VIT_PARKING_TEST2 {
	
	WebDriver driver = new ChromeDriver();
	
	
//	@BeforeTest
//	public void Launchapp() throws Exception{
//		
//		
//		driver.get("https://www.saucedemo.com/");
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//	}
	@BeforeTest
	public void openApp() throws Exception {
		System.out.println("####Launching APP####");
		String br = Constants.browser;
		
		if (br.equalsIgnoreCase("chrome")) {
			System.out.println("Execution on chrome browser. ");
			driver = new ChromeDriver();
		}
		
		else if (br.equalsIgnoreCase("Edge")) {
			System.out.println("Execution on edge browser. ");
			driver = new EdgeDriver();
		}
		
		else if (br.equalsIgnoreCase("safari")) {
			System.out.println("Execution on safari browser. ");
			driver = new SafariDriver();
		}
		
		driver.get(Constants.SampleApp);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void VerifyLogin() throws Exception{
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"login-button\"]")).click();
		Thread.sleep(2000);
		
		String actualAppURL = driver.getCurrentUrl();
		System.out.println("Application URL after login: " + actualAppURL);
		
		
		driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("inventory_item_name")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"add-to-cart\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class=\"back-image\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"Sauce Labs Fleece Jacket\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"add-to-cart\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class=\"back-image\"]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
		Thread.sleep(2000);
		
		String actualAppURL2 = driver.getCurrentUrl();
		System.out.println("Application URL after login: " + actualAppURL2);
		
		
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("firstName")).sendKeys("OXAVIOUS");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("void");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("444444");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("back-to-products")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
	}
	
	@AfterTest
	public void Closeapp() throws Exception{
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		driver.close();
	}
}
