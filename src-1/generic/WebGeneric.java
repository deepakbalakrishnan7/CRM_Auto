package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebGeneric {
	public static void veifyPageIsDisplayed(WebDriver driver, long time, String partialURL) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		try{
			wait.until(ExpectedConditions.urlContains(partialURL));
			Reporter.log("Req Page Is Displayed", true);
		}
		catch (Exception e) {
			Reporter.log("Req Page Is NOT Displayed",true);
			Assert.fail();
		}
		
	}

}
