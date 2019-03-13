package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePage extends PageObject{


	
	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,using=".//*[text()='Sign in']")
	private WebElement signin;

	
	public void signIn(){
		this.signin.click();
	}
	
	public void verifyPageURL(){
		driver.getCurrentUrl().contains("www.google.com");
	}
}
