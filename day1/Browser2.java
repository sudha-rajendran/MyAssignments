package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {

	public String launchBrowser() {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://google.com");
		return "Browser Launched Successfully";

	}
	
	public void loadUrl() {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://google.com");

			}
	
	
	public static void main(String[] args) {
		Browser2 browseroptions=new Browser2();
		String launchBrowser = browseroptions.launchBrowser();
		System.out.println(launchBrowser);
		browseroptions.loadUrl();

	}

}
