package day6_workingWithWebElements2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "/Users/Miliair/Desktop/Automation/WebTools/ChromeDriver/chromedriver");
		
      RadioCheckboxes test = new RadioCheckboxes();
      //test.radioButtonDemo();
      //test.searchButtonTestCase1();
      //test.radioButtonTestCase2();
        test.CheckboxesTestCase3();
	}
	
	    public void radioButtonDemo() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//go to fb
		driver. get("https://facebook.com");
		//click on create new acc
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//check if the Male radio button selected or not
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']"));
		
		if(maleRadio.isSelected()) {
			System.out.println("Male radio button is already selected");
		} else {
			//if not, then select the Male radio button
	     maleRadio.click();		
		}
		
		if (maleRadio.isDisplayed()) {
			System.out.println("The male radio button is displayed!");
		}else {
			System.out.println("The male radio button is NOT displayed!");
		}
		
		if (maleRadio.isEnabled()) {
			System.out.println("The male radio button is enabled!");
		}else {
			System.out.println("The male radio button is NOT enabled!");
        }
       }
	    
	    public void searchButtonTestCase1() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//go to indeed
			driver. get("https://indeed.com");
			//check if search fields are enabled and displayed
			WebElement whatField = driver.findElement(By.id("text-input-what"));
			WebElement whereField = driver.findElement(By.id("text-input-where"));
			
			if (whatField.isEnabled() && whatField.isDisplayed()) {
				System.out.println("What field is enabled and displayed!");
			}else {
				System.out.println("What field is NOT enabled and displayed!");
			}
			if (whereField.isEnabled() && whereField.isDisplayed()) {
				System.out.println("What field is enabled and displayed!");
			}else {
				System.out.println("What field is NOT enabled and displayed!");
			}
	        }
			
		public void radioButtonTestCase2() throws InterruptedException {
		    WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//go to indeed
			driver. get("http://practice.primetech-apps.com/practice/radio-button");
			//Find those available radio buttons.
			List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-label"));
			//Check if it's displayed and enabled,  
			//if true, check if it's selected, if false select the button and check if it's selected.	
				
			for (WebElement radio : radioButtons) {
				if (radio.isDisplayed() && radio.isEnabled()) {
					System.out.println("Radio button is enabled and displayed!");
					if (radio.isSelected()) {
						System.out.println("Radio button is selected!");
					}else {
						radio.click();
					}
				}else {
					System.out.println("Radio button is NOT enabled and displayed!");
				}
				
				if (radio.isSelected()) {
					System.out.println("Radio button is selected now!");
				}else {
					System.out.println("Radio button is NOT selected now!");
				}
				Thread.sleep(1000);
			}
			

		}
		
	    public void CheckboxesTestCase3() throws InterruptedException {
				    WebDriver driver= new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					
					//go to http://practice.primetech-apps.com/practice/check-box
					driver. get("http://practice.primetech-apps.com/practice/check-box");
					List<WebElement> checkBoxes = driver.findElements(By.className("form-check-input"));
					for (WebElement checkbox : checkBoxes) {
						if (checkbox.isDisplayed()) {
							System.out.println("Checkbox is displayed.");
							if (checkbox.isEnabled()) {
								System.out.println("Checkbox is enabled.");
								if (checkbox.isSelected()) {
									System.out.println("Checkbox is selected.");
								}else {
									checkbox.click();
								}
							}else {
								System.out.println("Checkbox is NOT enabled.");
							}
						}else {
							System.out.println("Checkbox is NOT displayed.");
						}
						
						if (checkbox.isSelected()) {
							System.out.println("Checkbox is selected now.");
						}else {
							System.out.println("Checkbox is still NOT selected.");
						}
						Thread.sleep(1000);
					}
			       
				}
	    
}

