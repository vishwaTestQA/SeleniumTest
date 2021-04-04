package BasePackage;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import constants.BaseConstants;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Result;

public class ReporterClass implements BaseConstants 
{
	
	public static ConfigReader config = new ConfigReader();
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest loggerHtml;
	
public static void reportGenerate() throws Exception
{

String fileName = (config.getDataConfig(reporter_Path));
final File configFile = new File ("src/test/resources/extent-config.xml");
extent = new ExtentReports();
spark = new ExtentSparkReporter(new File (fileName));
// spark.loadXMLConfig("C:/Users/vishwa/eclipse-workspace/seleniumSecond/src/test/resources/config/extent-config.xml");
spark.loadXMLConfig(configFile);

extent.attachReporter(spark);

}

public static ExtentTest createTests(String scenarioNme)
{
	loggerHtml = extent.createTest(scenarioNme);
	return loggerHtml;
	
}

public static String getTestName(Scenario scenario)  throws Throwable
{
	return scenario.getName().replaceAll(" ","-");
}

public static void createTestReport(Scenario scenario, String scnName)  throws Throwable
		{
	    //final Throwable throwable;
		if(scenario!=null) 
		{
		String testName = getTestName(scenario);
		
			switch(scenario.getStatus())
			{
			case PASSED:
				//loggerHtml=	extent.createTest(testName).pass("passed");
				loggerHtml.log(Status.PASS,"Test Passed");
				break;
				
			case FAILED:	
				//loggerHtml=  extent.createTest(testName).fail("Failed", MediaEntityBuilder.createScreenCaptureFromBase64String(scnName).build()); 
				loggerHtml.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(scnName).build());
				loggerHtml.log(Status.FAIL,"Test Failed");
				// loggerHtml.generateLog(Status.FAIL, testName);
				// loggerHtml.info(testName);
				// loggerHtml.log(Status.INFO, MarkupHelper.createLabel(testName, ExtentColor.ORANGE));
				//loggerHtml.fail(throwable.fillInStackTrace());
				// logError(scenario);
				 break;
				
			default:
				//loggerHtml = extent.createTest(testName).skip("Skipped");
				loggerHtml.log(Status.SKIP,"Test Skipped");
				//logError(scenario);
				break;
			}}
				
			}
		
		public static void writeToReport()  throws Throwable
		{
			if(extent!=null)
				extent.flush();
			
		}

public static void logError(Scenario scenario,String scnName) {
    try {
         Class clasz = ClassUtils.getClass("cucumber.runtime.java.JavaHookDefinition$ScenarioAdaptor");
        Field fieldScenario = FieldUtils.getField(clasz, "scenario", true);
        fieldScenario.setAccessible(true);
        Object objectScenario =  fieldScenario.get(scenario);

        Field fieldStepResults = objectScenario.getClass().getDeclaredField("stepResults");
        fieldStepResults.setAccessible(true);

        ArrayList<Result> results = (ArrayList<Result>) fieldStepResults.get(objectScenario);
        for (Result result : results) {
            if (result.getError() != null) {
                //loggerHtml.error(String.format("Error Scenario: %s", scenario.getId()), result.getError());
            	loggerHtml.log(Status.INFO,"Error Scenario: %s", result.getError(), MediaEntityBuilder.createScreenCaptureFromBase64String(scnName).build());	            }
        }
    } 
    catch (Exception e) {
    	loggerHtml.fail(e);
    }
}
    
//    public void result(Result result)
//    {
//        //Code to create logs or store to a database etc...
//        result.getError();
//        // result.getErrorMessage();
//  }
}
    
    
    