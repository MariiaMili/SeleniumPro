package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validationPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
		
		String m = "Error: all fields are required";
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk");
		WebElement ConactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
		ConactUsForm.click();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Zhivko@gmail.com");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(5000);
		String errorMsg = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println(errorMsg);
		
		if(m.equals(errorMsg)) {
			System.out.println("Test pass!");
		}else {
			System.out.println("Test fail");
		}
		
		//driver.close();

	}

}
