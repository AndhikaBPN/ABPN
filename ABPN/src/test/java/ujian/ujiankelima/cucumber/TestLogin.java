package ujian.ujiankelima.cucumber;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.*;

import ujian.ujiankeempat.nopcommerce.util.Constants;
import ujian.ujiankelima.cucumber.page.LoginInvalidPage;

import io.cucumber.java.en.*;

public class TestLogin {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private LoginInvalidPage invalidLogin = new LoginInvalidPage();
	
	
	public TestLogin() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	
	@Given("User go to demo qa login page")
	public void user_go_to_login_page() {
	    driver.get(Constants.URLLOGIN);
	    extentTest.log(LogStatus.PASS, "User go to demo qa login page");
	}

	@When("^User login input (.*) and (.*)$")
	public void user_input_username_and_password(String username, String password) {
	    System.out.println("username: " + username);
	    System.out.println("password: " + password);
	    invalidLogin.testLogin(username, password);
	    extentTest.log(LogStatus.PASS, "User login input username and password");
	}

	@When("User click login button")
	public void user_click_login_button() {
	    invalidLogin.clickLogin();
	    extentTest.log(LogStatus.PASS, "User click login button");
	}

	@Then("invalid validation")
	public void invalid_validation() {
//	    invalidLogin.getTxtErr();
	    assertTrue(invalidLogin.getTxtErr().contains("ERROR"));
//		invalidLogin.getTxtLimit();
//		assertTrue(invalidLogin.getTxtLimit().contains("access"));
	    extentTest.log(LogStatus.PASS, "invalid validation");
	}
}
