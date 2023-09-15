package day5_WebElement;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithWebElements {
	public static void main(String[] args) throws InterruptedException {
		
        WorkingwithWebElements classObject= new WorkingwithWebElements();
        //classObject.KeyPressExample();
        //classObject.navigateExamples();
       // classObject.findElementsDemo();
        classObject.ListOfElements();
	}
	
	public void navigateExamples() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//window maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to("https:google.com");
		WebElement inputBox= driver.findElement(By.name("q"));
		
		inputBox.sendKeys("Cofee Mug", Keys.ENTER);
		Thread.sleep(2000);
		//navigate back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		//navigate forward to last visited page
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
		
		
	public void KeyPressExample() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//window maximize
		driver.manage().window().maximize();
		//Implicitly wait - waits the page(html elements/DOM structure) to be loaded properly
		//That doesn't mean your element to be visible on the screen
		//It doesn't wait 5 sec if the page is loaded in 1 sec, it just moves to the next command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//navigate to google.com
		driver.get("https://google.com");
		//search for coffee mug
		WebElement inputBox= driver.findElement(By.name("q"));
		inputBox.sendKeys("Cofee Mug");
		//press enter
		inputBox.sendKeys(Keys.ENTER);
		//find the search box again
		WebElement searchInputBox= driver.findElement(By.name("q"));
		//select the text in it
		searchInputBox.sendKeys(Keys.chord(Keys.COMMAND,"a"));
		Thread.sleep(2000);
		//delete the selected text
		searchInputBox.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		//search new item
		searchInputBox.sendKeys("Pretty coffee mug", Keys.ENTER);
    }
	
	public void findElementsDemo() {
		// Test case 1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    // go to https://saucedemo.com
		driver.get("https://saucedemo.com");
	    // log in with username = standard_user   password = secret_sauce
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    // find all the results and get them in a list, and print the size of the list.
		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item"));
		int sizeOfList = items.size();
		System.out.println(sizeOfList + " Items available on the page.");
		
	}

public void ListOfElements() {
	  // Test case 2 
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	     //go to https://saucedemo.com 
				driver.get("https://saucedemo.com");
	     //log in with username = standard_user   password = secret_sauce
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
	     //find all the results. print the price of each result. 
	     //Hint: loop through the list, get index and get text
				List<WebElement> itemsPrice = driver.findElements(By.cssSelector(".inventory_item_price"));
				    //index loop
				for (int i = 0; i < itemsPrice.size(); i++) {
				    System.out.println(itemsPrice.get(i).getText());
				    // broken down steps.
//					WebElement singleItem = itemsPrice.get(i);
//					String priceofItem = singleItem.getText();
//					System.out.println(priceofItem);
				}
				
				// for each loop version  == demo purpose only
				for (WebElement singleItemPrice : itemsPrice) {
					System.out.println(singleItemPrice.getText());
				}
	}
}
