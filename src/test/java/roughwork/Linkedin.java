package roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Linkedin extends Base {
	//WebDriver driver;
	@Test
	public void SignUp() throws Exception  {


		driver.get("https://www.linkedin.com/");
		driver.findElement(By.id("reg-firstname")).sendKeys("shrihan");
		driver.findElement(By.id("reg-lastname")).sendKeys("reddy");
		driver.findElement(By.id("reg-email")).sendKeys("shrihan@gmail.com");
		driver.findElement(By.id("reg-password")).sendKeys("shrihan");
		driver.findElement(By.id("registration-submit")).click();
		Thread.sleep(5000);

		// driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
		//checkbox.click();
		Thread.sleep(1000);

	}
}
