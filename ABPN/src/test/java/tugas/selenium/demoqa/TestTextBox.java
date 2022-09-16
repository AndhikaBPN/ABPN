package tugas.selenium.demoqa;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.By;

import tugas.selenium.demoqa.drivers.connection.DriverSingleton;
import tugas.selenium.demoqa.pages.elements.TextBoxPage;
import tugas.selenium.demoqa.util.Constants;


public class TestTextBox {
	public static WebDriver driver;
	private TextBoxPage textBoxPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
//		driver.get(Constants.URL);
		textBoxPage = new TextBoxPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testTextBox() throws Exception{
		textBoxPage.textBox("Donky", "donky@gmail.com", "Jl. Pelangi", "Jl. Lele");
		Thread.sleep(2000);
		assertTrue(textBoxPage.getUsername().contains("Donky"));
	}
}
