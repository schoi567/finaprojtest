package customersitetesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import junit.framework.Assert;
import testing.*; 


public class customerlogintest extends customerbaseclass {	
	@Test
	public void NegativeTest() {
	customerloginpage login = new customerloginpage(driver); 
	login.loginFunction("abc@gmail.com", "awanmio!@#$234ASV" ); 
	
	WebElement ErrorMsg =driver.findElement(By.xpath("//div[@class='alert alert-danger']")); 
	String ActError = ErrorMsg.getText(); 
	String ExpError = "Invalid Credentials";
	
 	Assert.assertEquals(ActError, ExpError); 
	
	 
}

	@Test
	public void PositiveTest() {
    customerloginpage login = new customerloginpage(driver); 
	login.loginFunction("abc","abc"); 
	
    WebElement Deposit = driver.findElement(By.xpath("//a[text() ='Go to Deposit']"));
    Deposit.click();
  
 
    WebElement Withdraw = driver.findElement(By.className("withdraw"));
    String acttext = Withdraw.getText(); 
    System.out.println(acttext); 
    String expectedtext = "Withdraw"; 
	Assert.assertEquals(acttext, expectedtext); 
 
    
}
	

}
