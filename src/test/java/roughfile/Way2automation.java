package roughfile;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Way2automation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement text = driver.findElement(By.xpath("//*[text()='Home']"));
		System.out.println(text.getText());
		WebElement text1 = driver.findElement(By.xpath("//*[text()='Customer Login']"));
		System.out.println(text1.getText());
		WebElement text2 = driver.findElement(By.xpath("//*[text()='Bank Manager Login']"));
		System.out.println(text2.getText());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Home']")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Customer Login']")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Bank Manager Login']")).isDisplayed());
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[text()='Bank Manager Login']")).click();
		Thread.sleep(1000);
		WebElement text3 = driver.findElement(By.xpath("//*[text()='Home']"));
		System.out.println(text3.getText());
		WebElement text4 = driver.findElement(By.xpath(".//div[@class='center']/button[1]"));
		System.out.println(text4.getText());
		WebElement text5 = driver.findElement(By.xpath(".//div[@class='center']/button[2]"));
		System.out.println(text5.getText());
		WebElement text6 = driver.findElement(By.xpath(".//div[@class='center']/button[3]"));
		System.out.println(text6.getText());
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Home']")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(".//div[@class='center']/button[1]")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(".//div[@class='center']/button[2]")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(".//div[@class='center']/button[3]")).isDisplayed());

		driver.findElement(By.xpath(".//div[@class='center']/button[1]")).click();
		Thread.sleep(1000);

		String fname= "shrihan";
		String lname= "reddy";
		int postcode= 500;

		driver.findElement(By.xpath("(//div[@class='form-group']/input)[1]")).sendKeys(fname);
		driver.findElement(By.xpath("(//div[@class='form-group']/input)[2]")).sendKeys(lname);
		driver.findElement(By.xpath("(//div[@class='form-group']/input)[3]")).sendKeys(String.valueOf(postcode));
		driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath(".//div[@class='center']/button[3]")).click();
		Thread.sleep(1000);
		/*
		List<WebElement> fn =  driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> ln =  driver.findElements(By.xpath("//tr/td[2]"));
		List<WebElement> ps =  driver.findElements(By.xpath("//tr/td[3]"));
		//System.out.println(fn.size());*/
		/*	Thread.sleep(1000);
		for (int i = 0; i < fn.size(); i++) {
			if(fn.get(i).getText().equals(fname)) {
				System.out.println("element is in list");
			}else
			{
				System.out.println("element not found");
			}
		}

	//	Thread.sleep(1000);*/

		//driver.findElement(By.xpath(".//*[text()='"+fname+"']/parent::tr//button[1]")).click();
		driver.findElement(By.xpath(".//div[@class='center']/button[2]")).click();
		Thread.sleep(1000);
		Select select = new Select(driver.findElement(By.xpath("//*[@name='userSelect']")));
		select.selectByVisibleText("shrihan reddy");
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id='currency']")));
		select1.selectByVisibleText("Rupee");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		driver.findElement(By.xpath("//*[text()='Home']")).click();
		driver.findElement(By.xpath("//*[text()='Customer Login']")).click();
		Thread.sleep(1000);
		Select select2 = new Select(driver.findElement(By.xpath("//*[@name='userSelect']")));

		select2.selectByVisibleText("shrihan reddy");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='center']/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("1000");
		driver.findElement(By.xpath("//*[text()='Deposit']")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[text()='Deposit Successful']")).isDisplayed());
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='center']/button[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("500");
		driver.findElement(By.xpath("//*[text()='Withdraw']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='center']/button[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[text()='Back']")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped']//tr"));
		System.out.println(rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped']/thead/tr/td"));
		System.out.println(cols.size());

		
		for (int i = 1; i < cols.size(); i++) {
			
			for (int j = 1; j <= rows.size(); j++) {
				
				
			System.out.println(driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println("\n");
		}
	}
}
