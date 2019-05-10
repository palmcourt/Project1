package roughfile;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Gettext1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[text()='Sign in']")).click();
		Thread.sleep(100);
		
	//	boolean ele = driver.findElement(By.xpath(".//*[text()='Create account']")).isDisplayed();
		//Assert.assertEquals(false, driver.findElement(By.xpath(".//*[text()='Create account']")).isDisplayed());
		
		//assert.assertEquals(true, driver.findElement(By.xpath(".//*[text()='Create account']"))
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath(".//*[text()='Forgot email?']"));
		
		System.out.println(ele.getText());
		WebElement ele1 = driver.findElement(By.xpath(".//*[text()='Learn more']"));
		System.out.println(ele1.getText());
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='qZp31e']"));
		System.out.println(ele2.getText());
		WebElement ele3 = driver.findElement(By.xpath("//h1/*[contains(text(),'Sign in')]"));
		System.out.println(ele3.getText());
		WebElement ele4 = driver.findElement(By.xpath("//*[@type='email']"));
		System.out.println(ele4.getText());
		//WebElement ele5 = driver.findElement(By.xpath(".//*[text()='Learn more']"));
		//System.out.println(ele5.getText());
		
	}

}
