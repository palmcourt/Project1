package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageObject {
	
	public WebDriver driver;

	public PageObject(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
}
