package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
    //Click on Phone
    driver.findElement(By.xpath("//span[text()='Phone']")).click();
   // driver.findElement(By.name(" xphoneCountryCode")).sendKeys("");
    driver.findElement(By.name("phoneAreaCode")).sendKeys("2");
    driver.findElement(By.name("phoneNumber")).sendKeys("123456789");
    //Click find leads button
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    //Capture lead ID of First Resulting lead
    String leadId= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).getText();
    System.out.println("Lead Id" + leadId);
    //Click First Resulting lead
    //driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).click();
    //driver.findElement(By.linkText(leadId)).click();
    //Click Delete
    driver.findElement(By.className("subMenuButtonDangerous")).click();
    Thread.sleep(3000);
   // Click Find leads
    driver.findElement(By.linkText("Find Leads")).click();
    //Enter captured lead ID
    driver.findElement(By.name("id")).sendKeys(leadId);
    //Click find leads button
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
    Thread.sleep(10000);
   String notificationMessage = driver.findElement(By.className("x-paging-info")).getText();
   System.out.println("Notification Value: "  + notificationMessage);
   if("No records to display".equalsIgnoreCase(notificationMessage)) {
	   System.out.println("LeadId Deleted");
   }
   else {
	   System.out.println("LeadId not Deleted");
   }
   //Close the browser (Do not log out)
   driver.quit();
			
		}
	
	}


