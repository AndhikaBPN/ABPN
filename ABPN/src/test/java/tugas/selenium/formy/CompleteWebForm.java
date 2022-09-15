package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteWebForm {
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
	  public void testCompleteWebForm() throws Exception {
	    driver.get("https://formy-project.herokuapp.com/form");
	    Thread.sleep(1000);
	    driver.findElement(By.id("first-name")).click();
	    driver.findElement(By.id("first-name")).clear();
	    driver.findElement(By.id("first-name")).sendKeys("Andhika");
	    Thread.sleep(500);
	    driver.findElement(By.id("last-name")).clear();
	    driver.findElement(By.id("last-name")).sendKeys("Bagaskara");
	    Thread.sleep(500);
	    driver.findElement(By.id("job-title")).clear();
	    driver.findElement(By.id("job-title")).sendKeys("Game Dev");
	    Thread.sleep(500);
	    driver.findElement(By.id("radio-button-1")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("radio-button-2")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("checkbox-1")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("checkbox-3")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("checkbox-3")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("select-menu")).click();
	    Thread.sleep(500);
	    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("0-1");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//option[@value='1']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("datepicker")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::th[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[2]/following::span[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='January 2022'])[1]/following::th[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[27]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.linkText("Submit")).click();
	    Thread.sleep(2000);
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
