package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class LeafGroundDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement	course = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select listOfCourses = new Select(course);
	listOfCourses.selectByVisibleText("Selenium");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		Thread.sleep(2000);
		WebElement toPass=driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[1]"));
		toPass.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
		Thread.sleep(4000);
		
		System.out.println("The first City loaded for the country Brazil is " + driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[4]")).getText());
		System.out.println("The second City loaded for the country Brazil is " + driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[5]")).getText());
		System.out.println("The Third City loaded for the country Brasile is " + driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[6]")).getText());
	
		
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/following::button")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Selenium WebDriver')]")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@id='j_idt87:lang_panel']//li)[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[contains(text(),'ಎರಡು')]")).click();
		
		
		
		
	}

}
