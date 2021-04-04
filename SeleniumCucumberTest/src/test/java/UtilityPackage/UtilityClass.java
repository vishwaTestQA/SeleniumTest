package UtilityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {
	
	static WebDriver driver;
	
	public static void impwait(int milli,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(milli, TimeUnit.SECONDS);
	}
	
	public static void action(WebElement ele,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	
	public static void acceptAlerts(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		
	}
	
	public static void explWait(WebDriver driver,int milli,WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,milli);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public static void eleClickable(WebDriver driver,int milli,WebElement wb) 
	{
		WebDriverWait wait = new WebDriverWait(driver,milli);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}
	

	public static void alerts(WebDriver driver , int milli) {
		
		WebDriverWait wait = new WebDriverWait(driver,milli);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}



	}
	
	



