package roughwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InputForm extends Base{

	@Test
	public void demoForm() {
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("user-message")).sendKeys("Palmcourt");
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		WebElement msg = driver.findElement(By.id("display"));
		System.out.println(msg.getText());

		driver.findElement(By.id("sum1")).sendKeys("5");
		driver.findElement(By.id("sum2")).sendKeys("3");
		driver.findElement(By.xpath("//*[text()='Get Total']")).click();
		WebElement msg2 = driver.findElement(By.id("displayvalue"));
		System.out.println(msg2.getText());

	}
	@Test
	public void checkBoxes() {
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
		checkbox.click();
		WebElement msg = driver.findElement(By.id("txtAge"));
		System.out.println(msg.getText());

	}
	@Test
	public void radioButton() {
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		WebElement radiobutton = driver.findElement(By.xpath("//*[@name='optradio'][@value='Female']"));
		radiobutton.click();
		driver.findElement(By.id("buttoncheck")).click();
		WebElement msg = driver.findElement(By.xpath("//*[@class='radiobutton']"));
		System.out.println(msg.getText());
		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@name='gender'][@value='Female']"));
		radiobutton1.click(); 
		WebElement radiobutton2 = driver.findElement(By.xpath("//*[@name='ageGroup'][@value='15 - 50']"));
		radiobutton2.click(); 
		driver.findElement(By.xpath("//*[text()='Get values']")).click();
		WebElement msg1 = driver.findElement(By.xpath("//*[@class='groupradiobutton']"));
		System.out.println(msg1.getText());

	}
	@Test
	public void dropDown() {
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select select = new Select(driver.findElement(By.id("select-demo")));
		select.selectByVisibleText("Thursday");
		WebElement msg = driver.findElement(By.xpath("//*[@class='selected-value']"));
		System.out.println(msg.getText());
		Select select1 = new Select(driver.findElement(By.id("multi-select")));
		select1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//*[text()='First Selected']")).click();
		//driver.findElement(By.xpath("//*[text()='Get All Selected']")).click();
		WebElement msg1 = driver.findElement(By.xpath("//*[@class='getall-selected']"));
		System.out.println(msg1.getText());

	}

	@Test
	public void inputFormSubmit() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("yalamanda");
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("reddy");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("yalamanda@gmail.com");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("kl");
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.xpath("//*[@name='state']")));
		select.selectByVisibleText("New York");
		driver.findElement(By.xpath("//*[@name='zip']")).sendKeys("507003");
		driver.findElement(By.xpath("//*[@name='website']")).sendKeys("www.automation.com");
		WebElement checkbox = driver.findElement(By.xpath("//*[@name='hosting']"));
		checkbox.click();
		driver.findElement(By.xpath("//*[@name='comment']")).sendKeys("i am learning automation");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}
	@Test
	public void jquerydropdown() {
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

	}
	@Test
	public void boosttrapDatapickers() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//*[@placeholder='dd/mm/yyyy']"));
		date.sendKeys("25/03/2019");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

	}
	@Test
	public void draganddrop() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.findElement(By.xpath("//*[text()='Draggable 1']")).click();
		WebElement drag = driver.findElement(By.xpath("//*[text()='Draggable 1']"));

		WebElement drop = driver.findElement(By.xpath("//*[@id='mydropzone']"));
		//Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
	}
	@Test
	public void list() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		/*driver.findElement(By.xpath("//ul/li[text()='bootstrap-duallist ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-sm move-right']")).click();
		Thread.sleep(3000);*/
		
		driver.findElement(By.xpath("//select/option[text()='Luiza']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Add']")).click();
	Thread.sleep(1000);
		//	driver.findElement(By.className("form-control pickListSelect pickListResult"));

	}
	@Test
	public void Table() {
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		
		int page=1;

		//while(driver.findElement(By.xpath("//*[text()='»']")).isEnabled())

		while (driver.findElements(By.xpath("//a[text()='"+page+"']")).size()>0)
		{
			driver.findElement(By.xpath("//a[text()='"+page+"']")).click();

			List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']//th"));
			System.out.println(rows.size());
			List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr[contains(@style,'display: table-row;')]"));
			System.out.println(cols.size());


			for(int i=1; i<=cols.size(); i++) {
				for(int j=1; j<=rows.size(); j++) {
					System.out.println(driver.findElement(By.xpath("//table[@class='table table-hover']//tr[contains(@style,'display: table-row;')]["+i+"]/td["+j+"]")).getText());
				}
			}
			//driver.findElement(By.xpath("(//*[text()='2'])[2]")).click();
			page++;
		}




	}










}
