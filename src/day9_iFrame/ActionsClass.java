package day9_iFrame;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ActionsClass {

	public static void main(String[] args) {
	
		//actionsClassDemo();
		etsyActivity();

	}
	public static void actionsClassDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions action = new Actions(driver);
		
		// go to http://practice.primetech-apps.com/practice/drag-and-drop
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
		//drag the text to the empty box
		
		WebElement sourceTextElement= driver.findElement(By.id("text"));
		WebElement sourceTextAreaElement= driver.findElement(By.id("textarea"));
		WebElement sourceNumberElement= driver.findElement(By.id("Number"));
		
		WebElement targetBoxElement= driver.findElement(By.id("dropzone"));
		
		//remember! whenever you use actions function, you need to finish the function with PERFORM() function
		//.perform()         => can be used alone where there is only one actions function used
		//.build().perform() => for more than one chained actions functions
		action.dragAndDrop(sourceTextElement, targetBoxElement).build().perform();
		action.dragAndDrop(sourceTextAreaElement, targetBoxElement).build().perform();
		action.dragAndDrop(sourceNumberElement, targetBoxElement).build().perform();
	}
	
	public static void etsyActivity() {
		//Test case: 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act = new Actions(driver);
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		
			//go to Etsy.com
		driver.get("https://etsy.com");
			//Hover Over on Jewelry & Accessories
		WebElement JA = driver.findElement(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]"));
		act.moveToElement(JA).build().perform();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]")));
			//Mouseover on Bags & Purses
		WebElement BP = driver.findElement(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]"));
		System.out.println(BP.isDisplayed()); // isDisplayed method only cares about the element visibility on the UI.
		act.moveToElement(BP).build().perform();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shoulder Bags")));
			//Mouseover to Shoulder Bags
		WebElement ShoulderBags = driver.findElement(By.linkText("Shoulder Bags"));
		act.moveToElement(ShoulderBags).build().perform();
		
			//Click on the shoulder bags
		ShoulderBags.click();
		
			//Verify you are on the Shoulder bags page
		if (driver.getTitle().contains("Shoulder Bags")) {
			System.out.println("We are on the shoulder bags page");
		}else {
			System.out.println("We are Not on the shoulder bags page");
		}
	}
}
