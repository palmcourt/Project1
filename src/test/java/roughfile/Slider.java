package roughfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		WebElement mainslider = driver.findElement(By.xpath("//*[@id='slider']"));
		int width = mainslider.getSize().width/2; 
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span[@tabindex='0']"));
		new Actions(driver).dragAndDropBy(slider, width, 0).perform();
		
		
	}

}
