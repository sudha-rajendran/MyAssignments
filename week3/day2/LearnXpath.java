package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		//Launch browser
		EdgeDriver driver=new EdgeDriver();
				
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		//Maximize the browser
		driver.manage().window().maximize();
		

		//Find the Element- using findElement() method
		//Enter the value in a text filed- sendKeys() method
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
						
						
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//driver.findElement(By.xpath("//input[contains(@id,'pass')")).sendKeys("crmsfa");
						
		//Click on the login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				
		//click the crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click on leads 
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
	}

}
