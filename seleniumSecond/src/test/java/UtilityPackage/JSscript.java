package UtilityPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePackage.BaseClass;

public class JSscript extends BaseClass{
	
	
	
	public static void jsclick(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
	}
	
	public static void jsScroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		js.executeScript("window.scrollBy(0,-350)","");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
	}

}
