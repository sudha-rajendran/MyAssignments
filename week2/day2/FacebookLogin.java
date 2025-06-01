package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//Launch browser
		EdgeDriver driver=new EdgeDriver();
		
		//Load the url
		driver.get("https://www.facebook.com/login.php/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username
		//Find the Element- using findElement() method
		//Enter the vlue in a text filed- sendKeys() method
		driver.findElement(By.id("email")).sendKeys("test@testleaf.com");
		
		
		//Enter the password
		driver.findElement(By.id("pass")).sendKeys("password");
		
		//Click on the login button
		driver.findElement(By.id("loginbutton")).click();		

	}

}
