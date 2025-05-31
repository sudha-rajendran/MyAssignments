package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public void launchBrowser() {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://google.com");
		System.out.println("Browser Launched Successfully");

	}
	
	public void loadUrl() {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://google.com");

			}
	
	
	public static void main(String[] args) {
		Browser browseroptions=new Browser();
		browseroptions.launchBrowser();
		browseroptions.loadUrl();

	}

}
