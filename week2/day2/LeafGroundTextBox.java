package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='col-12']/input[1]")).sendKeys("Raghavendra KJ");
		Thread.sleep(4000);
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(", India");
		Thread.sleep(4000);
		if(driver.findElement(By.id("j_idt88:j_idt93")).isDisplayed())
{
	System.out.println("The Text Box is disabled");
}
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		Thread.sleep(2000);	
	String text = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
	Thread.sleep(2000);
	System.out.println("The Retrived text is: " + text);
Thread.sleep(5000);
	 WebElement mailAndTab = driver.findElement(By.id("j_idt88:j_idt99"));
	mailAndTab.sendKeys("raghavendra.j878@gmail.com"); 
	mailAndTab.sendKeys(Keys.TAB);
	
	driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am Raghavendra");
	driver.findElement(By.className("ql-editor")).sendKeys("Adding inputs to a Text editor");
	
	Thread.sleep(5000);
	driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
	System.out.println("The field validation error messgae is " +  driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText());
	Thread.sleep(2000);

	Point beforeEnter = driver.findElement(By.xpath("(//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::label)[1]")).getLocation();
	System.out.println("The Position/Location of the label 'username' before clicking on the field is "+ beforeEnter);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::input)[1]")).click(); 
	Point afterEnter = driver.findElement(By.xpath("(//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::label)[1]")).getLocation();
	System.out.println("The Position/Location of the label 'username' after clicking on the field is "+ afterEnter);
	
	if(beforeEnter.equals(afterEnter))
	{
		System.out.println("The postion of the Label user name hasn't chnaged");
	}else
	{
		System.out.println("Thus,The postion has been changed successfully");
	}
	
	driver.findElement(By.xpath("(//h5[contains(text(), 'Type your name and choose the third option')]/following::ul)[1]")).click();
	driver.findElement(By.xpath("(//h5[contains(text(), 'Type your name and choose the third option')]/following::span)[1]")).click();
	driver.findElement(By.xpath("(//h5[contains(text(), 'Type your name and choose the third option')]/following::li[text()='3'])")).click();
	driver.findElement(By.xpath("(//h5[contains(text(), 'Click and Confirm Keyboard appears')]/following::input)[1]")).click();
Boolean	keyboard =driver.findElement(By.xpath("(//h5[contains(text(), 'Click and Confirm Keyboard appears')]/following::div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay'])[1]")).isDisplayed();
	
if (keyboard) {
	System.out.println("The keyboard is displayed");
	
}else {
	
	System.out.println("The keyboard is not displayed, Something worng!");

}
		
driver.findElement(By.xpath("(//h5[contains(text(), 'Custom Toolbar')]/following::button)[1]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//h5[contains(text(), 'Custom Toolbar')]/following::button)[2]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//h5[contains(text(), 'Custom Toolbar')]/following::button)[3]")).click();
Thread.sleep(3000);

//WebElement toolHanlding =driver.findElement(By.xpath("//h5[contains(text(),'Custom Toolbar')]/following::div[@class='ql-editor ql-blank']"));
//toolHanlding.sendKeys("This is Toolbar Text");
driver.findElement(By.xpath("//h5[contains(text(),'Custom Toolbar')]/following::div[@class='ql-editor ql-blank']")).sendKeys("This is Toolbar Text");


	}

}

