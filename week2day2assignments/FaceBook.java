package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Lavanya");
		driver.findElement(By.name("lastname")).sendKeys("Gali");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("NewPassword");
		Select dayDropDown = new Select(driver.findElement(By.id("day")));
		dayDropDown.selectByVisibleText("28");
		Select monthDropDown = new Select(driver.findElement(By.id("month")));
		monthDropDown.selectByVisibleText("Aug");
		Select yearDropDown = new Select(driver.findElement(By.id("year")));
		yearDropDown.selectByValue("1993");
		driver.findElement(By.className("_8esa")).click();
		//driver.quit();
		
		
		
	//	FaceBook:
			//================================
			// Step 1: Download and set the path 
			// Step 2: Launch the chromebrowser
			// Step 3: Load the URL https://en-gb.facebook.com/
			// Step 4: Maximise the window
			// Step 5: Add implicit wait
			// Step 6: Click on Create New Account button
			// Step 7: Enter the first name
			// Step 8: Enter the last name
			// Step 9: Enter the mobile number
			// Step 10: Enterthe password
			// Step 11: Handle all the three drop downs
			// Step 12: Select the radio button "Female" 
			         //   ( A normal click will do for this step) 

	}

}
