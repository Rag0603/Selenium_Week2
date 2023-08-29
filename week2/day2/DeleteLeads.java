package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

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
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		driver.findElement(By.xpath("//input[@name= 'phoneNumber']")).sendKeys("8660190180");
		driver.findElement(By.xpath("//button[@id = 'ext-gen334']")).click();
		
		Thread.sleep(2000);
		
        WebElement leadId = driver.findElement(By.xpath("//td[@tabindex = 0]//a[1]"));
        String fetchLeadId = leadId.getText();
        System.out.println(fetchLeadId);
        driver.findElement(By.xpath("//td[@tabindex = 0]//a[1]")).click();   
        driver.findElement(By.xpath("//a[@class = 'subMenuButtonDangerous']")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fetchLeadId);
        driver.findElement(By.xpath("//button[@id = 'ext-gen334']")).click();
        
       WebElement checkIfDeleted = driver.findElement(By.xpath("//div[text() = 'No records to display']"));
       String deleted = checkIfDeleted.getText();
       
      System.out.println(deleted);
     
       
       if (deleted.equals("No records to display")) {
		
    	   System.out.println("Record with lead ID "+ fetchLeadId + " has been deleted");
	}else {
		
		System.out.println("Record still exists"); 
	}
    
        driver.close();
       
	}
}
