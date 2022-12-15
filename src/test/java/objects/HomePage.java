package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	By add_to_cart1 = By.id("add-to-cart-sauce-labs-backpack");
	By add_to_cart2 = By.id("add-to-cart-sauce-labs-bike-light");
	By cart_product_count = By.xpath("//span[@class='shopping_cart_badge']");

	public void verifyAbilityofAddingProducts() {

		driver.findElement(add_to_cart1).click();
		driver.findElement(add_to_cart2).click();

		String CartproductCount = driver.findElement(cart_product_count).getText();
		String ExpectedproductCount = "2";
		Assert.assertEquals(ExpectedproductCount, CartproductCount);
		driver.findElement(cart_product_count).click();
	}
}
