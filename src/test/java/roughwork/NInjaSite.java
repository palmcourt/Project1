package roughwork;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NInjaSite extends Base {
	@Test
	public void  register() throws InterruptedException {
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.xpath("//a//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("mahesh");
		driver.findElement(By.id("input-lastname")).sendKeys("babu");
		driver.findElement(By.id("input-email")).sendKeys("maheshbabu132546@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9999999999");
		driver.findElement(By.name("password")).sendKeys("mahesh@09");
		driver.findElement(By.name("confirm")).sendKeys("mahesh@09");
		driver.findElement(By.name("agree")).click();

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		List<WebElement> text2 = driver.findElements(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
		System.out.println(text2.size());
		if(text2.size()>0) 
		{
			WebElement text= driver.findElement(By.xpath("//*[text()=' Warning: E-Mail Address is already registered!']"));
			System.out.println(text.getText());
		} else {
			driver.findElement(By.xpath("//*[text()='Continue']")).click();
			Thread.sleep(9000);
		}
	}
	@Test
	public void login() {
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.xpath("//a//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("maheshbabu123@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("mahesh@09");
		driver.findElement(By.xpath("//*[@value='Login']")).click();

	}
	@Test
	public void tablet() throws InterruptedException {
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.xpath("//*[text()='Tablets']")).click();
		driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
		Thread.sleep(3000);

		WebElement text = driver.findElement(By.xpath("//*[contains(text(),' Success: You have added ')]"));
		System.out.println(text.getText());
		driver.findElement(By.id("cart")).click();
		driver.findElement(By.xpath("//*[text()=' View Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		Thread.sleep(9000);
		WebElement text1 = driver.findElement(By.xpath("//*[contains(text(),' Products marked with')]"));
		System.out.println(text1.getText());
		Thread.sleep(6000);

	}



}
