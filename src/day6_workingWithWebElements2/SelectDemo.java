package day6_workingWithWebElements2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		SelectDemo demo = new SelectDemo();
		demo.selectDemo();
		

	}
	
    public void selectDemo() throws InterruptedException {
    	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//go to https://practice.primetech-apps.com/practice/radio-button
		driver.get("https://practice.primetech-apps.com/practice/radio-button");
		
		//select French from language dropdown
		//whenever you get a dropdown which started with select tagname in HTML,
		//that's the time that you can use this select class
		
		WebElement languageDropdown= driver.findElement(By.id("language"));
		Select letsSelect = new Select(languageDropdown);
		
		//get all the options and get text print them
		List<WebElement> allOptions = letsSelect.getOptions();
		for (WebElement option: allOptions) {
			System.out.println(option.getText());
		}
		
		//get first selected option
		WebElement firstSelectedOption = letsSelect.getFirstSelectedOption();
		System.out.println("First selected item is:" + firstSelectedOption.getText());
		Thread.sleep(10000);
		
		
		//select by visible text  //Most commonly used one
		letsSelect.selectByVisibleText("French");
		Thread.sleep(10000);
	
		
		//get first selected option here
		System.out.println("After selecting French, first selected option is:"
		+ letsSelect.getFirstSelectedOption().getText());
		
		
		//select by index
		letsSelect.selectByIndex(4);
		Thread.sleep(10000);
		
		//select  by value
		letsSelect.selectByValue("Spanish");
		Thread.sleep(10000);	
		
		//deselect option only works with multi-select dropdown
		
		// select class only works w/dropdown which is created by Select tag in html
		// if the dropdown is not created with select tag in HTML, we just treat the dropdown as a regular element.
		// we find the dropdown element, and click on it to expand, then find the value we wanna select,  then click on it.
    }
}
