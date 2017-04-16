package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class WebDriverGeneric 
{
	public WebDriver driver = null;
			
	public void enterTextById (String id , String value)
	{
		driver.findElement(By.id(id)).sendKeys(value);
		Reporter.log("Entered text by id:" +value+ "Entered locator id:" +id);
	}
	public void clickId(String id) 
	{
		driver.findElement(By.id(id)).click();
		
	}
}
