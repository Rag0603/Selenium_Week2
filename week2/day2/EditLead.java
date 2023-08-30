package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("First Raghu");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//td[@tabindex = 0]//a[1]")).click();
		String	pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
	WebElement	before =driver.findElement(By.id("viewLead_companyName_sp"));
	String beforeUpdate = before.getText();
	System.out.println("The company name before updating--> "+  beforeUpdate );
	
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear(); 
		String updatingCompanyName = "This the updated company name - Spring";
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatingCompanyName);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		WebElement updatedName = driver.findElement(By.id("viewLead_companyName_sp"));
	
	String afterUpdating = updatedName.getText();
	System.out.println("The company name after updating--> "+ afterUpdating);

		
		
	/*	if(updatingCompanyName.contains(updatedCompanyName))
			
		{
			System.out.println("The company name has been updated successfully");
		}else {
			
			System.out.println("Update Failed");
		}
		
		*/
			
	}
	

}
