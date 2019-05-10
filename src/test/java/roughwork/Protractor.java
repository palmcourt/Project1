package roughwork;

import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Protractor {
	WebDriver driver;

	public void timeout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void VerifyButtons() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.way2automation.com/angularjs-protractor/multiform/#/form/profile");
		driver.findElement(By.xpath("//div[@class='text-center']/a[1]")).getText();
		driver.findElement(By.xpath("//div[@class='text-center']/a[2]")).getText();
		driver.findElement(By.xpath("//div[@class='text-center']/a[3]")).getText();
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-info']")).getText();

	}



	@Test
	public void AddingFeilds() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.way2automation.com/angularjs-protractor/multiform/#/form/profile");
		driver.findElement(By.xpath("(//div[@class='form-group ng-scope']//*[@type='text'])[1]")).sendKeys("shrihan");
		driver.findElement(By.xpath("(//div[@class='form-group ng-scope']//*[@type='text'])[2]")).sendKeys("shrihan@gmail.com");
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-info']")).click();

	}
	@Test
	public void Intreset() throws Exception  {


		driver.get("http://www.way2automation.com/angularjs-protractor/multiform/#/form/profile");
		/*driver.findElement(By.xpath("(//div[@class='form-group ng-scope']//*[@type='text'])[1]")).sendKeys("shrihan");
		driver.findElement(By.xpath("(//div[@class='form-group ng-scope']//*[@type='text'])[2]")).sendKeys("shrihan@gmail.com");
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-info']")).click();*/
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='text-center']/a[2]")).click();

		Thread.sleep(2000);

		WebElement checkboxes = driver.findElement(By.xpath("(//*[@class='radio'])[1]/label"));

		Thread.sleep(2000);
		if(!checkboxes.isSelected())
			checkboxes.click();

		driver.findElement(By.xpath("//*[@class='col-xs-6 col-xs-offset-3']/a")).click();

	}
	@Test
	public void Payment()  {

		//WebDriverWait wait = new WebDriverWait(driver,100);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")))
		driver.get("http://www.way2automation.com/angularjs-protractor/multiform/#/form/profile");
		driver.findElement(By.xpath("(//div[@class='form-group ng-scope']//*[@type='text'])[1]")).sendKeys("shrihan");
		driver.findElement(By.xpath("(//div[@class='form-group ng-scope']//*[@type='text'])[2]")).sendKeys("shrihan@gmail.com");
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-info']")).click();

		WebElement checkboxes = driver.findElement(By.xpath("(//*[@class='radio'])[1]/label"));

		if(!checkboxes.isSelected())
			checkboxes.click();
		driver.findElement(By.xpath("//*[@class='col-xs-6 col-xs-offset-3']/a")).click();

		WebElement text = driver.findElement(By.xpath("//div[@id='form-views']//h3"));
		System.out.println(text.getText());
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		Alert alert = driver.switchTo().alert();

		assertTrue(alert.getText().equals("awesome!"));
		alert.accept();

		//Parent or default window
		String parentWinHandle = driver.getWindowHandle();

		//open multiple windows
		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			//condition check parent window and child window
			if(!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);



				driver.close();
			}
		}

		//Back to parent window
		driver.switchTo().window(parentWinHandle);
	}

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

}
