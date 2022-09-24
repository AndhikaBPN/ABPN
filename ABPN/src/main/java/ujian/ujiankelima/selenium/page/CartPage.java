package ujian.ujiankelima.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ujian.ujiankeempat.nopcommerce.util.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import ujian.ujiankeempat.nopcommerce.drivers.connection.DriverSingleton;

public class CartPage {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public CartPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(linkText = "Dismiss")
	private WebElement dismiss;
	
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[4]/div/div/div/div/div/div[2]/div[2]/div/div/h3/a")
	private WebElement productCard;
	
	@FindBy(id = "color")
	private WebElement dropColor;
	
	@FindBy(id = "size")
	private WebElement dropSize;
	
	@FindBy(xpath = "//i[@class='icon_plus']")
	private WebElement iconPlus;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAdd;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement txtSuccess;
	
//	Page Object
	public void testAddCart() {
		dismiss.click();
		productCard.click();
		Constants.delay(2, strDelay);
		dropColor.click();
		Select color = new Select(dropColor);
		color.selectByVisibleText("White");
		Constants.delay(1, strDelay);
		dropSize.click();
		Select size = new Select(dropSize);
		size.selectByVisibleText("L");
		Constants.delay(1, strDelay);
		iconPlus.click();
		btnAdd.click();
	}
	
	public String getTxtSuccess() {
		return txtSuccess.getText();
	}
}
