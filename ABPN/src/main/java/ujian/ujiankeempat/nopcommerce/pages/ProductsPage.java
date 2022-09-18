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

public class ProductsPage {
private WebDriver driver;
	
	public ProductsPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
	private WebElement btnCatalog;
	
	@FindBy(xpath = "//p[normalize-space()='Products']")
	private WebElement btnProducts;
	
	@FindBy(xpath = "//select[@id='SearchCategoryId']")
	private WebElement selectCategory;
	
	@FindBy(xpath = "//select[@id='SearchProductTypeId']")
	private WebElement selectProdType;
	
	@FindBy(xpath = "//select[@id='SearchPublishedId']")
	private WebElement selectPublish;
	
	@FindBy(xpath = "//button[@id='search-products']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//td[@class='dataTables_empty']")
	private WebElement txtEmpty;
	
//	Page Object
	public void testProdPage(String categoryProd, String published, String typeProd) throws InterruptedException, AWTException {
		Robot rb = new Robot();
		for(int i = 0; i<2; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		btnCatalog.click();
		Thread.sleep(500);
		btnProducts.click();
		Thread.sleep(1000);
		selectCategory.click();
		Thread.sleep(500);
		Select category = new Select(driver.findElement(By.xpath("//select[@id='SearchCategoryId']")));
		category.selectByVisibleText(categoryProd);
		Thread.sleep(500);
		selectPublish.click();
		Thread.sleep(500);
		Select publish = new Select(driver.findElement(By.xpath("//select[@id='SearchPublishedId']")));
		publish.selectByVisibleText(published);
		Thread.sleep(500);
		selectProdType.click();
		Thread.sleep(500);
		Select type = new Select(driver.findElement(By.xpath("//select[@id='SearchProductTypeId']")));
		type.selectByVisibleText(typeProd);
		Thread.sleep(500);
		btnSearch.click();
	}
	
	public String getTxtEmpty() {
		return txtEmpty.getText();
	}
}
