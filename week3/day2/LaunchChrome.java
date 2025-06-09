package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public void launch() {
	ChromeDriver driver=new ChromeDriver();
	System.out.println("Chrome is launched");
	}
	
	public static void main(String[] args) {
		LaunchChrome browserOptions=new LaunchChrome();
		browserOptions.launch();
	}

}
