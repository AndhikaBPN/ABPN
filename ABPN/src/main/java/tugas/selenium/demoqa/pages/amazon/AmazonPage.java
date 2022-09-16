package tugas.selenium.demoqa.pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import tugas.selenium.demoqa.drivers.connection.DriverSingleton;

public class AmazonPage {
	private WebDriver driver;
	
	public AmazonPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(id = "first-name")
	private WebElement fName;
	
	@FindBy(id = "last-name")
	private WebElement lName;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[3]/div/div/label[1]/input")
	private WebElement gMale;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[3]/div/div/label[2]/input")
	private WebElement gFemale;
	
	@FindBy(id = "dob")
	private WebElement date;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "role")
	private WebElement dropRole;
	
	@FindBy(xpath = "//option[@value='Technical Architect']")
	private WebElement roleTA;
	
	@FindBy(xpath = "//option[@value='Challenging']")
	private WebElement jobExpect;
	
	@FindBy(xpath = "//label[normalize-space()='Read books']")
	private WebElement checkWays1;
	
	@FindBy(xpath = "//label[normalize-space()='Take online courses']")
	private WebElement checkWays2;
	
	@FindBy(xpath = "//label[normalize-space()='Join tech cons']")
	private WebElement checkWays3;
	
//	@FindBy(xpath = "//label[normalize-space()='Read books']")
//	private WebElement checkBox;
	
	@FindBy(id = "comment")
	private WebElement comment;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//span[@id='submit-msg']")
	private WebElement txtSuccess;
	
//	Page Object
	public void amazon(String fName, String lName, String date, String address, String email, String password, String company, String comment) throws InterruptedException {
		this.fName.sendKeys(fName);
		this.lName.sendKeys(lName);
		gMale.click();
		gFemale.click();
		gMale.click();
		this.date.sendKeys(date);
		this.address.sendKeys(address);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.company.sendKeys(company);
		dropRole.click();
		roleTA.click();
		jobExpect.click();
		checkWays1.click();
		Thread.sleep(1000);
		checkWays2.click();
		Thread.sleep(1000);
		checkWays3.click();
		Thread.sleep(1000);
		checkWays3.click();
		this.comment.sendKeys(comment);
		btnSubmit.click();
	}
	
	public String getTxtSuccess() {
		return txtSuccess.getText();
	}
}
