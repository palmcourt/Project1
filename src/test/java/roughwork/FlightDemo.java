package roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlightDemo extends Base {
	@Test
	public void destinationarrival() throws InterruptedException {
		driver.get("http://blazedemo.com/");
		Select select = new Select(driver.findElement(By.name("fromPort")));
		select.selectByVisibleText("Mexico City");
		Select select1 = new Select(driver.findElement(By.name("toPort")));
		select1.selectByVisibleText("London");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//div[@class='container']/h3"));
		System.out.println(text.getText().split("to")[1]);
		
		
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();	
	}
	
	//public void details


}
