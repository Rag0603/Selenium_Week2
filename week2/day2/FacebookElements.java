package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raghu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[contains(@aria-label, 'Mobile number or email')]")).sendKeys("8660190180");
		driver.findElement(By.xpath("//input[@id= 'password_step_input']")).sendKeys("Just123*");
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label= 'Month']"));
		Select monthDropdown = new Select(month);
		monthDropdown.selectByIndex(0);
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label= 'Day']"));
		Select dayDropdown = new Select(day);
		dayDropdown.selectByIndex(0);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label= 'Year']"));
		Select yearDropdown = new Select(year);
		yearDropdown.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//span[contains(@class,  '_5k_2 _5dba')])[2]")).click();
		
		
		
		

	}

}
