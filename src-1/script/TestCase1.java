package script;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.HomePage;
import page.LoginPage;

public class TestCase1 extends BaseTest{
	@Test(priority=1)
	public void testA() {
		String un = Utility.getXLData(INPUT_PATH, "TestCase1", 1, 0);
		String pw = Utility.getXLData(INPUT_PATH, "TestCase1", 1, 1);
		String hmeURL = Utility.getXLData(INPUT_PATH, "TestCase1", 1, 2);
		String lgnURL = Utility.getXLData(INPUT_PATH, "TestCase1", 1, 3);
		
		//Enter UN, PWD & click Login button
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pw);
		lp.clickLogin();
		
		//Verify Home page is Displayed
		WebGeneric.veifyPageIsDisplayed(driver, lngETO, hmeURL);
		
		//click never in pop-up window
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 
		//Verify Home page is Displayed
		WebGeneric.veifyPageIsDisplayed(driver, lngETO, lgnURL);
		
		//Click logout link
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
	}
	

}
