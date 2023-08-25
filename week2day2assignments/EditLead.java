package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException { ChromeDriver driver = new ChromeDriver();
    //Load the url
     driver.get("http://leaftaps.com/opentaps/control/main");//
    //maximize the window
    driver.manage().window().maximize();
    //findElement Enter username
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    Thread.sleep(2000);
    //findElement Enter password
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    //findElement click login
    driver.findElement(By.className("decorativeSubmit")).click();
    //verify the page is open
    //To get the title of the page
    Thread.sleep(2000);
    String title = driver.getTitle();     //assign local variable ctrl+2
    System.out.println(title);
 // Click on CRM/SFA
    driver.findElement(By.linkText("CRM/SFA")).click();
    //click on leads
    driver.findElement(By.linkText("Leads")).click();
    //Click Find leads
    driver.findElement(By.linkText("Find Leads")).click();
    Thread.sleep(5000);
    //Enter first name
    driver.findElements(By.xpath("//input[@name='firstName']")).get(2).sendKeys("Revathy");
    //Click Find leads button
     driver.findElement(By.className("x-btn-text")).click();
     // Click on first resulting lead
     String leadId= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).getText();
     System.out.println("Lead Id" + leadId);
     // Verify title of the page
     String titlePage = driver.getTitle(); 
     System.out.println(titlePage);
     //Click Edit
     driver.findElement(By.linkText("Edit")).click();
     //Change the company name
     driver.findElement(By.id("updateLeadForm_companyName")).clear();
     //Click Update
     driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
     //Confirm the changed name appears
     driver.findElement(By.xpath("//input[@value='Update']")).click();
     String updatedCompanyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
     if(updatedCompanyName.contains("TestLeaf"))
     {
    	 System.out.println("updated company name vavified");
     }
     
     else {
    	 System.out.println("Company name not updated");
     }
     
     //Close the browser (Do not log out)
     driver.close();
    
		
	}

}
