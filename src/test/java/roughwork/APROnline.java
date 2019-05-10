package roughwork;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class APROnline extends Base{
	
	@Test
	public void multiWindows() {
		driver.get("http://www.praccreditation.org/resources/aprdemo/index.htm");
		driver.findElement(By.xpath("//*[text()='CLICK HERE TO BEGIN']")).click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindows = driver.getWindowHandles();
					
		for (int i = 0; i < childwindows.size(); i++) {
			if(!childwindows.equals(parentwindow)) {
				driver.get("http://www.praccreditation.org/resources/aprdemo/htmldemo/confirm.htm");
				
			}
			
		}
	
		driver.close();
		driver.switchTo().window(parentwindow);
		
		
		
	}

}
