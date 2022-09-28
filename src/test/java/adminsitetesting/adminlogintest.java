package adminsitetesting;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testing.*; 
 
import junit.framework.Assert;

public class adminlogintest extends adminbaseclass{
	
	@Test
	public void NegativeTest() {
	adminloginpage login = new adminloginpage(driver); 
	login.loginFunction("admin", "admin123" ); 
	//_ngcontent-lfu-c49
	WebElement ErrorMsg =driver.findElement(By.xpath("//p[text()='Invalid Credentials']")); 
 
	System.out.print(ErrorMsg);
	String ActError = ErrorMsg.getText(); 
	String ExpError = "Invalid Credentials";
	
	Assert.assertEquals(ActError, ExpError); 
 
	 
}

	@Test
	public void PositiveTest() {
	adminloginpage login = new adminloginpage(driver); 
	login.loginFunction("admin", "admin" ); 
 
	 
	 ArrayList<WebElement> arrlist = new ArrayList<WebElement>();
 
	
	 List<WebElement> columnsid = driver.findElements(By.xpath("//div[@class ='bd']/table/tr/th[text()='id']")); 

     for (WebElement idnubmer: columnsid) {
    	 arrlist.add(idnubmer);} 
	
	
    System.out.println(arrlist.size()); 
 	Assert.assertEquals(arrlist.size(), 3);
      
	
 
}
}
