package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testbase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;

	@BeforeSuite
	public void setUp() throws Exception{
		if(driver==null){
			//FileInputStream fis;
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(config.getProperty("browser").equals("firefox")){

				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			}else if(config.getProperty("browser").equals("chrome")){

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
				driver= new ChromeDriver();

			}else if(config.getProperty("browser").equals("ie")){

				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\IEDriverServerWin32.exe");
				driver = new InternetExplorerDriver();

			}

			driver.get(config.getProperty("google"));
			Thread.sleep(3000);
			driver.manage().window().maximize();
		}
	}

	@AfterSuite
	public void tearDown(){
		if(driver!=null){
			driver.quit();
		}
	}

	public void failed(ITestResult result) {

		/*StringBuilder text = new StringBuilder();
		text.append("TEXT-----"+((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)+"------TEXT");*/
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+result.getName()+".png"));
			//FileUtils.writeStringToFile(new File(System.getProperty("user.dir")+"\\screenshots\\"+result.getName()+".png"), text.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
