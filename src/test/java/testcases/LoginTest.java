package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Testbase;

public class LoginTest extends Testbase{
	
	@Test
	public void login() throws InterruptedException{
		
		driver.findElement(By.xpath(OR.getProperty("custlogin"))).click();
		Thread.sleep(2000);
	}

}
