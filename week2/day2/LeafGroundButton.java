package assignments2.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
	System.out.println("The Title of the page is "+ title);
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	boolean button = driver.findElement(By.xpath("(//h5[contains(text(), 'Confirm if the button is disabled')]//following::button)[1]")).isEnabled();
		
	if (button) {
		
		System.out.println("The button is enabled");
		
		
	}else {
		System.out.println("The button is disabled");
		
	}
 Point position = driver.findElement(By.xpath("(//h5[contains(text(), 'Find the position of the Submit button')]//following::button)[1]")).getLocation();
	
 System.out.println("The position of the submit buttoon is " + position);
	}

}
