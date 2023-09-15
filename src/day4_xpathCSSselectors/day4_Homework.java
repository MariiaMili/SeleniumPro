package day4_xpathCSSselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4_Homework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
        WebDriver driver= new ChromeDriver();
      
    	//Go to indeed.com
        driver.get("https://indeed.com");
        String currentLocation = "Jacksonville, FL";
		//Find the Where field and get value of attribute 'value', then verify it's based on your current location.
        WebElement whereField = driver.findElement(By.id("text-input-where"));
        String locationValue = whereField.getAttribute("value");
		if (locationValue.equalsIgnoreCase(currentLocation)) {
			System.out.println("Current location Test pass");
		} else {
			System.out.println("Current location Test fail");
		}
		//Find the Where field and get css value of color, then print it out.
		String colorValue = whereField.getCssValue("color");
		System.out.println("css color value is " + colorValue);
		//Find the Where field and get tag name, then verify the tag name is equals to "input".
        String tagName = whereField.getTagName();
        if (tagName.equalsIgnoreCase("input")) {
			System.out.println("Tag name Test pass");
		} else {
			System.out.println("Tag name Test fail");
		}
      
       // driver.close();
       //driver.quit();
	}
}
