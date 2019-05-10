package roughfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		//WebElement block = driver.findElement(By.tagName("div"));
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='display'][2]/input"));

		System.out.println(checkboxes.size());
		for (int i = 0; i < checkboxes.size(); i++) {
			if(!checkboxes.get(i).isSelected()) {
			checkboxes.get(i).click();
			}
			
		}
		
		driver.quit();

	}

}
