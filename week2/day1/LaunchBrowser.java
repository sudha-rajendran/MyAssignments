package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		//Launch browser - Chrome
		//ChromeDriver driver=new ChromeDriver();
		
		//Launch Edge Browser using EdgeDriver
		EdgeDriver driver=new EdgeDriver();		
		
		//Load URL - get
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Write a code to automatically close the browser
		driver.close();
		
	}

}
