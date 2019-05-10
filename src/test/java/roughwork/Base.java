package roughwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.TestIMPL;

public class Base {
	protected WebDriver driver;


	TestIMPL test = new TestIMPL();
	@BeforeMethod
	public void Instialize() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void QuitorClose() {

		if(driver!=null)
			driver.quit();

	}

	public void selectDropDownByVisibleText(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectDropDownByVisibleValue(String value, WebElement element) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void click(WebElement element) {
		element.click();		
	}
	public void senkeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	public void iFrame(WebElement element) {
		driver.switchTo().frame(element);
		
		
	}
}
