package review;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
		//testCase1();
		//iFrame();
		testCase2();
	}
	
	public static void testCase1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		String mainPageID= driver.getWindowHandle();
		String newPageID="";
		String mainPageTxt=driver.findElement(By.xpath("h1[contains(text(),'Automation Testing Practice']")).getText();
		
		System.out.println(mainPageTxt);
		
		WebElement newWindowBtn= driver.findElement(By.cssSelector("button[onclick='myFunctions()']"));
		newWindowBtn.click();
		
		Set<String>newWindowIDs = driver.getWindowHandles();
		for (String str : newWindowIDs) {
			if(!str.equals(mainPageID)) { newPageID = str;
			} ;
			}
		driver.switchTo().window(newPageID);
		String newWindowTxt = driver.findElement(By.xpath("//h3[contains(text(),'Featured']")).getText();
		System.out.println(newWindowTxt);
		
		Thread.sleep(2000);
		driver.switchTo().window(mainPageID);
		newWindowBtn.click();
	}
	
		public static void iFrame() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		driver.get("https://testautomationpractice.blogspot.com");
		Thread.sleep(5000);
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//input[@class='text_field']")).sendKeys("Mili");
		
		driver.findElement(By.id("name")).sendKeys("Mili");
		}

		

       public static void testCase2() throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	    driver.get("https://testautomationpractice.blogspot.com");
	    
	    //Step 2: Go to "Frames" practice tab.
	    //Step 3: Locate the iFrame ID and switch to it by ID.
	    String mainPageID1= driver.getWindowHandle();
	    String mainPageTxt1=driver.findElement(By.className("Frames")).getText();
		
	    // Step 4: Locate the text box for "Name",  Gender buttons, DOB  
	    //String NameTxtBox = driver.findElement(By.className("text_field"));
	    // Step 5: Fill all the required information for all fields 
	    // Step 6: Locate the Job dropdown and select the correct value.
	    // Step 7: Locate the "Submit" button and Click on it. 
	    //Step 8: Switch back to the Main frame.
	    // Step 9: Get and verify the text on the top of the home page "Automation Testing Practice"
       }
       }
