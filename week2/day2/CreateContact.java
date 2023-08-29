package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Raghu");
		driver.findElement(By.id("lastNameField")).sendKeys("Test");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Raghu_Fname_Local");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raghu_LastName_Local");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("This is Department name--software Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is the data for description field");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("raghavendra.j878+6@gmail.com");
		
	WebElement stateCode= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select stateDropdown = new Select(stateCode);
	stateDropdown.selectByVisibleText("New York");
	
	driver.findElement(By.name("submitButton")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is data for important notes field");
	driver.findElement(By.xpath("//input[@value = 'Update']")).click();
	String title=driver.getTitle();
	System.out.println(title);
		
		
	}

}
