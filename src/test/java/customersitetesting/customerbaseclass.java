package customersitetesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class customerbaseclass {
WebDriver driver; 
	
	@BeforeMethod 
	public void SetUp() {
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");        
		driver = new ChromeDriver(); 
 
		driver.get("http://3.226.243.189:4200");	
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
		
	} 
	
	
	@AfterMethod 
	public void TearDown() {
	// 	driver.close(); 
		
		
	} 
	 
		
		
}
