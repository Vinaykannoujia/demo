package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC_LoginPage extends BaseClass {
	@Test
	public void VerifyLogin() {
		
	LoginPage lp = new LoginPage(driver);
	lp.setEmail(propt.getProperty("email"));
	lp.setPassword(propt.getProperty("password"));
	lp.clickLogin();
	
	ProductPage pp = new ProductPage(driver);
	String conftext=pp.getConfermationMsg();
	Assert.assertEquals(conftext,"Products");
	}
}
