package latihan.cucumber;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import latihan.cucumber.util.Constants;
import latihan.cucumber.pages.LoginPage;

import io.cucumber.java.en.*;

public class TestLoginNopc {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLoginNopc() {
		driver = LoginHooks.driver;
		extentTest = LoginHooks.extentTest;
	}
	
	@When("User open nopcommerce login page")
	public void user_open_nopcommerce_login_page() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User open nopcommerce login page");
	}
	
	@When("User input invalid email and password")
	public void user_input_invalid_email_and_password() throws Exception {
		loginPage.testLogin("adsda@gmail.com", "admin");
		extentTest.log(LogStatus.PASS, "User input invalid email and password");
	}
	
	@When("User click login button")
	public void user_click_login_button() throws Exception {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click login button");
	}
	
	@Then("User invalid nopcommerce credentials")
	public void user_invalid_nopcommerce_credentials() {
	    loginPage.getTxtNoFound();
	    assertTrue(loginPage.getTxtNoFound().contains("No customer account found"));
		extentTest.log(LogStatus.PASS, "User invalid nopcommerce credentials");
	}

	@When("User input valid email and password")
	public void user_input_valid_email_and_password() throws Exception {
		loginPage.testLogin("admin@yourstore.com", "admin");
		extentTest.log(LogStatus.PASS, "User input valid email and password");
	}
	
	@When("User click login button valid")
	public void user_click_login_button_valid() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click login button valid");
	}

	@Then("User valid nopcommerce credentials")
	public void user_valid_nopcommerce_credentials() {
	    loginPage.getTxtDashboard();
	    assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
		extentTest.log(LogStatus.PASS, "User valid nopcommerce credentials");
	}
}
