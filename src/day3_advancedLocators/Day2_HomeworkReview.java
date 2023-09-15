package day3_advancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_HomeworkReview {

	//in order to access a class properties, we need to create an object of that class.
	// if the properties are static, no need to create an object, simply access the properties by class name.
	// static properties belongs to the class itself so you don't need to create an object
	public static void main(String[] args) throws InterruptedException {
	Day2_HomeworkReview day2=new Day2_HomeworkReview();
	day2.task1();
	day2.task2();
	
	task3();
	}
public void task1() {
	System.out.println("This is task 1");
}
public void task2() {
	System.out.println("This is task 2");
}
public static void task3() throws InterruptedException {
	System.out.println("This is task 3");

		
			System.setProperty("webdriver.chrome.driver",
								  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
			/*WebDriver driver= new ChromeDriver();
	        //Go to etsy.com
			driver.get("https://etsy.com");
			//click on sign in
			WebElement signinBtn= driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
			signinBtn.click();
			Thread.sleep(1000);
			//Click on Register.
			WebElement = registerBtn= driver.findElement(By.xpath("null"));
			registerBtn.click();
			//Enter an email address, (jon.dow@gmail.com)
			//Enter first name.
			//Enter password.
			//Click on Register.
			//Verify you get the error message:
			//"Sorry, the email you have entered is already in use."
				//Find email address field and type "automation"
			WebElement RegisterBtn = driver.findElement(By.className("select-signin"));
			RegisterBtn.click();
			WebElement email= driver.findElement(By.id("join_neu_email_field"));
			email.sendKeys("automation");
				//Find the password field and type "automation"
			WebElement password = driver.findElement(By.id("join_neu_password_field"));
			password.sendKeys("automation");
				//Find the sign in button and click on it
			WebElement signin = driver.findElement(By.name("submit_attempt")); */
	
			
			
			//Go to etsy.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://etsy.com");
			//Click on Sign in.
		WebElement signinBtn = driver.findElement(
				By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
		signinBtn.click();
		    //Click on Register.
		WebElement registerBtn = 
				driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']"));
		registerBtn.click();
		    //Enter an email address, (jon.dow@gmail.com)
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jon.dow@gmail.com");
			//Enter first name.
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("jon");
			//Enter password.
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jkhgkjdgfgsd");
			//Click on Register.
		driver.findElement(By.xpath("//button[@name='submit_attempt']")).click();
		Thread.sleep(10000);
			//Verify you get the error message:
			//"Sorry, the email you have entered is already in use."
		String errorMessage = driver.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']")).getText();
		System.out.println(errorMessage);
		if (errorMessage.equals("Sorry, the email you have entered is already in use.")) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}}}