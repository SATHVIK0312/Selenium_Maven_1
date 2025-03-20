package exercise1_day2;

import java.util.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;
//import org.testng.annotations.*;


public class Prac2_validation_test {
	
	@SuppressWarnings("deprecation")
	@Test
	public void VerifyLogin() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//AUTOCOMPLETE
		
		driver.findElement(By.xpath("//a[@href=\"/autocomplete\" and @class=\"btn btn-lg\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@class, 'form-control') and contains(@class, 'pac-target-input')]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//button[@class=\"dismissButton\"]")).isEnabled()) {
			driver.findElement(By.xpath("//button[@class=\"dismissButton\"]")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("street_number")).sendKeys("12234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='locality']")).sendKeys("Greater Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		
//		//Buttons
//		
		driver.findElement(By.xpath("//a[contains(@class,\"btn btn-lg\") and contains(@href,\"butto\")]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//button[contains(text(),\"Primary\")]")).isEnabled()) {
			driver.findElement(By.xpath("//button[contains(text(),\"Primary\")]")).click();
			System.out.println("Primary button pressed");
		}
		Thread.sleep(1500);
		
		if(driver.findElement(By.xpath("//button[contains(text(),\"Success\")]")).isEnabled()) {
			driver.findElement(By.xpath("//button[contains(text(),\"Success\")]")).click();
			System.out.println("Success button pressed");
		}
		Thread.sleep(1500);
		
		if(driver.findElement(By.xpath("//button[contains(text(),\"Danger\")]")).isEnabled()) {
			driver.findElement(By.xpath("//button[contains(text(),\"Danger\")]")).click();
			System.out.println("Danger button pressed");
		}
		Thread.sleep(1000);
		
		if(driver.findElement(By.xpath("//button[contains(text(),\"Middle\")]")).isEnabled()) {
			driver.findElement(By.xpath("//button[contains(text(),\"Middle\")]")).click();
			System.out.println("Middle button pressed");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		
//		// CHECKBOX
//		
		driver.findElement(By.xpath("//a[contains(@class,\"btn\") and contains(@href,'check')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = checkbox.size();
		System.out.println("No of checkboxes: " + count);
		for(WebElement c : checkbox) {
			c.click();
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		
//		
//		//Datepicker
//		
//		
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-t')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'date')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'form')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),20)]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		
		
//		//Drag and drop
//		
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-t')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'dragdr')]")).click();
		Thread.sleep(2000);
		// https://www.browserstack.com/guide/drag-and-drop-in-selenium
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		
//		
//		//DropDown
//		
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-t')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'dropdo')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'pri')]")).click();
		Thread.sleep(2000);
		List<WebElement> dropd = driver.findElements(By.xpath(".//a[contains(@class,'dropdown-item')]"));
		System.out.println("SIZE OF DROPDOWN MENU - " + (int) Math.ceil(dropd.size() / 2.0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[contains(text(),Dropdown)]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		
		
//		// Enabled and Disabled elements
//		
		driver.findElement(By.xpath("//a[contains(@href,'ena') and contains(@class,'b')]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//input[contains(@placeholder,'D')]")).isEnabled()) {
			driver.findElement(By.xpath("//input[contains(@placeholder,'D')]")).sendKeys("Hello Enabled");
			System.out.println("The element 1 is ENABLED");
		}
		else {
			System.out.println("The element 1 is DISABLED");
		}
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//input[contains(@placeholder,'I')]")).isEnabled()) {
			driver.findElement(By.xpath("//input[contains(@placeholder,'I')]")).sendKeys("Hello Enabled");
			System.out.println("The element 2 is ENABLED");
		}
		else {
			System.out.println("The element 2 is DISABLED");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
	
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		
		
		//File upload
		
		driver.findElement(By.xpath("//a[contains(@href,'file') and contains(@class,'b')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(@class,'btn-ch')]")).click();
//		Thread.sleep(1000);
		WebElement fileInput = driver.findElement(By.xpath("//input[contains(@class,'form')]"));
		fileInput.sendKeys("\"C:\\Users\\sanga\\Downloads\\vellore1.tif\"");
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//input[contains(@class,'form')]")) != null){
			System.out.println("NOT EMPTY");
		}
		else {
			System.out.println("ITS EMPTY");
		}
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
//		
//		// MODEL... POPUPS
//		
		driver.findElement(By.xpath("//a[contains(@href,'mod') and contains(@class,'btn')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn') and contains(@id,'mo')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn') and contains(@id,'clos')]")).click();
		//https://www.browserstack.com/guide/alerts-and-popups-in-selenium
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
//		//Radio Button
//		
		driver.findElement(By.xpath("//a[contains(@href,'radio') and contains(@class,'b') ]")).click();
		Thread.sleep(2000);
		List<WebElement> radi = driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		System.out.println("The number of radio buttons: " + radi.size());
		Thread.sleep(2000);
		radi.get(0).click();
		Thread.sleep(2000);
		radi.get(2).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		
		
		
		//Switching Window
		
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-t')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'switc')]")).click();
		Thread.sleep(2000);
		String Wind1 = driver.getWindowHandle();
		System.out.println("Window handle: "+ Wind1);
		System.out.println("No of window before: "+ driver.getWindowHandles().size());
		driver.findElement(By.xpath("//button[contains(@id,'new-tab')]")).click();
		Thread.sleep(2000);
		System.out.println("No of windows after: "+ driver.getWindowHandles().size());
		Set<String> win = driver.getWindowHandles();
		String win1 = (String)win.toArray()[0];
		String win2 = (String)win.toArray()[1];
		System.out.println("win1: " + win1);
		System.out.println("win2: " + win2);
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		System.out.println("Application Title, after swicth to window2: " + driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		System.out.println("Application Title, after swicth to window1: " + driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-t')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'date')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'form')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),20)]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		driver.close();
		driver.switchTo().window(win1);
		System.out.println("Application Title, after swicth to window2: " + driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		
		//ALERTS
		
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-t')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'switc')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'alert')]")).click();
		Thread.sleep(2000);
		Alert SimpleAlert = driver.switchTo().alert();
		System.out.println("Alert Text: " + SimpleAlert.getText());
		if(SimpleAlert.getText().equals("This is a test alert!")) { 
		    SimpleAlert.accept();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(4000);
		driver.close();
	}
}
