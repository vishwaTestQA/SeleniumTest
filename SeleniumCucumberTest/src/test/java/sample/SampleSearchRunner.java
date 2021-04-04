package sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/SampleFeatures/SampleSearch.feature",
		glue={"sample"},
	    dryRun = false,
		monochrome  = true
		//strict = false
		//plugin = {"pretty","html:target/Cucumber-html-report"}
		)

public class SampleSearchRunner {

}
