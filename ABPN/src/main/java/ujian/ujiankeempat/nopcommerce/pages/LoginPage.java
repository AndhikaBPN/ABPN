package ujian.ujiankeempat.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import ujian.ujiankeempat.nopcommerce.drivers.connection.DriverSingleton;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement txtDashboard;
	
	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	private WebElement txtNoFound;
	
	
//	Page Object
	public void testLogin(String email, String password) throws Exception {
		this.email.clear();
		this.password.clear();
		Thread.sleep(500);
		this.email.sendKeys(email);
		Thread.sleep(500);
		this.password.sendKeys(password);
		Thread.sleep(500);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public String getTxtDashboard() {
		return txtDashboard.getText();
	}
	
	public String getTxtNoFound() {
		return txtNoFound.getText();
	}
}
