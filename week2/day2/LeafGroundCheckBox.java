package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//table[@id='j_idt87:basic']//label[text()='Java']")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Tri State Checkbox')]/following::div[@id='j_idt87:ajaxTriState']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[contains(text(),'Tri State Checkbox')]/following::div[@id='j_idt87:ajaxTriState']")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Toggle Switch')]/following::div[@class='ui-toggleswitch-slider']")).click();
		
	Boolean check=driver.findElement(By.xpath("//h5[contains(text(),'Verify if check box is disabled')]/following::input[@id='j_idt87:j_idt102_input']")).isEnabled();
	Thread.sleep(2000);
		
		if (check) 
		{
			System.out.println("the Checkbox is enabled");
			
		}else {
			System.out.println("The checkbox is disabled");
		}
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		
		
	}

}
