package assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Raghu_Test Company");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Surname");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RG_Test");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raghu_Name_Local");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing_Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("raghavendra.j878@gmail.com");
		

		WebElement drp = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sp = new Select(drp);
		sp.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("The Title of the page landed after the lead creation is: " + driver.getTitle());
		
		
		
		
		

	}

}
