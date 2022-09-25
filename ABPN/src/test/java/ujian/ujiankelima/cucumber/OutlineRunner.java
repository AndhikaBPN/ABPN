package ujian.ujiankelima.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// untuk generate data ada di src/main/java/latihan/cucumber/util/ExcelGenerateOutline.java

@CucumberOptions(
features = {"src/test/resources/features/ujiankelima/001Login.feature",
			"src/test/resources/features/ujiankelima/002Register.feature"},
glue = "ujian.ujiankelima.cucumber",
monochrome=true,
plugin = {"pretty","html:target/ujiankelima/demoqa/htmlreport/LoginRunnerOutline.html",
		"json:target/ujiankelima/demoqa/jsonreport/LoginRunnerOutline.json",
		"junit:target/ujiankelima/demoqa/junitreport/LoginRunnerOutline.xml"})
public class OutlineRunner extends AbstractTestNGCucumberTests{
	
}