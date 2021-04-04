package parallel;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src/test/resources/Features/",
	   // tags={"@prod"},
		glue={"StepDefenition"},
	    dryRun = false,
		monochrome  = true,
		strict=false,
		plugin = {"pretty","html:target/Cucumber-html-report",
				  "json:target/Cucumber-jason-report/reports.json",
				 "junit:target/Cucumber-junit-report/reports.xml",
				"rerun:target/FailureTestCases/failed.txt",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"}
		
		)
public class ParallelRunner {
	
	

}


//"./Features/sportsicon.feature"