package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class adminloginpage {
	WebDriver driver; 
	
	public adminloginpage(WebDriver driver) {
		this.driver = driver; 
	}

	
	public void loginFunction(String Uname, String Pass) {
	 
	 
		WebElement UserName = driver.findElement(By.name("username")); 
		UserName.sendKeys(Uname); 
		
		WebElement Password = driver.findElement(By.name("password")); 
		Password.sendKeys(Pass); 
		
		WebElement remember= driver.findElement(By.id("chkPrint"));
        remember.click();
		
    	WebElement LoginBtn = driver.findElement(By.xpath("//input[@value ='Log In']")); 
		LoginBtn.click(); 
 
		
	} 
}
