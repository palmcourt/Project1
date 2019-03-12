package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Testbase;
import listioners.ListionerTest;

@Listeners(ListionerTest.class)
public class LoginTest extends Testbase{
	
	@Test
	public void login1() throws InterruptedException{

		driver.findElement(By.xpath(OR.getProperty("custlogin"))).click();
		Thread.sleep(2000);
	}

	@Test
	public void login2() throws InterruptedException{

		driver.findElement(By.xpath(OR.getProperty("custlogin"))).click();
		Thread.sleep(2000);
	}

}
