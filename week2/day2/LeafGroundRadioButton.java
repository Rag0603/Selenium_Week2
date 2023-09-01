package assignments2.week2.day2;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//h5[contains(text(), 'Your most favorite browser')]/following::span)[1]")).click();
		
		
		
	Boolean beng =driver.findElement(By.xpath("//input[@id='j_idt87:city2:1']")).isSelected();
	
	if(beng)
	{
		System.out.println("The option b'lore is selected already");
	}else
	{
		System.out.println("The Option b'lore is not selected");
	}
	
	
Boolean chen =driver.findElement(By.xpath("//input[@id='j_idt87:city2:0']")).isSelected();
	
	if(chen)
	{
		System.out.println("The option Chennai is selected already");
	}else
	{
		System.out.println("The Option Chennai is not selected");
		
	}
Thread.sleep(2000);
		Boolean hyd = driver.findElement(By.xpath("//input[@id='j_idt87:city2:2']")).isSelected();
		
		if(hyd)
		{
			System.out.println("The option Hyderabad is selected already");
		}else
		{
			System.out.println("The Option Hyderabad is not selected");
		}
		
		
	
		for(int i = 1; i <= 4; i++) {
			
	Boolean know = driver.findElement(By.xpath("(//h5[contains(text(), 'Find the default select radio button')]//following::input)[" + i + "]")).isSelected();
		   
		    if(i==1 && know)
		    	
		    {
		    	System.out.println("The Browswer Chrome is Selected");
		    	
		    }
		    
		    else if(i==2 && know)
		    {
				
		    	System.out.println("The Browswer Firefox is Selected ");
			}
		    
		    else if(i==3 && know)
		    {
				
		    	System.out.println("The Browswer Safari is Selected ");
		    }
	
	
		    else if(i==4 && know)
		    {
				
		    	System.out.println("The Browswer Edge is Selected ");
		    }
		}
		    
	
		
		
		
}
	
}

