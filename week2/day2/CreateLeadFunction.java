package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

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
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
				
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click the crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sudha");
		
		//Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		//Step1 : Find the Element, Ctrl+2 >> Assign to local Variable
		//driver.findElement(By.id("createLeadForm_dataSourceId"));
		//sourceDrop is a variable to store the element
		WebElement sourceDrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step2 : Create an object 'Select'. 'Select' is a predefined class in Java
		Select dropdown=new Select(sourceDrop);
		
		//Step3: Use the method to select the option
		//dropdown.selectByIndex(3);
		
		//Select by value
		//dropdown.selectByValue("LEAD_EMPLOYEE");
		
		//Select by text
		dropdown.selectByVisibleText("Existing Customer");
	}

}
