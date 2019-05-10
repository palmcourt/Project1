package roughfile;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import roughwork.Base;

public class HandleMultipleWindow extends Base {
	@Test
	public void Windows() throws Throwable {
		driver.get("http://www.way2automation.com/protractor-angularjs-practice-website.html");
		driver.findElement(By.xpath("//img[contains(@src,'calc')]")).click();

		// Parent or default window
		String parentWinHandle = driver.getWindowHandle();

		// open multiple windows
		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			// condition check parent window and child window
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//form/input[@type='text'][1]")).sendKeys("5");
				driver.findElement(By.xpath("//form/input[@type='text'][2]")).sendKeys("8");
				Select select = new Select(driver.findElement(By.xpath("//form/select")));
				select.selectByVisibleText("+");
				driver.findElement(By.id("gobutton")).click();
				Thread.sleep(2000);
				WebElement list = driver.findElement(By.xpath("//h2"));
				System.out.println(list.getText());
				List<WebElement> rows = driver.findElements(By.xpath("//table/thead/tr"));
				System.out.println(rows.size());
				List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
				System.out.println(cols.size());
				for (int i = 1; i <= rows.size(); i++) {
					for (int j = 1; j < cols.size(); j++) {
						System.out.println(driver
								.findElement(By.xpath("//table[@class='table']//tr[" + i + "][" + j + "]")).getText());
						// System.out.println(driver.findElement(By.xpath("//table[@class='table']//tr["+j+"]")).getText());

					}

				}

				driver.close();
			}
		}

		// Back to parent window
		driver.switchTo().window(parentWinHandle);
	}

	// Ctrl+shift+i to know the value when we debug
	//ctrl+shfit+o  to import and unimport 
	//ctrl+shit+r select particular class from  project
	// ctrl+a and ctrl+i or ctrl+shift+f align the class in order
	// Note:Ctrl+Shift+/ and Ctrl+Shift+\ comment and uncomment the multiple lines
	// of code
	// Split example
	/*
	 * String name="1:2:3:4:5"; System.out.println(name.split(":", 4)[1]);
	 */
}
