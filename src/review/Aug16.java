package review;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
		//alertHandle();
	    //windowHandles();
		//testCase1();
		testCase2();
	}
	
	public static void alertHandle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//  Go to ‘https://demo.automationtesting.in/Alerts.html’
		driver.get("https://demo.automationtesting.in/Alerts.html");
        /*//	Click the button to display an alert box.
		driver.findElement(By.className("btn-danger")).click();	
		driver.findElement(By.className("btn-danger")).click();	
        //	Cancel or dismiss the alert.
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();*/
		
//		Click on Alert with text box. 
		WebElement alertWtext = driver.findElement(By.xpath("//*[text()='Alert with Textbox ']"));
		alertWtext.click();
		driver.findElement(By.className("btn-info")).click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		alt.sendKeys("Mili");
		Thread.sleep(5000);
		System.out.println(alt.getText());
		alt.accept();
		
	}
	
	public static void windowHandles() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String mainWindowId = driver.getWindowHandle();
		System.out.println(mainWindowId);
		
		WebElement clickBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		clickBtn.click();
		
		Set <String> windowsIds = driver.getWindowHandles();
		
		for (String str : windowsIds) {
			if(!str.equals(mainWindowId)) {driver.switchTo().window(str);}
		}
		
		String newPageTxt = driver.findElement(By.className("fs-1")).getText();
		System.out.println(newPageTxt);
		
		driver.switchTo().window(mainWindowId);
		String mainPagetxt = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText();
		System.out.println(mainPagetxt);
	}
			
			
			public static void testCase1() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
			driver.get("https://testautomationpractice.blogspot.com");
			//Locate the "JS Alerts" three buttons, save them in WebElement each.
			//Click on 'Alert' button then get the text from the Alert.
			//Accept the Alert. 
			WebElement alertBtn = driver.findElement(By.xpath("//button[contains(text(), 'Alert')]"));
			alertBtn.click();
			Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			
			Thread.sleep(3000);
			WebElement confirmBox = driver.findElement(By.xpath("//button[contains(text(), 'Confirm Box')]"));
			confirmBox.click();
			Alert alert3 = driver.switchTo().alert();
			alert3.dismiss();
			
			Thread.sleep(3000);

			WebElement prompt = driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]"));
			prompt.click();
			Alert alert4 = driver.switchTo().alert();
			alert4.sendKeys("Mili");
			Thread.sleep(3000);
			alert4.accept();
	
	}
			
			public static void testCase2() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
			driver.get("https://testautomationpractice.blogspot.com");
//			Get the main window ID and store it in a String called mainWindowId.
		String mainWID = driver.getWindowHandle();
		System.out.println(mainWID);
//			Click on the 'New Browser Window' button
		WebElement newBrowserBtn = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		newBrowserBtn.click();
//			Get window IDs and store it into a Set
		Set <String> allWindowIds = driver.getWindowHandles();
//			
		//Get the first window ID from the Set and Verify it matches with the main window id in step 2. 

		for (String str : allWindowIds) {
			if(str.equals(mainWID)) {System.out.println(str);}
		}
//			Switch to the second window.
		for (String str : allWindowIds) {
			if(!str.equals(mainWID)) {driver.switchTo().window(str);}
		}
//			Verify that there is a Featured Products  is Displayed.
		
		System.out.println(driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed());
		
		driver.close();
//			Close the window,  Switch back to the main window
		driver.switchTo().window(mainWID);
//			 Verify you are on the main window by confirming the text "Automation Testing Practice" is Matching in the home page
		String mainPagetxt = driver.findElement(By.xpath("//h1[contains(text(),'Automation Testing Practice')]")).getText();
		System.out.println(mainPagetxt);
	}	
}

