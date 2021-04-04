package sample;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features="src/test/resources/Featuresss/Sample.feature",
//		glue={"StepDefenition"},
//	    dryRun = false,
//		monochrome  = true,
//		plugin = {"pretty","html:target/Cucumber-html-report"}
//		)


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/SampleFeatures/Sample.feature",
		tags= "@first",
		glue={"sample.SampleRun.java"},
	    dryRun = false,
		monochrome  = true
	//	plugin = {"pretty","html:target/Cucumber-html-report"}
		)

public class SampleRunner {

}
