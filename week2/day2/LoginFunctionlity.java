package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFunctionlity {

	public static void main(String[] args) {
		//Launch browser
		EdgeDriver driver=new EdgeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username
		//Find the Element- using findElement() method
		//Enter the vlue in a text filed- sendKeys() method
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();		

	}

}
