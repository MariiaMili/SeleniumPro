package day10Framework;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Driver;

public class DriverClassDemo {

	public static void main(String[] args) {
		etsyActivity();
		
		}
	
		public static void etsyActivity() {
			Driver.getDriver().manage().window().maximize();
			Actions act = new Actions(Driver.getDriver());
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
			
				//go to Etsy.com
			Driver.getDriver().get("https://etsy.com");
				//Hover Over on Jewelry & Accessories
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]")));
			WebElement JA = Driver.getDriver().findElement(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]"));
			act.moveToElement(JA).build().perform();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]")));
				//Mouseover on Bags & Purses
			WebElement BP = Driver.getDriver().findElement(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]"));
			System.out.println(BP.isDisplayed()); // isDisplayed method only cares about the element visibility on the UI.
			act.moveToElement(BP).build().perform();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shoulder Bags")));
				//Mouseover to Shoulder Bags
			WebElement ShoulderBags = Driver.getDriver().findElement(By.linkText("Shoulder Bags"));
			act.moveToElement(ShoulderBags).build().perform();
			
				//Click on the shoulder bags
			ShoulderBags.click();
			
				//Verify you are on the Shoulder bags page
			if (Driver.getDriver().getTitle().contains("Shoulder Bags")) {
				System.out.println("We are on the shoulder bags page");
			}else {
				System.out.println("We are Not on the shoulder bags page");
			}
			Driver.quitDriver();
	}

}
