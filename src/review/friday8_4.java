package review;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class friday8_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
		//testCase1();
		testCase2();
	}
	public static void testCase1() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//	Step 1: Go to "https://www.automationtesting.co.uk".
		
		String uRl = "https://www.automationtesting.co.uk";
		driver.get(uRl);
		driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();	
        //Step 2: Maximize browser and declare implicitly wait for 5 seconds.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        //Step 3: Locate the Element for "test store" store it in variable and click it.
		WebElement testStoreBtm = driver.findElement(By.xpath("//*[contains(text(),'Test Store')]"));
		testStoreBtm.click();
		Thread.sleep(3000);
		//Step 4: Locate the search text box and store it in variable.
		WebElement searchBox = driver.findElement(By.className("ui-autocomplete-input"));
		
        //Step 5: Search for "Mug" and use SendKeys to Press ENTER.
		Thread.sleep(2000);
		searchBox.sendKeys("Mug");
		searchBox.sendKeys(Keys.ENTER);
		
        //Step 6: Navigate back to the previous page.
		Thread.sleep(2000);
		driver.navigate().back();
        //Step 7: Navigate forward to the recent page and refresh the page. 
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//Refresh the page 
		Thread.sleep(2000);
		driver.navigate().refresh();
		
        //Step 8:Close the browser.
		driver.quit();
}
	//Test case 2
	public static void testCase2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Step 1: Go to http://teststore.automationtesting.co.uk".
		String URL = "http://teststore.automationtesting.co.uk/";
		driver.get(URL);
		//driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
	    //Step 2: Locate "test store" element and click on it. 
	    //Step 3: Locate "Sign In button" and click on it.
		WebElement testStoreBtm = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
		testStoreBtm.click();
		Thread.sleep(3000);
	    //Step 4: Locate "No account? Create one here" and click on it.
		WebElement noAccBtn = driver.findElement(By.xpath("//*[@data-link-action='display-register-form']"));
		noAccBtn.click();
	    //Step 5: Locate "Create an account" and check if it isDisplayed.
		WebElement createAccElement = driver.findElement(By.className("page-header"));
		System.out.println("Checking if the Create Account is Displayed= " +createAccElement.isDisplayed());
	    //Step 6: Locate "Social title" radio buttons.
		WebElement MrBtn = driver.findElement(By.xpath("(//*[@name='id_gender'])[1]"));
		WebElement MrsBtn = driver.findElement(By.xpath("(//*[@name='id_gender'])[2]"));
	    //Step 7: Locate the three checkboxes before the save button.
		WebElement checkBox1 = driver.findElement(By.xpath("//*[@name='optin']"));
		WebElement checkBox2 = driver.findElement(By.xpath("//*[@name='newsletter']"));
		WebElement checkBox3 = driver.findElement(By.xpath("//*[@name='psgdpr']"));
        //Step 8: Check if the radio button isSelected, print statement to validate.
		Thread.sleep(3000);
		if (MrBtn.isSelected()) {System.out.println("This Button is selected");
			
		}else {System.out.println("This element is not selected");}
		
		if (MrsBtn.isSelected()) {System.out.println("This Button is selected");
		
		}else {System.out.println("This element is not selected");}
	
        //Step 9: Check if the checkboxes isSelected, print statement to validate. 
		if (checkBox1.isSelected() || checkBox2.isSelected() || checkBox3.isSelected()) 
		{System.out.println("This Checkbox is selected");
		
		}else {System.out.println("This element is not selected"); }
}
}
