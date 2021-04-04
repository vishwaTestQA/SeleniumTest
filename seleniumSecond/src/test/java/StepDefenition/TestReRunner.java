package StepDefenition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="@target/FailureTestCases/failed.txt",
	 //  tags={"@one"},
		glue={"StepDefenition"},
	    dryRun = false,
		monochrome  = true,
		plugin = {"pretty","html:target/Cucumber-html-report",
				"rerun:target/FailureTestCases/failed.txt"}
		)

public class TestReRunner {

}
