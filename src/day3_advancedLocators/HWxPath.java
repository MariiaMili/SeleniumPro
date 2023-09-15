package day3_advancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HWxPath {
	
	public static void main(String[] args) throws InterruptedException {

		HWxPath hw= new HWxPath(); 
		hw.task1();
		hw.task2();
	}
	public void task1() {
		
	    //go to facebook.com
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//find the Email or phone number field and type Automation
		WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
		emailBox.sendKeys("Automation");
		//find the Password field and type Automation
		WebElement passwordBox = driver.findElement(By.xpath("//input[@name='pass']"));
		passwordBox.sendKeys("Automation");
		  //find the Login button and click on it.
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		LoginButton.click();*/
	   }
	public void task2() throws InterruptedException {
		//go to facebook.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
	    //find the Create New Account button and click on it
		WebElement NewAccountBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		NewAccountBtn.click();
		Thread.sleep(1000);
	    //find the FirstName,  LastName, Email and Password fields and type Automation
		WebElement FirstNameBox = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		FirstNameBox.sendKeys("Automation");
		WebElement LastNameBox = driver.findElement(By.xpath("//input[@aria-label='Last name']"));
	    LastNameBox.sendKeys("Automation");
		WebElement emailBox = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		emailBox.sendKeys("Automation");
		WebElement passwordBox = driver.findElement(By.xpath("//input[@aria-label='New password']"));
		passwordBox.sendKeys("Automation");
	    //find the Sign Up button and click on it.
		WebElement SignUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
		SignUpButton.click();
	}
}
