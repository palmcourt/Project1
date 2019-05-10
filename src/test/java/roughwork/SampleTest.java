package roughwork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SampleTest extends Base{

	@Test
	public void Form() {
		driver.get("http://www.globalsqa.com/samplepagetest/");
		//driver.findElement(By.xpath("//*[@type='file']")).click();
		driver.findElement(By.id("g2599-name")).sendKeys("shrihan");
		driver.findElement(By.id("g2599-email")).sendKeys("shrihan@gmail.com");
		driver.findElement(By.id("g2599-website")).sendKeys("www.google.com");
		Select select = new Select(driver.findElement(By.id("g2599-experienceinyears")));
		select.selectByVisibleText("1-3");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='Automation Testing']"));
		checkbox.click();
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='Graduate']"));
		checkbox1.click();
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
		driver.findElement(By.name("g2599-comment")).sendKeys("Resume is ready");
		driver.findElement(By.xpath("//input[@value='Submit »']")).click();;

		
	}
}
