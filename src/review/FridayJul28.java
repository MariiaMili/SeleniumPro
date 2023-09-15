package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FridayJul28 {

	public static void main(String[] args) throws InterruptedException {
		
		//FridayJul28 practice = new FridayJul28();
		task2();
		
		}
		
		public static void task2() throws InterruptedException {  
			
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
//      Step 10: Create String variables for 'actualFname, actualLName, actualEmail, actualPassword' and assign values to each one.
		String actualName = "Name";
		String actualLName = "Last Name";
		String actualEmail = "fullname@gmail.com";
		String actualPassword = "password123";	
		
		
//      Step 2: Store the String "http://practice.primetech-apps.com" in a variable and name "ActualUrl".  
		String actualUrl= "http://practice.primetech-apps.com";	  
		driver.get(actualUrl);
		Thread.sleep(1000);
//		Step 3: Locate "Practice Now Button" for Elements and store in a WebElement variable name it "practiceBtn".
		WebElement practiceBtn = driver.findElement(By.id("elements"));
//		Step 4: Click on "practiceBtn".
		practiceBtn.click();
		Thread.sleep(1000);
		
//		Step 5: Locate "Text Box Button" and store in a WebElement variable name it "textBoxBtn".
		WebElement textBoxBtn = driver.findElement(By.id("text-box"));
		textBoxBtn.click();
		Thread.sleep(1000);
//		Step 6: Get the First name text box and store it in WebElement name it "fNameTxtBox". 
		WebElement fNameTxtBox = driver.findElement(By.id("firstName"));
		fNameTxtBox.sendKeys(actualName);
//		Step 7: Get the Last name text box and store it in WebElement name it "lNameTxtBox". 
		WebElement lNameTxtBox = driver.findElement(By.id("lastName"));
		lNameTxtBox.sendKeys(actualLName);
//		Step 8: Get the Email text box and store it in WebElement name it "emailTxtBox" .
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		emailTxtBox.sendKeys(actualEmail);
//		Step 9: Get the Password text box and store it in WebElement name it "passwordTxtBox" .
		WebElement passwordTxtBox = driver.findElement(By.id("password"));
		passwordTxtBox.sendKeys(actualPassword);

//		Step 12: Click on the Submit bTn.
		WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		submitBtn.click();
		Thread.sleep(1000);
		
		
//		Step 13: Get all the User Info and store it Strings name them expected'Variable'  
		String expectedName = driver.findElement(By.xpath("//div[@class='firstName']")).getText();
		System.out.println(expectedName);
		String expectedLName = driver.findElement(By.xpath("//div[@class='lastName']")).getText();
		System.out.println(expectedLName);
		String expectedEmail = driver.findElement(By.xpath("//div[@class='email']")).getText();
		System.out.println(expectedEmail);
		String expectedPassword = driver.findElement(By.xpath("//div[@class='password']")).getText();
		System.out.println(expectedPassword);
		System.out.println("**************");
		//String expectedFname = fNameTxtBox.getAttribute("value");
		//String expectedLname = lNameTxtBox.getAttribute("value");
		//String expectedEmail = emailTxtBox.getAttribute("value");
		//String expectedPassword = passwordTxtBox.getAttribute("value");
		
		
//		Step 14: Validate all the User Info and print statement to confirm the validation for each field.
		
		if(expectedName.equals(actualName)) {
			System.out.println("First Name: Test Pass");
		} else {
			System.err.println("First Name: Test Fail");
		}
		if(expectedLName.equals(actualLName)) {
			System.out.println("Last Name: Test Pass");
		} else {
			System.err.println("Last Name: Test Fail");
		}	
		if(expectedEmail.equals(actualEmail)) {
			System.out.println("Email: Test Pass");
		} else {
			System.err.println("Email: Test Fail");
		}
		if(expectedPassword.equals(actualPassword)) { 
			System.out.println("Password: Test Pass");
		} else {
			System.err.println("Password: Test Fail");
		}

	}
  }
