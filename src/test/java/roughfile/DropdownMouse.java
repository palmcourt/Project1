package roughfile;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class DropdownMouse {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/checkboxes/");
		driver.manage().window().maximize();
		
		Assert.assertEquals(false, driver.findElement(By.xpath("//*[text()=' Garage Improvement ']")).isDisplayed());
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("way2automation");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		//Thread.sleep(millis);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[8]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Practice site 1")).click();
		Thread.sleep(100);
		Select select = new Select(driver.findElement(By.name("country")));
		/*select.selectByVisibleText("Australia");*/
		List<WebElement> list =  driver.findElements(By.tagName("option"));
		
		System.out.println(list.size() );
		for(int i=0; i<=list.size(); i++ ) {
			System.out.println(list.get(i).getText());
			
		}
		
				
				
				
				
	
		
		
		
		
		
		
		
		
	}

}
