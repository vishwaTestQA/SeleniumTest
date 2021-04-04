package UtilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionMove {
	
	
	
	public static void action(WebElement ele,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	public static void actionClick(WebElement ele,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		ele.click();
		
	}

}
