package BasePackage;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjects.LoginPage;
import PageObjects.ProductsPage;
import PageObjects.RegistrationPage;
import PageObjects.SearchPage;
import UtilityPackage.ScreenShotClass;
import constants.BaseConstants;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Result;
//import io.cucumber.plugin.event.Result;


public class BaseClass implements BaseConstants
{

	 public static WebDriver driver;
	 public static Logger log;
	 public static ConfigReader config = new ConfigReader();
     public  SearchPage spg = new SearchPage(driver);
     public  ProductsPage prodpg = new ProductsPage(driver);
     public RegistrationPage regPg = new RegistrationPage(driver);
     public LoginPage logPg = new LoginPage(driver);
     public ReporterClass repClass = new ReporterClass();
     public static ExtentTest loggerHtml;
	 public  static ExtentReports extent;
     public static ExtentSparkReporter spark;
     //public static ExtentHtmlReporter html;
     public static boolean isReporterRunning;
	
      
	
	public static WebDriver browserLaunch() throws Exception
	{
		String browser=config.getDataConfig(key_browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",config.getDataConfig(chrome_path));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("enable-automation");
		options.addArguments("--headless");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--dns-prefetch-disable");
		options.addArguments("--disable-gpu");
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver = new ChromeDriver();			
		}
		if(browser.equalsIgnoreCase("firefox"))
				{
			System.setProperty("webdriver.gecko.driver",config.getDataConfig(firefox_path));
			driver = new FirefoxDriver();
				}
		
		if(browser.equalsIgnoreCase(IE_path))
						{
					System.setProperty("webdriver.ie.driver",config.getDataConfig(IE_path));
					driver = new InternetExplorerDriver();
						}
		return driver;
	}
	
	public static void lauchApp(Scenario scenario) throws Exception
	{   
		String reportType = config.getDataConfig("reportType");
		if(reportType.equals("extentClass"))
		{
		   if(!isReporterRunning)
		  {
            ReporterClass.reportGenerate();
			isReporterRunning=true;
			
		   }
		   String scnName = scenario.getName();
		   loggerHtml = ReporterClass.createTests(scnName);
		  
		 }
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(config.getDataConfig("stagUrl"));
		
		
	
	}
		
	
	public static void closeApp(Scenario scenario) throws Throwable
	{
		String reportType = config.getDataConfig("reportType");
		
		if(reportType.equals("extentClass"))
		{
			
	        String scnName = null;
	        if(scenario.isFailed())
	           {
		         scnName = ScreenShotClass.captureScreenshot64File(scenario);
	            }
	   
	           ReporterClass.createTestReport(scenario,scnName);
	           
	  // logError(scenario,scnName);
	    
	            ReporterClass.writeToReport();
	             
	            driver.quit();
		}
		
		//scn shot will be embedded directly to html report on base64 format using extent report class
		else if(reportType.equals("extentConfig"))
		{
			if(scenario.isFailed())
	           {
		         ScreenShotClass.captureScreenshotEmbed(scenario);
	           }
		
		}
		
       //scn shot will be embedded on report which is externally configured from
		 else  if(reportType.equals("extentConfigRefScnShot"))
		{
			if(scenario.isFailed())
	           {
		         ScreenShotClass.captureScreenshotEmbed(scenario);
	           }
			
		}
		
	  else if(reportType.equals("extentConfigFile"))
		{
			if(scenario.isFailed())
	           {
		         ScreenShotClass.captureScreenshotFile(scenario);
		         
	           }
			
		}
		 
		 driver.quit();
		
	
		 
//		
//	 if(driver!=null)
//		          {
//			
//		          }
				

	}		
	
	public static void logger(String clsName)
	{
		
		log = Logger.getLogger(clsName);
		PropertyConfigurator.configure("src//test//resources//config//log4j.properties");
		
	}
}