package DAY5_17_03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_practise {
    WebDriver driver;

    @BeforeTest
    public void launchApp() throws Exception {
        System.out.println("Launching the app on Chrome browser");

        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit Wait
    }

    @Test
    public void verifyFrameElement() throws Exception {
    	
    	
    	Actions act = new Actions(driver);
    	
    	
    	WebElement Login = driver.findElement(By.xpath("//a[contains(@class,'_1TOQfO') and @title='Login']"));
    	WebElement Wishlist = driver.findElement(By.xpath("//a[contains(@href,'wish')]"));
     	act.moveToElement(Login).click(Wishlist).perform();
    	System.out.println("Title: "+ driver.getTitle());
    	Thread.sleep(2000);
    	WebElement Signin = driver.findElement(By.xpath("//a[contains(@href,'account') and @class='azBkHf' ]"));
    	act.click(Signin).perform();
    	System.out.println("Title: "+ driver.getTitle());
    	Thread.sleep(3000);
    	WebElement back = driver.findElement(By.xpath("//img[contains(@alt,'F') ]"));
    	act.click(back).perform();
    	System.out.println("Title: "+ driver.getTitle());
    	Thread.sleep(2000);
    	WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
    	
    	
;    	
    	
    	
    	
    	
    	
    	
    }

    @AfterTest
    public void closeApp() throws Exception {
        System.out.println("Closing the app on Chrome browser");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }
}
