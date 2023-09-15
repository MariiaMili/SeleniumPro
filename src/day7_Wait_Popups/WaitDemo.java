package day7_Wait_Popups;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
		ExplicitlyWait();
     
	}
   public static void ExplicitlyWait() throws InterruptedException {
  	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//implicitly wait is for the page objects/elements to be loaded
		
		
		//go to etsy.com
		driver.get("https://etsy.com");
		//click on sign in button
		driver.findElement(By.cssSelector(".select-signin")).click();
		//wait until the register button is visible
		//create an object of WebDriverWait class
		WebDriverWait letswait = new WebDriverWait(driver, Duration.ofSeconds(5));
	   
		//wait until visibility of the register button
		//Thread.sleep(1000); - from now on, we don't use it unless we want to see what's going on
		letswait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select-register")));
		
		//click on the register button
		driver.findElement(By.cssSelector(".select-register")).click();
		
		//wait until the email field is visible
		letswait.until(ExpectedConditions.textToBe(By.id("join-neu-overlay-title"), "Create your account"));
		
		//enter email
		driver.findElement(By.name("email")).sendKeys("jon.dow@gmail.com");
		
		//enter name
		driver.findElement(By.name("first_name")).sendKeys("join");
		
		//enter password
		driver.findElement(By.name("password")).sendKeys("sdghjkghk");
		
		//wait until the register button to be clickable
		letswait.until(ExpectedConditions.elementToBeClickable(By.name("submit_attempt")));
		
		//click on the register button
		driver.findElement(By.name("submit_attempt")).click();
   }
}
