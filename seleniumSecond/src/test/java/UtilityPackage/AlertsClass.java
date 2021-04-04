package UtilityPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertsClass {
	
	 
	
	public static void acceptAlerts(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		
	}

}
