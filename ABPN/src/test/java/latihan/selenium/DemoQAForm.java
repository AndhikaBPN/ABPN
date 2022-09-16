package latihan.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAForm {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testDEMOQA() throws Exception {
	    driver.get("https://demoqa.com/automation-practice-form");
	    driver.findElement(By.id("firstName")).click();
	    driver.findElement(By.id("firstName")).clear();
	    driver.findElement(By.id("firstName")).sendKeys("Dino");
	    driver.findElement(By.id("lastName")).clear();
	    driver.findElement(By.id("lastName")).sendKeys("Tiger");
	    driver.findElement(By.id("userEmail")).clear();
	    driver.findElement(By.id("userEmail")).sendKeys("dino@gmail.com");
	    driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div/label")).click();
	    driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[2]/label")).click();
	    driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div/label")).click();
	    driver.findElement(By.id("userNumber")).click();
	    driver.findElement(By.id("userNumber")).clear();
	    driver.findElement(By.id("userNumber")).sendKeys("0863659865");
	    driver.findElement(By.id("dateOfBirthInput")).click();
	    driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select")).click();
	    new Select(driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select"))).selectByVisibleText("2011");
	    driver.findElement(By.xpath("//option[@value='2011']")).click();
	    new Select(driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select"))).selectByVisibleText("February");
	    driver.findElement(By.xpath("//option[@value='1']")).click();
	    driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("react-select-2-option-0")).click();
	    driver.findElement(By.id("react-select-2-option-0")).click();
	    driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label")).click();
	    driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]/label")).click();
	    driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
	    driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]/label")).click();
	    driver.findElement(By.id("uploadPicture")).click();
	    driver.findElement(By.id("uploadPicture")).clear();
	    driver.findElement(By.id("uploadPicture")).sendKeys("C:\\fakepath\\Nested-for.png");
	    driver.findElement(By.id("currentAddress")).click();
	    driver.findElement(By.id("currentAddress")).clear();
	    driver.findElement(By.id("currentAddress")).sendKeys("Jl. Pelangi Surabaya");
	    driver.findElement(By.id("react-select-3-option-2")).click();
	    driver.findElement(By.xpath("//div[@id='city']/div/div")).click();
	    driver.findElement(By.id("react-select-4-option-1")).click();
	    driver.findElement(By.id("submit")).click();
	    driver.findElement(By.id("closeLargeModal")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
