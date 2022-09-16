package tugas.selenium.demoqa.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

import tugas.selenium.demoqa.drivers.connection.DriverSingleton;

public class CheckBoxPage {
private WebDriver driver;
	
	public CheckBoxPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
//	@FindBy(xpath = "CheckBoxPage")
}
