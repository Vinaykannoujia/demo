package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement btnLogin;
	
	
	
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
}
