package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="userName")
	private WebElement unTB;
	
	@FindBy(id="passWord")
	private WebElement pwdTB;	
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement lgnBTN;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw){
		pwdTB.sendKeys(pw);
	}
	
	public void clickLogin() {
		lgnBTN.click();
	}
}
