package UtilityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpWait {
	
	static WebElement wb;
	
	
	public static void impwait(int milli, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(milli, TimeUnit.SECONDS);
	}
	
	
	public static void visiblityofelem(WebDriver driver,int milli,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,milli);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void eleClickable(WebDriver driver,int sec,WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver,sec);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void eleSelected(WebDriver driver,int sec,WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver,sec);
		wait.until(ExpectedConditions.elementToBeSelected(ele));
	}
	
	public static boolean elePresent(WebDriver driver,int sec, By loc) 
	{
		WebDriverWait wait = new WebDriverWait(driver,sec);
		wb = wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		if(wb==null)
		{
			return false;
		}
		else
			return true;
	}
	

	public static void alertPresent(WebDriver driver , int milli) {
		
		WebDriverWait wait = new WebDriverWait(driver,milli);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}

}
