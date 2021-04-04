package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityPackage.*;



public class SearchPage {
	
	WebDriver driver;
	 
	public SearchPage(WebDriver driverl)
	{
		this.driver = driverl;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt='Subscribe to our newsletter to receive"
			+ " our catalogue straight to your email']")
	@CacheLookup
	WebElement popups;
	
	@FindBy(how=How.XPATH,using="//img[@title='Big W']")
	@CacheLookup
     WebElement BigWImg;		
	
	@FindAll({
		@FindBy(how=How.XPATH,using="//input[@id='site-search-text']"),
		@FindBy(how=How.XPATH,using="//input[@name='text']")
		})
		@CacheLookup
		WebElement searchText;
	
	
	@FindBy(how=How.XPATH,using="//button[@class='siteSearchSubmit btn']")
	@CacheLookup
	WebElement searchButton;
	
	  //samsung search in list
	@FindBy(how=How.XPATH,using="//img[@alt='Optus Samsung Galaxy A21s']")
	@CacheLookup
	WebElement searchMblSam;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-link btn-back ']")
	@CacheLookup
	WebElement clickBack;
	
	@FindBy(how=How.XPATH,using="//*[@data-src='/assets/icons/cross.svg']")
	@CacheLookup
	WebElement fillpopup;
	//
	
	   //--> back
	
	//a[@class='btn btn-link btn-back ']  //--> again same
	public void searchprod(String prod) throws Exception
	{    
		//UtilityClass.alerts(driver,20);
		//UtilityClass.acceptAlerts(driver);
		//UtilityClass.impwait(10,driver);
		//Thread.sleep(10000);
		
		searchText.clear();
		searchText.sendKeys(prod);
		
	}
		
	public void pressSearch()	
	{
		//UtilityClass.eleClickable(driver,10,searchButton);
		//searchButton.click();
		JSscript.jsclick(searchButton,driver);
	}
	
	public void ClickSamsung()
	{
		searchMblSam.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		js.executeScript("window.scrollBy(0,-350)","");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		
	}
	
	public void clickBack()
	
	{
		//WebDriverWait webwait = new WebDriverWait(driver,10);
	//	webwait.until(ExpectedConditions.elementToBeClickable(clickBack));
	//  clickBack.click();
		
		driver.navigate().back();
	}
	
	
	
	

}

