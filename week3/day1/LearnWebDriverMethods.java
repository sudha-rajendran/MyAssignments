package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//driver.getTitle();- assign to local variable
		String titleOfPage = driver.getTitle();
		System.out.println("The title is: "+titleOfPage);
		
		
		//To get the currenturl
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The url is: "+currentUrl);
		
		//Enter the username
		//Find the Element- using findElement() method
		//Enter the vlue in a text filed- sendKeys() method
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
				
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();	
		
		//driver.findElement(By.linkText("CRM/SFA")).getText(); assign to local variable
		String textOnElement = driver.findElement(By.linkText("CRM/SFA")).getText();
		System.out.println(textOnElement);

		
	}

}
