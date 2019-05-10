package roughfile;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static  void captureScreenshot(WebDriver driver) throws Throwable  {

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\WorkSpace\\git\\Project1\\screenshots\\test"+".png"));

	}

	public static void main(String[] args) throws Throwable {

		//Driver initialisation
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");

		//Capturing the screenshot
		captureScreenshot(driver);

		//Close browser
		if(driver!=null)
			driver.quit();
	}

}
