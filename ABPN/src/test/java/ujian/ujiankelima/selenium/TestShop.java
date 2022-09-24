package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.apache.hc.core5.annotation.Contract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import ujian.ujiankeempat.nopcommerce.util.Constants;

import org.openqa.selenium.By;

import ujian.ujiankeempat.nopcommerce.drivers.connection.DriverSingleton;
import ujian.ujiankelima.selenium.page.CartPage;
import ujian.ujiankelima.selenium.page.DashboardSearchPage;
import ujian.ujiankelima.selenium.page.DashboardWishlistPage;
import ujian.ujiankelima.selenium.page.LoginPage;
import ujian.ujiankelima.selenium.page.DashboardZoomPage;

public class TestShop {
	public static WebDriver driver;
	private LoginPage loginPage;
	private DashboardSearchPage dSearchPage;
	private DashboardZoomPage dZoomPage;
	private DashboardWishlistPage dWishlistPage;
	private CartPage cartPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLDEMO);
		loginPage = new LoginPage();
		dSearchPage = new DashboardSearchPage();
		dZoomPage = new DashboardZoomPage();
		dWishlistPage = new DashboardWishlistPage();
		cartPage = new CartPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception{
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority = 0)
	public void testLogin() {
		loginPage.dismiss();
		loginPage.testLogin("jotaro", "jotarodio123");
//		assertTrue(loginPage.getTxtMyAcc().contains("MY ACCOUNT"));
		assertTrue(loginPage.getTxtErr().contains("ERROR"));
//		assertTrue(loginPage.getTxtLimit().contains("access"));
	}
	
	@Test(priority = 1)
	public void testSearch() {
		dSearchPage.testSearch("dress");
		assertTrue(dSearchPage.getTxtShow().contains("Showing"));
	}
	
	@Test(priority = 2)
	public void testZoom() {
		dZoomPage.testZoomProd();
		assertTrue(dZoomPage.getTxtTitle().contains("BLACK"));
	}
	
	@Test(priority = 3)
	public void testWishlist() {
		dWishlistPage.testWishlist();
		assertTrue(dWishlistPage.getTxtAdded().contains("Product"));
	}
	
	@Test(priority = 4)
	public void testAddCart() {
		cartPage.testAddCart();
		assertTrue(cartPage.getTxtSuccess().contains("have been added"));
	}
}
