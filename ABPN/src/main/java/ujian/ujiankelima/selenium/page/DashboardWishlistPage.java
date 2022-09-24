package ujian.ujiankelima.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ujian.ujiankeempat.nopcommerce.util.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import ujian.ujiankeempat.nopcommerce.drivers.connection.DriverSingleton;

public class DashboardWishlistPage {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public DashboardWishlistPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(linkText = "Dismiss")
	private WebElement dismiss;
	
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/a")
	private WebElement btnWishlist;
	
	@FindBy(id = "yith-wcwl-message")
	private WebElement txtAdded;
	
	
//	Page Object
	public void testWishlist() {
		dismiss.click();
		btnWishlist.click();
		Constants.delay(2, strDelay);
	}
	
	public String getTxtAdded() {
		return txtAdded.getText();
	}
}
