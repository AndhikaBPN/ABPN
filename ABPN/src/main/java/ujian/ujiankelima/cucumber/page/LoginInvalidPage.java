package ujian.ujiankelima.cucumber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ujian.ujiankeempat.nopcommerce.util.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import latihan.cucumber.drivers.connection.DriverSingleton;

public class LoginInvalidPage {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public LoginInvalidPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Facotry
	@FindBy(linkText = "Dismiss")
	private WebElement dismiss;
	
	@FindBy(linkText = "My Account")
	private WebElement myAcc;
	
	@FindBy(id = "username")
	private WebElement userame;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "rememberme")
	private WebElement checkremember;
	
	@FindBy(name = "login")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//body[@id='error-page']/div/strong")
	private WebElement txtErr;
	
	@FindBy(xpath = "//p[contains(text(),'Hello')]")
	private WebElement txtHello;
	
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement txtMyAcc;
	
	@FindBy(xpath = "//h1[contains(text(),'Your access to this site has been temporarily limi')]")
	private WebElement txtLimit;
	
//	Page Object
	public void testLogin(String username, String password) {
		Constants.delay(1, strDelay);
		this.userame.sendKeys(username);
		Constants.delay(1, strDelay);
		this.password.sendKeys(password);
		Constants.delay(1, strDelay);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public String getTxtMyAcc() {
		return txtMyAcc.getText();
	}
	
	public String getTxtHello() {
		return txtHello.getText();
	}
	
	public String getTxtErr() {
		return txtErr.getText();
	}
	
	public void dismiss() {
		dismiss.click();
		Constants.delay(2, strDelay);
	}
	
	public String getTxtLimit() {
		return txtLimit.getText();
	}
}
