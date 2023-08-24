package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("WebDriver");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Annual Revenue']/following::input")).sendKeys("1000 million");
		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		industry.selectByVisibleText("Computer Software");
        Select ownerShip = new Select(driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
        ownerShip.selectByVisibleText("S-Corporation");
        Select marketingCampaign = new Select(driver.findElement(By.xpath("//select[@id='marketingCampaignId']")));
        marketingCampaign.selectByVisibleText("eCommerce Site Internal Campaign");
        Select  stateProvince = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
        stateProvince.selectByValue("TX");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        
        
        
		
		
				

		
		
		
		
	}	/*Assignment 3:CreateAccount 

		
		   1. Launch URL "http://leaftaps.com/opentaps/control/login"
		   
		   2. Enter UserName and Password Using Id Locator
		   
		   3. Click on Login Button using Class Locator
		   
		   4. Click on CRM/SFA Link
		   
		   5. Click on Accounts Button
		   
		   6. Click on Create Account
		    
		   7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		   
		   8. Enter DEscriptiion as "Selenium Automation Tester"
		   
		   9. Enter LocalName Field Using Xpath Locator
		   
		   10. Enter SiteName Field Using Xpath Locator
		   
		   11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		   
		   12. Select Industry as ComputerSoftware
		   
		   13. Select OwnerShip as S-Corporation using SelectByVisibletext
		   
		   14. Select Source as Employee using SelectByValue
		   
		   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		   
		   16. Select State/Province as Texas using SelectByValue 
		   
		   17. Click on Create Account using Xpath Locator
*/
	}


