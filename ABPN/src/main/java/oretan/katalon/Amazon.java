package oretan.katalon;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testAmazon() throws Exception {
	    driver.get("https://katalon-test.s3.amazonaws.com/aut/html/form.html");
	    driver.findElement(By.id("first-name")).click();
	    driver.findElement(By.id("first-name")).clear();
	    driver.findElement(By.id("first-name")).sendKeys("Dino");
	    driver.findElement(By.id("last-name")).clear();
	    driver.findElement(By.id("last-name")).sendKeys("Tiger");
	    driver.findElement(By.name("gender")).click();
	    driver.findElement(By.xpath("//form[@id='infoForm']/div[3]/div/div/label[2]/input")).click();
	    driver.findElement(By.name("gender")).click();
	    driver.findElement(By.id("dob")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::th[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[3]/following::span[7]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Feb'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[17]")).click();
	    driver.findElement(By.id("address")).click();
	    driver.findElement(By.id("address")).clear();
	    driver.findElement(By.id("address")).sendKeys("Jl. Suka-Suka no. 19");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("dino@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("dino123");
	    driver.findElement(By.id("company")).click();
	    driver.findElement(By.id("company")).clear();
	    driver.findElement(By.id("company")).sendKeys("dino123");
	    driver.findElement(By.id("role")).click();
	    new Select(driver.findElement(By.id("role"))).selectByVisibleText("Technical Architect");
	    driver.findElement(By.xpath("//option[@value='Technical Architect']")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=expectation | label=Challenging]]
	    driver.findElement(By.xpath("//option[@value='Challenging']")).click();
	    driver.findElement(By.xpath("//form[@id='infoForm']/div[11]/div/div/label")).click();
	    driver.findElement(By.xpath("//form[@id='infoForm']/div[11]/div/div[2]/label")).click();
	    driver.findElement(By.xpath("//form[@id='infoForm']/div[11]/div/div[3]/label")).click();
	    driver.findElement(By.xpath("//form[@id='infoForm']/div[11]/div/div[6]/label")).click();
	    driver.findElement(By.xpath("//form[@id='infoForm']/div[11]/div/div[6]/label")).click();
	    driver.findElement(By.id("comment")).click();
	    driver.findElement(By.id("comment")).clear();
	    driver.findElement(By.id("comment")).sendKeys("this is a test plan");
	    driver.findElement(By.id("submit")).click();
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
