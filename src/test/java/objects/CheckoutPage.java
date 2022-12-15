package objects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;

	}

	By firstname = By.id("first-name");
	By Lastname = By.id("last-name");
	By zipcode = By.id("postal-code");
	By continueBtn = By.id("continue");

	public void verifyRandomNamesandZipCode() {

		String f = RandomStringUtils.randomAlphabetic(7);
		driver.findElement(firstname).sendKeys(f);
		String n = RandomStringUtils.randomAlphabetic(8);
		driver.findElement(Lastname).sendKeys(n);
		String z = RandomStringUtils.randomNumeric(5);
		driver.findElement(zipcode).sendKeys(z);

		driver.findElement(continueBtn).click();
	}
}
