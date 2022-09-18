package ujian.ujiankeempat.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import ujian.ujiankeempat.nopcommerce.drivers.connection.DriverSingleton;

public class PromotionsPage {
	private WebDriver driver;
	
	public PromotionsPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(xpath = "//i[@class='nav-icon fas fa-tags']")
	private WebElement btnProm;
	
	@FindBy(xpath = "//p[normalize-space()='Affiliates']")
	private WebElement btnAffiliates;
	
	@FindBy(xpath = "//i[@class='fas fa-plus-square']")
	private WebElement addNew;
	
	@FindBy(xpath = "//input[@id='Active']")
	private WebElement checkActive;
	
	@FindBy(xpath = "//input[@id='Address_FirstName']")
	private WebElement fName;
	
	@FindBy(xpath = "//input[@id='Address_LastName']")
	private WebElement lName;
	
	@FindBy(xpath = "//input[@id='Address_Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Address_Company']")
	private WebElement company;
	
	@FindBy(xpath = "//select[@id='Address_CountryId']")
	private WebElement selectCountry;
	
	@FindBy(xpath = "//select[@id='Address_StateProvinceId']")
	private WebElement selectState;
	
	@FindBy(xpath = "//input[@id='Address_County']")
	private WebElement county;
	
	@FindBy(xpath = "//input[@id='Address_City']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='Address_Address1']")
	private WebElement address1;
	
	@FindBy(xpath = "//input[@id='Address_Address2']")
	private WebElement address2;
	
	@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
	private WebElement postalCode;
	
	@FindBy(xpath = "//input[@id='Address_PhoneNumber']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//input[@id='Address_FaxNumber']")
	private WebElement faxNumber;
	
	@FindBy(xpath = "//textarea[@id='AdminComment']")
	private WebElement comment;
	
	@FindBy(xpath = "//input[@id='FriendlyUrlName']")
	private WebElement urlName;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement btnSave;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
	private WebElement txtSuccess;
	
//	Page Object
	public void testPromPage(String fName, String lName, String email, String company, String country, 
							 String county, String city, String address1, String address2, 
							 String postalCode, String phoneNumber, String faxNumber, String comment, String urlName) throws Exception {
		btnProm.click();
		Thread.sleep(500);
		btnAffiliates.click();
		Thread.sleep(1000);
		addNew.click();
		Thread.sleep(1000);
		checkActive.click();
		this.fName.sendKeys(fName);
		this.lName.sendKeys(lName);
		this.email.sendKeys(email);
		this.company.sendKeys(company);
		selectCountry.click();
		Thread.sleep(500);
		Select country1 = new Select(driver.findElement(By.id("Address_CountryId")));
		country1.selectByVisibleText(country);
		selectState.click();
		Thread.sleep(500);
		this.county.sendKeys(county);
		this.city.sendKeys(city);
		this.address1.sendKeys(address1);
		this.address2.sendKeys(address2);
		this.postalCode.sendKeys(postalCode);
		this.phoneNumber.sendKeys(phoneNumber);
		this.faxNumber.sendKeys(faxNumber);
		this.comment.sendKeys(comment);
		this.urlName.sendKeys(urlName);
		Thread.sleep(1000);
		btnSave.click();
	}
	
	public String getTxtSuccess() {
		return txtSuccess.getText();
	}
}
