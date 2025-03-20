package seltest2_maven_day1;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_prac_xpath {
	
	@Test
	public void verify() throws Exception{
		
		System.out.println("Launching the app on Chrome browser");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 	
        
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();  
        Thread.sleep(3000);
        String actualAppURL = driver.getCurrentUrl();
        System.out.println("Application URL after login: " + actualAppURL);
        driver.findElement(By.xpath("//*[contains(@class, 'oxd-userdropdown-name')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(3000);
        String actualAppURLAfterLogout = driver.getCurrentUrl();
        System.out.println("Application URL after logout: " + actualAppURLAfterLogout);
        driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("AdminXPATH");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("AdminExample");
        
        
        
        
        System.out.println("Closing the app on Chrome browser");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
		
	}
	
}
