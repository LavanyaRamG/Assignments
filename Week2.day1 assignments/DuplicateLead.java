package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("My Company");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gali");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tarak");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("It's my first Automation Testing description form");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lavanyaramg@gmai.com");
         driver.findElement(By.className("smallSubmit")).click();
         driver.getTitle();
         driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
         driver.findElement(By.id("createLeadForm_companyName")).clear();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("My First Company");
         driver.findElement(By.id("createLeadForm_firstName")).clear();
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mrs.Lavanya");
         driver.findElement(By.linkText("Create Lead")).click();
         driver.getTitle();
	}
		/* Assignment 2:Duplicate Lead
         1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Click on Create Button
         15. Get the Title of Resulting Page using driver.getTitle()
         16. Click on Duplicate button
         17. Clear the CompanyName Field using .clear() And Enter new CompanyName
         18.Clear the FirstName Field using .clear() And Enter new FirstName
Bu        19.Click on Create Lead Button
         20. Get the Title of Resulting Page using driver.getTitle()
*/

}
