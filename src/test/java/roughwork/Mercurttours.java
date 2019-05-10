package roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mercurttours extends Base{
	/*@Test
	public void register() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		driver.findElement(By.name("firstName")).sendKeys("mahesh");
		driver.findElement(By.name("lastName")).sendKeys("babu");
		driver.findElement(By.name("phone")).sendKeys("9999999999");
		driver.findElement(By.id("userName")).sendKeys("maheshbabu123@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Palmcourt");
		driver.findElement(By.name("city")).sendKeys("Brickfeilds");
		driver.findElement(By.name("state")).sendKeys("kl");
		driver.findElement(By.name("postalCode")).sendKeys("407003");
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("MALAYSIA");
		driver.findElement(By.id("email")).sendKeys("maheshbabu123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mahesh@09");
		driver.findElement(By.name("confirmPassword")).sendKeys("mahesh@09");
		driver.findElement(By.name("register")).click();

		Thread.sleep(3000);
	}*/
	@Test
	
	public void login() {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.xpath("//*[text()='SIGN-ON']")).click();;
		driver.findElement(By.name("userName")).sendKeys("maheshbabu123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mahesh@09");
		driver.findElement(By.name("login")).click();
	}
@Test

	public void flights() throws InterruptedException {
	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	driver.findElement(By.xpath("//*[text()='Flights']")).click();
	Thread.sleep(3000);
WebElement checkbox= driver.findElement(By.xpath("//*[@value='roundtrip']"));
	checkbox.isSelected();
	Select select = new Select(driver.findElement(By.name("passCount")));
		select.selectByVisibleText("2");
		Select select2 = new Select(driver.findElement(By.name("fromPort")));
		select2.selectByVisibleText("London");
		Select select3 = new Select(driver.findElement(By.name("fromMonth")));
		select3.selectByVisibleText("March");
		Select select6 = new Select(driver.findElement(By.name("fromDay")));
		select6.selectByVisibleText("27");
		Select select4 = new Select(driver.findElement(By.name("toPort")));
		select4.selectByVisibleText("Sydney");
		Select select5 = new Select(driver.findElement(By.name("toMonth")));
		select5.selectByVisibleText("March");
		WebElement checkbox1 = driver.findElement(By.name("servClass"));
		checkbox1.click();
		Select select8 = new Select(driver.findElement(By.name("airline")));
		select8.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
		
	}
	
}
