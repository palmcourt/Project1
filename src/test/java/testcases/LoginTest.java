package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Testbase;
import listioners.ListionerTest;
import pageObjects.GoogleHomePage;
import utils.RandomUtil;

@Listeners(ListionerTest.class)
public class LoginTest extends Testbase{
	
	@Test
	public void login1() throws InterruptedException{

		driver.findElement(By.xpath(OR.getProperty("custlogin"))).click();
		Thread.sleep(2000);
		RandomUtil.getRandomNumberByNofDigits(5);
	}

	@Test
	public void login2() throws InterruptedException{

		driver.findElement(By.xpath(OR.getProperty("custlogin"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[text()='Sign in']")).click();
	}

	@Test
	public void GoogleSignup(){
		GoogleHomePage page = new GoogleHomePage(driver);
		//assertEquals("test", driver.getTitle(), "Title is not mached");
		page.verifyPageURL();
		page.signIn();
	}
}
