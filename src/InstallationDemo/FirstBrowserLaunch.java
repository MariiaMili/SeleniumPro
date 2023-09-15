package InstallationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowserLaunch {
    public static void main(String[] args) {
    	
	System.setProperty("webdriver.chrome.driver",
			  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
WebDriver driver= new ChromeDriver();

driver.get("https://amazon.com");
//type for coffee mug in search field
// 1. find the element of the search field
WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//2. sendKeys( to the found element)
searchBox.sendKeys("coffee mug");
// click on search button
  // 1. find the search button element
WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
  // 2. click on the element
searchButton.click();
}}
