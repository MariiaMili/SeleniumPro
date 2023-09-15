package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class review_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
		test1();
	}
		public static void test1() throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 //maximize the window
		 //driver.manage().window().maximize();
		 
		 //Go to “https://automationtesting.co.uk”
	     driver.get("https://www.automationtesting.co.uk/");
	 	 driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
	     
			WebElement ConactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
			ConactUsForm.click();

			WebElement firstNameField = driver.findElement(By.xpath("//input[@name='first_name']"));
			WebElement lastNameField = driver.findElement(By.xpath("//input[@name='last_name']"));
			WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
			WebElement messageField = driver.findElement(By.xpath("//textarea[@name='message']"));
			
			String fNameText = "Hamzah";
			String lNameText = "Aldeen";
			String emailText = "hamazah@gmail.com";
			String messageText = "Hello, this is my message"; 
			
			
			WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));

			Thread.sleep(2000);
//				Click on Contact Us Form Test.
			
//				Find the Test field for first name and 	Enter a first name
			Thread.sleep(2000);
			
			firstNameField.sendKeys(fNameText);
			
//				Find the Test field for last name and Enter last name.
			lastNameField.sendKeys(lNameText);
			
//				Find the Test field for email and Enter email address
			emailField.sendKeys(emailText);
			
//				Find the Test field for massage	and Enter a massage
			
			messageField.sendKeys(messageText);

//				Click on Submit
			submitBtn.click();
			
			Thread.sleep(2000);
//				Verify you get the error message:
//				" Thank you for your mail! "
			String  expectedMsg = driver.findElement(By.xpath("//h3[text()='Thank you for your mail!']")).getText();
			
			/*if(expectedMsg.equals(actualMsg)) {
				System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
			
			Thread.sleep(1000);
			
			
			
	    /* //Click on Contact Us Form Test.
	     WebElement contactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
	     contactUsForm.click();
	     //Thread.sleep(1000);
	     //Find the Test field for first name
	     WebElement firstNameField = driver.findElement(By.xpath("//input[@name='first_name']")); 
	     //Enter first name.
	     firstNameField.sendKeys("FirstName");
	     //Find the Test field for last name  
	     //Enter last name.
	     WebElement lastNameField = driver.findElement(By.xpath("//input[@name='last_name']")); 
	     lastNameField.sendKeys("LastName");
	     //Enter email address
	     WebElement email = driver.findElement(By.name("email"));
	     email.sendKeys("name@gmail.com");
	     //Find the Test field for massage
	     //Enter a massage
	     WebElement messageField = driver.findElement(By.xpath("//textarea[@name='message']"));
	     messageField.sendKeys("message");
	    // Click on Submit
	    WebElement submitBtn = driver.findElement(By.xpath("//input[@value='SUBMIT']"));
	    submitBtn.click();
	     Thread.sleep(10000);
		    String expectingMsg = driver.findElement(By.xpath("//h3[text()='Thank you for your mail!']")).getText();
			System.out.println(expectingMsg);
			if (expectingMsg.equals("Thank you for your mail!")) {
				System.out.println("Test pass");
			}else {
				System.out.println("Test fail");*/
			}
	}
