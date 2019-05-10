package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BankDetailsVerification {
	
	WebDriver driver;
	
	@Test
	public void Login() {
		
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");

	}
	
	@Test
	public void AddCustomer() throws Throwable {
		
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(5000);

		WebElement text = driver.findElement(By.xpath("//*[text()='Home']"));
		System.out.println(text.getText());
		WebElement text1 = driver.findElement(By.xpath("//*[text()='Customer Login']"));
		System.out.println(text1.getText());
		WebElement text2 = driver.findElement(By.xpath("//*[text()='Bank Manager Login']"));
		System.out.println(text2.getText());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Home']")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Customer Login']")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Bank Manager Login']")).isDisplayed());
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[text()='Bank Manager Login']")).click();
		Thread.sleep(1000);
		WebElement text3 = driver.findElement(By.xpath("//*[text()='Home']"));
		System.out.println(text3.getText());
		WebElement text4 = driver.findElement(By.xpath(".//div[@class='center']/button[1]"));
		System.out.println(text4.getText());
		WebElement text5 = driver.findElement(By.xpath(".//div[@class='center']/button[2]"));
		System.out.println(text5.getText());
		WebElement text6 = driver.findElement(By.xpath(".//div[@class='center']/button[3]"));
		System.out.println(text6.getText());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Home']")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(".//div[@class='center']/button[1]")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(".//div[@class='center']/button[2]")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(".//div[@class='center']/button[3]")).isDisplayed());

		driver.findElement(By.xpath(".//div[@class='center']/button[1]")).click();
		Thread.sleep(1000);

		String fname= "shrihan";
		String lname= "reddy";
		int postcode= 500;

		driver.findElement(By.xpath("(//div[@class='form-group']/input)[1]")).sendKeys(fname);
		driver.findElement(By.xpath("(//div[@class='form-group']/input)[2]")).sendKeys(lname);
		driver.findElement(By.xpath("(//div[@class='form-group']/input)[3]")).sendKeys(String.valueOf(postcode));
		driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath(".//div[@class='center']/button[3]")).click();

	}
	
	@BeforeSuite
	public void Initialize() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void CloseOrQuit() {
		if(driver!=null)
			driver.quit();

	}

}
