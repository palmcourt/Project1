package roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeQuora extends Base{
	//doubt
	@Test
	public void dynamicallyLoaded() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading");
		driver.findElement(By.xpath("//*[contains(text(),'hidden')]")).click();
		driver.findElement(By.xpath("//*[text()='Start']")).click();
		WebElement text = driver.findElement(By.xpath("//div[@id='loading']"));
		System.out.println(text.getText());
		Thread.sleep(5000);
		WebElement text1 = driver.findElement(By.xpath("//div/h4[text()='Hello World!']"));
		System.out.println(text1.getText());
	}
	
	

}
