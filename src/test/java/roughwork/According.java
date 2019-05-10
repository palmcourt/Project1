package roughwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class According extends Base {
	@Test
	
	public void section() throws InterruptedException {
		driver.get("http://jqueryui.com/accordion/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@role='tab']"));
		System.out.println(list.size());
		
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).click();
			Thread.sleep(1000);
			System.out.println(driver.findElement(By.xpath("//div/h3[text()='"+list.get(i).getText()+"']/following::p[1]")).getText());
			
			/*List<WebElement> list1 = driver.findElements(By.xpath("//*[@role='tabpanel']/p"));
			System.out.println(list.get(i).getText());
			System.out.println(list1.get(i).getText());*/
					
		}
		
	}
	@Test
	
		public void controlGroup() throws InterruptedException {
		driver.get("http://jqueryui.com/controlgroup/");
		Thread.sleep(3000);
		iFrame(driver.findElement(By.className("demo-frame")));
	click(driver.findElement(By.xpath("//*[@id='ui-id-8-button']")));
	
	click(driver.findElement(By.id("ui-id-13")));
	Thread.sleep(3000);	
		
		
		//selectDropDownByVisibleText("Luxury", driver.findElement(By.id("ui-id-8")));
		Thread.sleep(3000);
		click(driver.findElement(By.xpath("//label[@for='transmission-automatic-v']/span[1]")));
		click(driver.findElement(By.xpath("//*[@for='insurance-v']")));
		//senkeys(driver.findElement(By.id("vertical-spinner")), "2");
		click(driver.findElement(By.xpath("(//span//a[@role='button'])[3]")));
		
		
		Thread.sleep(3000);
		click(driver.findElement(By.id("book")));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
