package latihan.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/nopcommerce/NopcLogin.feature"},
glue = "latihan.cucumber",
monochrome=true,
plugin = {"pretty","html:target/nopc/htmlreport/LoginRunner.html",
		"json:target/nopc/jsonreport/LoginRunner.json",
		"junit:target/nopc/junitreport/LoginRunner.xml"})

public class LoginRunner extends AbstractTestNGCucumberTests{

}
