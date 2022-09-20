package latihan.cucumber.outline;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import latihan.cucumber.util.Constants;
import latihan.cucumber.outline.SceneOutlineHooks;
import latihan.cucumber.pages.LoginPage;

import io.cucumber.java.en.*;

public class TestLoginNopcOutline {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLoginNopcOutline() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	
	@When("Browser open nopcommerce Outline")
	public void browser_open_nopcommerce_outline() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Browser open nopcommerce Outline");
	}

	@When("^Enter invalid (.*) and (.*) Outline$")
	public void enter_invalid_password_and_username_outline(String username, String password) throws Exception {
	    System.out.println("username: " + username);
	    System.out.println("password: " +password);
	    loginPage.testLogin(username, password);
		extentTest.log(LogStatus.PASS, "User input invalid email and password");
	}

	@When("button login click Outline")
	public void button_login_click_outline() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click login button");
	}

	@Then("System check credentials")
	public void system_check_credentials() {
		loginPage.getTxtNoFound();
		assertTrue(loginPage.getTxtNoFound().contains("No customer account found"));
		extentTest.log(LogStatus.PASS, "User invalid nopcommerce credentials");
	}
}
