package parallel;

import BasePackage.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ServiceHooks {
	
	@Before
	public void launch(Scenario scenario) throws Throwable {

	{
		BaseClass.logger(getClass().getCanonicalName());
	//	BaseClass.extentReport(getClass().getCanonicalName());
		
		BaseClass.browserLaunch();
		
		//log.info("Browser is launched");
		
		BaseClass.lauchApp(scenario);
		//log.info("Application is launched");
		 
		
	}
    	
	}
	
	@After
	public void closingbrowser(Scenario scenario) throws Throwable {
		
	    BaseClass.closeApp(scenario);
	   // log.info("browser is closed");
	}
	 

}
