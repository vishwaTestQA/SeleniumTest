package UtilityPackage;

import java.util.List;

import org.openqa.selenium.WebElement;

import BasePackage.BaseClass;

public class EnterText extends BaseClass {

	public static void enterText(WebElement ele,String text)
	{
		ele.clear();
		ele.sendKeys(text);
	}
	
	public static void enterText(List<WebElement> ele,String text)
	{
		for(WebElement wb : ele)
			if(wb.isDisplayed())
			{
		wb.clear();
		wb.sendKeys(text);
			}
	}
}
