package latihan.pagefactoryobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import latihan.pagefactoryobject.drivers.DriverSingleton;
import latihan.pagefactoryobject.pages.LoginPage;
import latihan.pagefactoryobject.util.Constants;

public class TestLogin {
	public static WebDriver driver;
	private LoginPage loginPage;
	
//	@BeforeClass
//	public void setUp() {
//		
//	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	@Test
	public void testValidLoginUppercaseUsername() {
		loginPage.login("ADMIN", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
//	Negative Case
	@Test
	public void testInvalidLoginEmptyField() {
		loginPage.login("", "");
		assertEquals(loginPage.getTextRequired(), "Required");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
//	@Test
	public void testInvalidLogin() {
		loginPage.login("adminwwq", "adminqwe1");
		assertEquals(loginPage.getTextCredential(), "Invalid credentials");
	}
	
//	@Test
	public void testInvalidLoginEmptyUsername() {
		loginPage.login("", "admin123");
		assertEquals(loginPage.getTextRequired(), "Required");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
//	@Test
	public void testInvalidLoginEmptyPassword() {
		loginPage.login("Admin", "");
		assertEquals(loginPage.getTextRequired(), "Required");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
//	@Test
	public void testInvalidLoginInvalidUsername() {
		loginPage.login("adminnih", "admin123");
		assertEquals(loginPage.getTextCredential(), "Invalid credentials");
//		assertTrue(loginPage.getTextCredential().contains("Invalid credentials"));
	}
	
//	@Test
	public void testInvalidLoginInvalidPassword() {
		loginPage.login("Admin", "adminmin12");
		assertEquals(loginPage.getTextCredential(), "Invalid credentials");
//		assertTrue(loginPage.getTextCredential().contains("Invalid credentials"));
	}
}
