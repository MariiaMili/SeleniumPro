package Day2_Locators;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
		
	public class ClassTasks {
			public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
							  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
			WebDriver driver= new ChromeDriver();
/*//Test case 1
			driver.get("https://facebook.com");
			WebElement emailBox = driver.findElement(By.id("email"));
			emailBox.sendKeys("Automation");
			WebElement passwordBox = driver.findElement(By.id("pass"));
			passwordBox.sendKeys("Automation");
			WebElement LoginButton = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
			LoginButton.click();	*/
//Test case 2
			driver.get("https://facebook.com");
			//find the Create New Account button and click on it
			WebElement newAccountBtn = driver.findElement(By.linkText("Create new account"));
			newAccountBtn.click();
			//Thread.sleep - stops java code execution for certain amount of time
			Thread.sleep(2000);
			//find the FirstName, LastName, Email and Password fields and type Automation
			WebElement firstName = driver.findElement(By.name("firstname"));
			WebElement lastName = driver.findElement(By.name("lastname"));
			WebElement email = driver.findElement(By.name("reg_email__"));
			WebElement password = driver.findElement(By.name("reg_passwd__"));
			firstName.sendKeys("automation");
			lastName.sendKeys("automation");
			email.sendKeys("automation");
			password.sendKeys("automation");
			//find he Sign Up button and click on it
			WebElement signupBtn = driver.findElement(By.name("websubmit"));
			signupBtn.click();	
			
			//get current url
			System.out.println("Current URL is:" + driver.getCurrentUrl());
			
			//get text of element
			WebElement nonUsersNoticeLink= driver.findElement(By.id("non-users-notice-link"));
			String noticeLinkText= nonUsersNoticeLink.getText();
			System.out.println("Notice Link Text is:" + noticeLinkText);
			
			//Close the browser - closes the current browser, if there are multiple
			driver.close();
			
			//quit the driver- shut down everything
			driver.quit();
			
				
}}
