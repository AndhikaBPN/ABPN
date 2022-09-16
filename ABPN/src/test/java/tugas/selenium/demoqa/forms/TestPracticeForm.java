package tugas.selenium.demoqa.forms;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.By;

import tugas.selenium.demoqa.drivers.connection.DriverSingleton;
import tugas.selenium.demoqa.pages.elements.TextBoxPage;
import tugas.selenium.demoqa.pages.forms.PracticeFormPage;
import tugas.selenium.demoqa.util.Constants;

public class TestPracticeForm {
	public static WebDriver driver;
	private PracticeFormPage practiceFormPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLDEMOQA);
		practiceFormPage = new PracticeFormPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testPracticeForm() throws Exception {
		String file = "C:\\Users\\NEXSOFT\\Documents\\Flowchart\\Nested-for.png";
		practiceFormPage.practiceForm("Dino", "Tiger", "dino@gmail.com", "0869356969", "25 Jun 2021", "eng", file, "Jl. Pelangi Surabaya");
		Thread.sleep(2000);
		assertTrue(practiceFormPage.getClose().contains("Close"));
	}
}
