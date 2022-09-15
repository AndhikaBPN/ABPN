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

public class DropDown {
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
	  public void testDropDown() throws Exception {
		  driver.get("https://formy-project.herokuapp.com/dropdown");
		    Thread.sleep(1000);
		    driver.findElement(By.id("dropdownMenuButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("autocomplete")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("country")).click();
		    driver.findElement(By.id("country")).clear();
		    driver.findElement(By.id("country")).sendKeys("Indo");
		    Thread.sleep(1000);
		    driver.findElement(By.id("navbarDropdownMenuLink")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.linkText("Modal")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("modal-button")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("close-button")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("navbarDropdownMenuLink")).click();
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
