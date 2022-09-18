package ujian.ujiankeempat.nopcommerce;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.apache.hc.core5.annotation.Contract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.By;

import ujian.ujiankeempat.nopcommerce.drivers.connection.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.pages.LoginPage;
import ujian.ujiankeempat.nopcommerce.pages.CustomersPage;
import ujian.ujiankeempat.nopcommerce.pages.ProductsPage;
import ujian.ujiankeempat.nopcommerce.pages.PromotionsPage;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class TestCommerce {
	public static WebDriver driver;
	private LoginPage loginPage;
	private CustomersPage customerPage;
	private ProductsPage productsPage;
	private PromotionsPage promotionsPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		loginPage = new LoginPage();
		customerPage = new CustomersPage();
		productsPage = new ProductsPage();
		promotionsPage =  new PromotionsPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
//	@Test(priority = 0)
//	public void testValidLogin() throws Exception {
//		loginPage.testLogin("admin@yourstore.com", "admin");
//		assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
//	}
//	
//	@Test(priority = 1)
//	public void testValidLoginUppercase() throws Exception {
//		loginPage.testLogin("ADMIN@yourstore.com", "admin");
//		assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
//	}
//	
//	@Test(priority = 2)
//	public void testInvalidLogin() throws Exception {
//		loginPage.testLogin("behemoth@yourstore.com", "admin");
//		assertTrue(loginPage.getTxtNoFound().contains("No customer account found"));
//	}
	
//	@Test(priority = 3)
//	public void testCustomer() throws Exception {
//		loginPage.testLogin("admin@yourstore.com", "admin");
//		Thread.sleep(1000);
//		customerPage.testCustPage("victoria_victoria@nopCommerce.com", "Victoria", "Terces");
//		assertTrue(customerPage.getTxtName().contains("victoria"));
//	}
	
//	@Test(priority = 4)
//	public void testProduct() throws Exception {
//		loginPage.testLogin("admin@yourstore.com", "admin");
//		Thread.sleep(1000);
//		productsPage.testProdPage("Computers >> Software", "Unpublished only", "Simple");
//		assertTrue(productsPage.getTxtEmpty().contains("No data"));
//	}
	
	@Test(priority = 5)
	public void testPromotions() throws Exception {
		loginPage.testLogin("admin@yourstore.com", "admin");
		Thread.sleep(1000);
		String fName = "Dexe";
		String lName = "Sutino";
		String email = "dex@gmail.com";
		String company = "Desterity Labs";
		String country = "Antarctica";
		String county = "Kawachi";
		String city = "Izumo";
		String address1 = "Jl. Katak Lompat no. 18";
		String address2 = "";
		String postalCode = "26788";
		String phoneNumber = "6289653264451";
		String faxNumber = "021562";
		String comment = "Hello";
		String urlName = "";
		promotionsPage.testPromPage(fName, lName, email, company, country, county, city, address1, address2, postalCode, phoneNumber, faxNumber, comment, urlName);
		assertTrue(promotionsPage.getTxtSuccess().contains("added successfully"));
		
	}
	
	
}
