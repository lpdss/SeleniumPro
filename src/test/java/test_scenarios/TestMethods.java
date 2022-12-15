package test_scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.CartPage;
import objects.CheckoutPage;
import objects.HomePage;
import objects.LoginPage;
import objects.OverviewPage;
import objects.ProductPage;

public class TestMethods {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.saucedemo.com/");
	}

	@Test(priority = 1)
	public void VerifyLogin() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();

	}

	@Test(priority = 2)
	public void VerifyProductPrice() {
		ProductPage ProductPage = new ProductPage(driver);
		ProductPage.verifyPriceOfProduct();
	}

	@Test(priority = 3)
	public void VerifyAbiltyOfProductAdd() {
		HomePage HomePage = new HomePage(driver);
		HomePage.verifyAbilityofAddingProducts();
	}

	@Test(priority = 4)
	public void VerifySelectedItemsInCart() {
		CartPage CartPage = new CartPage(driver);
		CartPage.verifySelectedItemsInCart();
	}

	@Test(priority = 5)
	public void verifyRandomNamesandZipCode() {
		CheckoutPage CheckoutPage = new CheckoutPage(driver);
		CheckoutPage.verifyRandomNamesandZipCode();
	}

	@Test(priority = 6)
	public void verifyOrderCompletion() {
		OverviewPage OverviewPage = new OverviewPage(driver);
		OverviewPage.verifyProcessFinish();
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
