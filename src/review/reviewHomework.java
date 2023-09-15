package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewHomework {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		//variable declaration
		String actualName = "Full Name";
		String actualEmail = "fullname@gmail.com";
		String actualCAddress = "123 Cherry Street, Los Angeles, CA";
		String actualPAddress = "123 Cherry Street, Los Angeles, CA";
				
		//Go to 'https://demoqa.com/text-box' ////http://practice.primetech-apps.com/practice/text-box
		driver.get("https://demoqa.com/text-box");
		//Find the Full Name field and store it in a variable
		//Enter a full name 
		WebElement fullNameField= driver.findElement(By.cssSelector("#userName"));
		fullNameField.sendKeys(actualName);
		//Find the email field 
		//Enter an email 
		WebElement emailField= driver.findElement(By.cssSelector("#userEmail"));
		emailField.sendKeys(actualEmail);
		//Find the current address field and enter address
		WebElement currentAddressField= driver.findElement(By.cssSelector("textarea#currentAddress"));
		currentAddressField.sendKeys(actualCAddress);
		//Find the permanent address field and enter address
		WebElement permanentAddressField= driver.findElement(By.cssSelector("textarea#permanentAddress"));
		permanentAddressField.sendKeys(actualPAddress);
		
		// Click on Submit
		WebElement submitBtn = driver.findElement(By.id("submit"));
		submitBtn.click();
		Thread.sleep(1000);
		
		//Validate each entry of the text field 
		String expectedName = driver.findElement(By.id("name")).getText();
		System.out.println(expectedName);
		String expectedEmail = driver.findElement(By.id("email")).getText();
		System.out.println(expectedEmail);
		String expectedCAddress = driver.findElement(By.cssSelector("p#currentAddress")).getText();
		//String expectedCAddress= actualCAddress.getAttribute("value");
		System.out.println(expectedCAddress);
		String expectedPAddress = driver.findElement(By.cssSelector("p#permanentAddress")).getText();
		System.out.println(expectedPAddress);
		
		
	    
		if(expectedName.contains(actualName)) {
			System.out.println("Full Name: Test Pass");
		} else {
			System.err.println("Full Name: Test Fail");
		}
		
		if(expectedEmail.contains(actualEmail)) {
			System.out.println("Email: Test Pass");
		} else {
			System.err.println("Email: Test Fail");
		}
		
		if(expectedCAddress.contains(actualCAddress)) {
			System.out.println("CAddress: Test Pass");
		} else {
			System.err.println("CAddress: Test Fail");
		}
		
		if(expectedPAddress.contains(actualPAddress)) {
			System.out.println("PAddress: Test Pass");
		} else {
			System.err.println("PAddress: Test Fail");
		}
		

	}
}
