package tugas.selenium.demoqa.pages.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import tugas.selenium.demoqa.drivers.connection.DriverSingleton;

public class PracticeFormPage {
private WebDriver driver;
	
	public PracticeFormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(id = "firstName")
	private WebElement fName;
	
	@FindBy(id = "lastName")
	private WebElement lName;
	
	@FindBy(id = "userEmail")
	private WebElement email;
	
	@FindBy(xpath = "//label[@for='gender-radio-1']")
	private WebElement rMale;
	
	@FindBy(xpath = "//label[@for='gender-radio-2']")
	private WebElement rFemale;
	
	@FindBy(id = "userNumber")
	private WebElement phoneNumber;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement btnDate;
	
	@FindBy(id = "subjectsInput")
	private WebElement subject;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div/label")
	private WebElement checkBtn1;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div[2]/label")
	private WebElement checkBtn2;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div[3]/label")
	private WebElement checkBtn3;
	
	@FindBy(xpath = "//input[@id='uploadPicture']")
	private WebElement btnUpload;
	
	@FindBy(id = "currentAddress")
	private WebElement currAddress;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(id = "closeLargeModal")
	private WebElement btnClose;
	
//	Page Object
	public void inputTgl(String date) throws Exception {
		Robot robot = new Robot();
		btnDate.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		Thread.sleep(500);
		this.btnDate.sendKeys(date);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void inputSubject(String subj) throws Exception {
		Robot robot = new Robot();
		subject.click();
		this.subject.sendKeys(subj);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void practiceForm(String fName, String lName, String email, String phoneNumber, String date, String subj, String btnUpload, String currAddress) throws Exception {
		Robot rb = new Robot();
		for(int i = 0; i<5; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		this.fName.sendKeys(fName);
		this.lName.sendKeys(lName);
		this.email.sendKeys(email);
		rMale.click();
		Thread.sleep(1000);
		rFemale.click();
		Thread.sleep(1000);
		rMale.click();
		Thread.sleep(1000);
		this.phoneNumber.sendKeys(phoneNumber);
		inputTgl(date);
		inputSubject(subj);
		checkBtn1.click();
		Thread.sleep(1000);
		checkBtn2.click();
		Thread.sleep(1000);
		checkBtn3.click();
		Thread.sleep(1000);
		checkBtn2.click();
		Thread.sleep(1000);
		this.btnUpload.sendKeys(btnUpload);
		this.currAddress.sendKeys(currAddress);
		state.click();
		Thread.sleep(500);
		List<WebElement> selectedItemState = driver.findElements(By.id("react-select-3-option-2"));
		selectedItemState.get(0).click();
		city.click();
		Thread.sleep(500);
		List<WebElement> selectedItemCity = driver.findElements(By.id("react-select-4-option-1"));
		selectedItemCity.get(0).click();
		btnSubmit.click();
		Thread.sleep(2000);
	}
	
	public String getClose() {
		return btnClose.getText();
	}
}
