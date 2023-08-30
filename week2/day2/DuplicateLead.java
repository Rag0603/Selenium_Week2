package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("raghavendra.j878@gmail.com");
		driver.findElement(By.xpath("//button[@id = 'ext-gen334']")).click();
		
		Thread.sleep(5000);
		
	WebElement fname = driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-cell-inner x-grid3-col-firstName')]/a)[1]"));
	String thisisFirstName = fname.getText();
	WebElement lname=driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-cell-inner x-grid3-col-lastName')]/a)[1]"));
	String thisIsLastName= lname.getText();
	
	String name = thisisFirstName + thisIsLastName;
	System.out.println(name);
	driver.findElement(By.xpath("//td[@tabindex = 0]//a[1]")).click();   
	driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	String dupPage=driver.getTitle();
	System.out.println(dupPage);
	driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
	WebElement dupFname = driver.findElement(By.xpath("//span[@id = 'viewLead_firstName_sp']"));
	String fnamedup = dupFname.getText(); 
	WebElement dupLname =driver.findElement(By.xpath("//span[@id = 'viewLead_lastName_sp']"));
	String lnamedup = dupLname.getText();
	
	String dupName = fnamedup+lnamedup;
	
	if (name.equals(dupName)) {
		
		System.out.println("The duplicated lead name("+dupName+") is same as the captured lead ("+name+")");
	}else {
		System.out.println("The duplicated lead name is not same as capture lead name");
	}
	}

}
