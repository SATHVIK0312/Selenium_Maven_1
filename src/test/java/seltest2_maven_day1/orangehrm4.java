package seltest2_maven_day1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orangehrm4 {



	@Test
	public void verifyLogin() throws Exception {

		WebDriver driver = new ChromeDriver();

//		WebDriver driver = new EdgeDriver();

//		WebDriver driver = new FirefoxDriver();

		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");

		Thread.sleep(7000);

		driver.close();

	}

}
