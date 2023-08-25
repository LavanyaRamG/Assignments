package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
	    Select automationTool = new Select(driver.findElement(By.className("ui-selectonemenu")));
	    automationTool.selectByVisibleText("Selenium");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@data-label='India']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[text()='Select City']")).click();
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	   // driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
	    driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	    driver.findElement(By.xpath("//li[@data-label='Telugu']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	    driver.findElement(By.xpath("//li[@data-label='ఒకటి']")).click();
	    
	    
	    
		//Assignment 4:
			//DropDown in Leaf Ground:
			//https://www.leafground.com/select.xhtml 

	}

}
