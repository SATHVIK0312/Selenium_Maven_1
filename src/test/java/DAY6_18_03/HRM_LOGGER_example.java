package DAY6_18_03;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Constants;

public class HRM_LOGGER_example extends BaseTest{
	
	
	
	@Test
	public void VerifyLogin() throws Exception {
		
		log.info("enter username: " + Constants.userName);
		log.info("enter password: "+ Constants.pass);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();  
        Thread.sleep(3000);
        String actualAppURL = driver.getCurrentUrl();
        log.info("Application URL after login: " + actualAppURL);
        driver.findElement(By.xpath("//*[contains(@class, 'oxd-userdropdown-name')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(3000);
        String actualAppURLAfterLogout = driver.getCurrentUrl();
        log.info("Application URL after logout: " + actualAppURLAfterLogout);
        driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("AdminXPATH");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("AdminExample");
		
		
	}
	
	
	

	
	
	
	
	
	

}
