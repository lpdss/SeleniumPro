package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;

	}

	By item_title_link = By.xpath("//a[@id='item_5_title_link']");
	By item_title_name = By.xpath("//div[@class='inventory_details_name large_size']");
	By item_price = By.xpath("//div[@class='inventory_details_price']");
	By back_to_item_button = By.id("back-to-products");

	public void verifyPriceOfProduct() {

		driver.findElement(item_title_link).click();
		String ProductName = driver.findElement(item_title_name).getText();
		String ExpectedName = "Sauce Labs Fleece Jacket";
		Assert.assertEquals(ExpectedName, ProductName);

		String ProductPrice = driver.findElement(item_price).getText();
		String ExpectedPrice = "$49.99";
		Assert.assertEquals(ExpectedPrice, ProductPrice);

		driver.findElement(back_to_item_button).click();

	}

}
