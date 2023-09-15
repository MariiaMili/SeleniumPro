package Day2_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver",
							  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
				WebDriver driver= new ChromeDriver();

				//driver.get("https://facebook.com");
				driver.get("https://amazon.com");
				//WebElement emailBox = driver.findElement(By.id("email"));
				//emailBox.sendKeys("Automation");
				//WebElement passwordBox = driver.findElement(By.id("pass"));
				//passwordBox.sendKeys("Automation");
				//WebElement LoginButton = driver.findElement(By.id("loginbutton"));
				//LoginButton.click();
				//driver.findElement(By.linkText("Clinic")).sendKeys("Automation");//element has to be a tag(anchor tag/link tag
				//driver.findElement(By.name("pass")).sendKeys("Automation");
				//driver.findElement(By.name("login")).click();
				  //driver.findElement(By.linkText("Clinic")).click();
				WebElement partialLinText= driver.findElement(By.partialLinkText(""));
	}}
