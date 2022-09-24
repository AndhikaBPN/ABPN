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

public class DashboardSearchPage {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public DashboardSearchPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(linkText = "Dismiss")
	private WebElement dismiss;
	
	@FindBy(linkText = "Search")
	private WebElement search;
	
	@FindBy(name = "s")
	private WebElement inputSearch;
	
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div/div/p")
	private WebElement txtShow;
	
//	Page Object
	public void testSearch(String inputSearch) {
		dismiss.click();
		search.click();
		Constants.delay(1, strDelay);
		this.inputSearch.sendKeys(inputSearch);
		Constants.delay(1, strDelay);
		this.inputSearch.sendKeys(Keys.ENTER);
		Constants.delay(1, strDelay);
	}
	
	public String getTxtShow() {
		return txtShow.getText();
	}
}
