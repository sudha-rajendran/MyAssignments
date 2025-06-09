package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		//driver.findElement(By.className(_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy)).click();
		driver.get("https://en-gb.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Sudha");
		driver.findElement(By.name("lastname")).sendKeys("Rajendran");
		driver.findElement(By.name("birthday_day")).sendKeys("12");
		driver.findElement(By.name("birthday_month")).sendKeys("Dec");
		driver.findElement(By.name("birthday_year")).sendKeys("1986");
		driver.findElement(By.xpath("//input[@id='sex' and @value='2']"));
		//driver.findElement(By.name("birthday_year")).sendKeys("1986");



		
		
	}

}
