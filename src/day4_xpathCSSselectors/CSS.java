package day4_xpathCSSselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
	
		//there are 3 types of css selecting methods
		//1. tagname[attribute=value]
		//2. #id
		//3. .classname
		
		//advantages: fast, simpler in syntax compared to xpath
		//disadvantages: there is no contains() or text() function, and no axes, parents etc like in xpath
		
		//Test case, use only css selector
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://facebook.com");
		// find email and type automation
		driver.findElement(By.cssSelector("#email")).sendKeys("automation");
		// find password and type automation
		WebElement password = driver.findElement(By.cssSelector("input[data-testid='royal_pass']"));
		System.out.println("data-testid attribute value is: " + password.getAttribute("data-testid"));
		password.sendKeys("password");
		System.out.println(password.getCssValue("color"));
		// find login button and click on it
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();*/
	    
	    
	    
	    driver.get("https://etsy.com");
	    //Click on Sign in.
	    WebElement signinBtn = driver.findElement(By.cssSelector(".select-signin"));
	    signinBtn.click();
	    Thread.sleep(1000);
	    //Click on Register.
	    WebElement registerBtn=driver.findElement(By.cssSelector(".select-register"));
	    registerBtn.click();
	    Thread.sleep(1000);
	    //Enter an email address, (jon.dow@gmail.com)
		driver.findElement(By.cssSelector("#join_neu_email_field")).sendKeys("jon.dow@gmail.com");
		//Enter first name.
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("jon");
		//Enter password.
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("hjkyuii9k0g");
		//Click on Register.
	    driver.findElement(By.cssSelector("button[name='submit_attempt']")).click();
	    Thread.sleep(20000);
	    //Verify you get the error message:
	    //"Sorry, the email you have entered is already in use."
	    String errorMessage = driver.findElement(By.cssSelector("#aria-join_neu_email_field-error")).getText();
		System.out.println(errorMessage);
		if (errorMessage.equals("Sorry, the email you have entered is already in use.")) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}

	}

}
