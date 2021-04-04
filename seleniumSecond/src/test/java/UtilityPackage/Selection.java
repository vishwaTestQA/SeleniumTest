package UtilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selection {
	
	
	
	public static void selection(WebElement ele,String text)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
		
	}

}
