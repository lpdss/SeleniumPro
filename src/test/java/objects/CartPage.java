package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;

	}

	By product1 = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	By product2 = By.xpath("//*[@id=\"item_0_title_link\"]/div");
	By CheckoutBtn = By.id("checkout");

	public void verifySelectedItemsInCart() {

		String Product1name = driver.findElement(product1).getText();
		String ExpectedProduct1name = "Sauce Labs Backpack";
		Assert.assertEquals(ExpectedProduct1name, Product1name);

		String Product2name = driver.findElement(product2).getText();
		String ExpectedProduct2name = "Sauce Labs Bike Light";
		Assert.assertEquals(ExpectedProduct2name, Product2name);

		driver.findElement(CheckoutBtn).click();
	}

}
