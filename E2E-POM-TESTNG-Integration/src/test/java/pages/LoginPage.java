package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage {

	private WebDriver driver;
	
	//Locaters Storing
	public By usernameField = By.id("txtuId");
	public By passwordField = By.id("txtPword");
	public By loginButton = By.id("login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public String getAlertErrorMessage() {
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		alert.accept();
		return alertMessage;

	}
	
}
