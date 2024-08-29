package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class NegaLoginTest extends BaseTest {

	@DataProvider(name ="invalidLoginData")
	public Object[][] invalidLoginData(){
		return new Object[][] {
			{"Yuvraj","Chava"},
			{"Deveo","HBb"},
			{"JHBU","HBI"},
			{"knn","njkn"}
		};
		
	}
	
    @Test(dataProvider = "invalidLoginData")
    public void loginWithInvalidCredentials(String username, String password) {
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.enterUsername(username);
    	loginPage.enterPassword(password);
    	loginPage.clickLogin();
    	
    	String actualErrorMessage = loginPage.getAlertErrorMessage();
    	String expectedErrorMessage = "InCorrect BankerName/Password";
    	Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Error message did not match for invalid credentials");
    }
    
}
