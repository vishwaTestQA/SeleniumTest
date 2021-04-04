package BasePackage;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import PageObjects.MouseSportsPage;
import PageObjects.SearchPage;
import UtilityPackage.UtilityClass;

public class BaseClass
{

	static WebDriver driver;
	
	public static WebDriver setup()
	{
	System.setProperty("webdriver.chrome.driver","src//test//resources//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.bigw.com.au/");
  //  WebDriverWait wait = new WebDriverWait(driver,10);
   // Alert alert = wait.until(ExpectedConditions.alertIsPresent());
   // alert.dismiss();
    return driver;
	}
	

	public static void close()
	{
		driver.quit();
	}
}
