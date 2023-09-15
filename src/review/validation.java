package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation {

	public static void main(String[] args) throws InterruptedException {
		test2();
	}
		public static void test2() throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 //maximize the window
		 driver.manage().window().maximize();
		 
		 //Go to “https://automationtesting.co.uk”
	     driver.get("https://www.automationtesting.co.uk");
	 	 driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
	 	    
	 	    // Click on Contact Us Form Test.
			WebElement ConactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
			ConactUsForm.click();
			Thread.sleep(10000);
            // Find the Test field for email
			WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
			//Enter email address 
			String emailText = "name@gmail.com";
			emailField.sendKeys(emailText);
			// Click on Submit
			WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			submitBtn.click();
			Thread.sleep(10000);
		
			//Verify you get the error message:
			//"Error: all fields are required"
			String expectedMsg = driver.findElement(By.xpath("/html/body")).getText();
			System.out.println(expectedMsg);
			String actualMsg = "Error: all fields are required";
			if(expectedMsg.equals(actualMsg)) {
				System.out.println("Test Pass");
			} else {
				System.out.println("Test Fail");
			}
			}
}
