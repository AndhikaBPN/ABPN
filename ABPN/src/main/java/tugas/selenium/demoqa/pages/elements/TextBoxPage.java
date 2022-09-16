package tugas.selenium.demoqa.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import tugas.selenium.demoqa.drivers.connection.DriverSingleton;

public class TextBoxPage {
	private WebDriver driver;
	
	public TextBoxPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(xpath = "//input[@id='userName']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement currAddress;
	
	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	private WebElement permAddress;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//p[@id='name']")
	private WebElement resName;
	
//	Page Object
	public void textBox(String username, String email, String currAddress, String permAddress) throws Exception {
		this.username.sendKeys(username);
		this.email.sendKeys(email);
		this.currAddress.sendKeys(currAddress);
		this.permAddress.sendKeys(permAddress);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement btn = driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", btn);
		btnSubmit.click();
	}
	
	public String getUsername() {
		return resName.getText();
	}
}
