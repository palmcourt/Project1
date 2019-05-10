package roughfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
	
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//*[text()='Sign in']"));
			
	driver.findElement(By.name("q")).sendKeys("www.gmail.com");
	Thread.sleep(100);
	driver.findElement(By.xpath("//*[@name='btnK']")).click();
	driver.findElement(By.xpath("//*[@class='LC20lb']")).click();


	driver.findElement(By.xpath("(//div[@class='h-c-header__cta']/ul/li/a[contains(text(),'Sign in')])[1]")).click();
	Thread.sleep(1000);	
	WebElement text = driver.findElement(By.xpath("//*[text()='Forgot email?']"));
	
	System.out.println(text.getText());
	//WebElement ele = driver.findElement(By.xpath(".//*[text()='Learn more']"));
//	System.out.println(ele.getText());
	


	
			
	
	
	}
}
