package ujian.ujiankelima.cucumber;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.*;

import ujian.ujiankeempat.nopcommerce.util.Constants;
import ujian.ujiankelima.cucumber.SceneOutlineHooks;
import ujian.ujiankelima.cucumber.page.RegisterPage;

import io.cucumber.java.en.*;

public class TestRegister {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private RegisterPage regPage = new RegisterPage();
	
	public TestRegister() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	
	@Given("User go to demo qa register page")
	public void user_go_to_demo_qa_register_page() {
		driver.get(Constants.URLLOGIN);
	    extentTest.log(LogStatus.PASS, "User go to demo qa register page");
	}

	@When("^User register input (.*) and (.*) and (.*)$")
	public void user_input_username_email_and_password(String username, String email, String password) {
		System.out.println("username: " + username);
		System.out.println("email: " + email);
	    System.out.println("password: " + password);
	    regPage.testRegister(username, email, password);
	    extentTest.log(LogStatus.PASS, "User register input username and email and password");
	}

	@When("User click show password icon")
	public void user_click_show_password_icon() {
	    regPage.clickShow();
	    extentTest.log(LogStatus.PASS, "User click show password icon");
	}

	@When("User click register button")
	public void user_click_register_button() {
	    regPage.clickReg();
	    extentTest.log(LogStatus.PASS, "User click register button");
	}

	@Then("valid validation")
	public void valid_validation() {
//	    regPage.getTxtErr();
//	    assertTrue(regPage.getTxtErr().contains("ERROR"));
//		regPage.getTxtLimit();
//	    assertTrue(regPage.getTxtLimit().contains("access"));
	    assertTrue(regPage.getTxtRegistered().contains("already registered"));
	    extentTest.log(LogStatus.PASS, "valid validation");
	}
}
