import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class main {
	@Test
public void fire() throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "/home/ghost/Desktop/java/geckodriver-v0.20.1-linux64/geckodriver");
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.easybooking.lk/login");
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com");
    
    
    WebElement username = driver.findElement(By.xpath("//*[@id="email"]"));
    helpr.highLightElement(driver, username);
    username.sendKeys("yourmail@mail.com");
    
    
    WebElement pass = driver.findElement(By.xpath("//*[@id="pass"]"]"));
    helpr.highLightElement(driver, pass);
    pass.sendKeys("your password");
    
    WebElement bt2 = driver.findElement(By.xpath("//*[@id="u_0_2"]"));
    helpr.highLightElement(driver, bt2);
    bt2.click();
	Thread.sleep(2000);
    
}
}
