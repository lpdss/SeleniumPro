package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	By username_editbox = By.id("user-name");
	By password_editbox = By.id("password");
	By Login_Btn = By.id("login-button");

	public void login() {
		driver.findElement(username_editbox).sendKeys("performance_glitch_user");
		driver.findElement(password_editbox).sendKeys("secret_sauce");
		driver.findElement(Login_Btn).click();
	}
}
