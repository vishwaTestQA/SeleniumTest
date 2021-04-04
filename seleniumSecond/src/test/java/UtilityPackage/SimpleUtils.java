package UtilityPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePackage.BaseClass;

public class SimpleUtils extends BaseClass {
	
	//WebDriver driver;
	
	public static void goBack() throws Throwable
	{	
	driver.navigate().back();
	}
	
	public static void click(List<WebElement> ele) throws Throwable
	{
		for(WebElement wb : ele)
		{
		 if(wb.isDisplayed())
		wb.click();
		}
	}
}
