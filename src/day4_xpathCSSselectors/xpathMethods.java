package day4_xpathCSSselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathMethods {

	public static void main(String[] args) throws InterruptedException {
	
	   xpathMethods practice = new xpathMethods();
	   practice.xpath_contains();
	   practice.xpath_text();
	}
	
	public void xpath_contains() throws InterruptedException {
		
		//Test case:
		//Go to etsy.com
	WebDriver driver = new ChromeDriver();
	driver.get("https://etsy.com");
		//Click on Sign in.
	WebElement signinBtn = driver.findElement(
			By.xpath("//button[contains(@class, 'select-signin')]"));
	signinBtn.click();
	Thread.sleep(1000);
	    //Click on Register.
	WebElement registerBtn = 
			driver.findElement(By.xpath("//button[contains(@class, 'select-register')]"));
	registerBtn.click();
	Thread.sleep(1000);
	    //Enter an email address, (jon.dow@gmail.com)
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jon.dow@gmail.com");
		//Enter first name.
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("jon");
		//Enter password.
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jkhgkjdgfgsd");
		//Click on Register.
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[@name='submit_attempt']")).click();
	Thread.sleep(3000);
		//Verify you get the error message:
		//“Sorry, the email you have entered is already in use.”
	
	String errorMessage = driver.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']")).getText();
	System.out.println(errorMessage);
	if (errorMessage.equals("Sorry, the email you have entered is already in use.")) {
		System.out.println("Test pass");
	}else {
		System.out.println("Test fail");
	}
		
	}
	public void xpath_text() throws InterruptedException {
		//we use the text( to locate an element when the element has an element text,
		//and doesn't provide other unique elements)
		
		//Test case:
		//Go to etsy.com
	WebDriver driver = new ChromeDriver();
			driver.get("https://etsy.com");
				//Click on Sign in.
			WebElement signinBtn = driver.findElement(
					By.xpath("//button[contains(text(), 'Sign in')]"));
			signinBtn.click();
			Thread.sleep(1000);
			    //Click on Register.
			WebElement registerBtn = 
					driver.findElement(By.xpath("//button[contains(text(), 'Register')]"));
			registerBtn.click();
			Thread.sleep(1000);
			    //Enter an email address, (jon.dow@gmail.com)
			driver.findElement(By.xpath("//input[contains(@id, 'email_field')]")).sendKeys("jon.dow@gmail.com");
				//Enter first name.
			driver.findElement(By.xpath("//input[contains(@id, 'first_name')]")).sendKeys("jon");
				//Enter password.
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jkhgkjdgfgsd");
				//Click on Register.
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[contains(text(), 'Register')]")).click();
			Thread.sleep(3000);
				//Verify you get the error message:
				//“Sorry, the email you have entered is already in use.”
			
			String errorMessage = driver.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']")).getText();
			System.out.println(errorMessage);
			if (errorMessage.equals("Sorry, the email you have entered is already in use.")) {
				System.out.println("Test pass");
			}else {
				System.out.println("Test fail");
			}
	}}

