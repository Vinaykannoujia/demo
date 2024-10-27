package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@class=\"MuiGrid-root css-199de6g\"]//span")
	WebElement confText;
	
	
	
	
 public String getConfermationMsg(){
	 try {
		 return(confText.getText());		 
	 }catch(Exception e) {
		 return(e.getMessage());
	 }
 }
 }