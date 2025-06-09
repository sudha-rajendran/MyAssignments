package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class OOPsExamples {

	public static void main(String[] args) {
		//Inheritance
		//Java
		//      Sub class      Super
		//Class Integer extends Number
		
		
		//Selenium Example
		//ChromeDriver extends Chromium Driver extends RemoteWebDriver
		ChromeDriver driver=new ChromeDriver();
		
		
		//Polymorphism
		//Method overloading
		//Java example
		//subString
		
		//selenium example
		//driver.switchTo().frame()
		
		//Method Overriding
		//Java Example
		String str="TestLeaf";
		//str.equals(str)
		//.equals method in String
		
		//Selenium Example
		driver.quit();
		//quit method in ChromiumDriver
		
	}
	
}
