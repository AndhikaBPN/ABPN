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

public class DashboardZoomPage {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public DashboardZoomPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(linkText = "Dismiss")
	private WebElement dismiss;
	
	@FindBy(xpath = "//body/div[@id='noo-site']/div[contains(@role,'main')]/div[contains(@class,'noo-container-fluid')]/div[contains(@class,'vc_row wpb_row vc_row-fluid')]/div[contains(@class,'padding-stylebox wpb_column vc_column_container vc_col-sm-12 vc_col-lg-7 vc_col-md-7')]/div[contains(@class,'vc_column-inner vc_custom_1465283139672')]/div[contains(@class,'wpb_wrapper')]/div[contains(@class,'noo-shortcode-product-wrap')]/div[contains(@class,'noo-sh-product-grid woocommerce')]/div[contains(@class,'noo-sh-product-html columns_3 no_masonry three row is-flex')]/div[2]/div[1]/div[1]/div[1]/span[1]")
	private WebElement btnZoom;
	
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtTitle;
	
//	Page Object
	public void testZoomProd() {
		dismiss.click();
		btnZoom.click();
		Constants.delay(2, strDelay);
	}
	
	public String getTxtTitle() {
		return txtTitle.getText();
	}
}
