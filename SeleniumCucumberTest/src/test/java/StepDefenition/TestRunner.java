package StepDefenition;

import org.junit.After;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Featuresss/search.feature",
		glue={"StepDefenition"},
	    dryRun = false,
		monochrome  = true,
		plugin = {"pretty","html:target/Cucumber-html-report",
				"jason:target/Cucumber-jason.xml",
				"rerun:target/FailureTestCases/failed.txt"}
		)
public class TestRunner {
	
	

}


//"./Features/sportsicon.feature"