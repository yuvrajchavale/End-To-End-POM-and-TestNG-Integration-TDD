package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	
	//Positive TestCase
	@Test
	public void loginWithValidData() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("Admin");
		loginPage.clickLogin();
		
		//add  assertion for sucessfuil login
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://primusbank.qedgetech.com/adminflow.aspx");
	}
	
	
}


