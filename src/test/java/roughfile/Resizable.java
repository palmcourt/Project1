package roughfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement resizable = driver.findElement(By.xpath("//*[@id='resizable']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 200, 200).perform();
		
		

	}

}
