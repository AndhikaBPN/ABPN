package tugas.selenium.amazon;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.By;

import tugas.selenium.demoqa.drivers.connection.DriverSingleton;
import tugas.selenium.demoqa.pages.amazon.AmazonPage;
//import tugas.selenium.demoqa.pages.elements.TextBoxPage;
import tugas.selenium.demoqa.util.Constants;

public class TestAmazon {
	public static WebDriver driver;
	private AmazonPage amazonPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLAMAZON);
		amazonPage = new AmazonPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testAmazon() throws Exception {
		amazonPage.amazon("Dino", "Tiger", "09/16/2022", "Jl. Suka-Suka no. 19", "dino@gmail.com", "dino123", "Computnet", "This is a test planS");
		assertTrue(amazonPage.getTxtSuccess().contains("Success"));
	}
}
