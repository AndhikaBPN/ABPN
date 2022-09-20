package latihan.cucumber.outline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/nopcommerce/NopcLoginOutline.feature"},
glue = "latihan.cucumber.outline",
monochrome=true,
plugin = {"pretty","html:target/nopc-outline/htmlreport/LoginRunnerOutline.html",
		"json:target/nopc-outline/jsonreport/LoginRunnerOutline.json",
		"junit:target/nopc-outline/junitreport/LoginRunnerOutline.xml"})
public class OutlineRunner extends AbstractTestNGCucumberTests{
	
}