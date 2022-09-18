package ujian.ujiankeempat.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import ujian.ujiankeempat.nopcommerce.drivers.connection.DriverSingleton;

public class CustomersPage {
	private WebDriver driver;
	
	public CustomersPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(xpath = "//i[@class='nav-icon far fa-user']")
	private WebElement btnCust;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private WebElement btnCustSubMenu;
	
	@FindBy(xpath = "//input[@id='SearchEmail']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='SearchFirstName']")
	private WebElement fName;
	
	@FindBy(xpath = "//input[@id='SearchLastName']")
	private WebElement lName;
	
	@FindBy(xpath = "//button[@id='search-customers']")
	private WebElement btnSearch;
	
	@FindBy(xpath ="//td[normalize-space()='victoria_victoria@nopCommerce.com']")
	private WebElement txtName;
	
//	Page Object
	public void testCustPage(String email, String fName, String lName) throws InterruptedException, AWTException {
		Robot rb = new Robot();
		for(int i = 0; i<2; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		btnCust.click();
		Thread.sleep(500);
		btnCustSubMenu.click();
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(500);
		this.fName.sendKeys(fName);
		Thread.sleep(500);
		this.lName.sendKeys(lName);
		Thread.sleep(500);
		btnSearch.click();
	}
	
	public String getTxtName() {
		return txtName.getText();
	}
	
}
