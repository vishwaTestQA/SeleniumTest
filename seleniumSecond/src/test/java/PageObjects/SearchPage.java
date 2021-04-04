package PageObjects;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
	@FindAll(
			{
	@FindBy(how=How.XPATH,using="//div[@class='Icon cross variant-dark size-normal']"),
	@FindBy(how=How.XPATH,using="//button[@id='signUpPopupCloseButton']")
			})
	@CacheLookup
	static List<WebElement> popups;
	
	@FindBy(how=How.XPATH,using="//img[@title='Big W']")
	@CacheLookup
     WebElement BigWImg;		
	
	
	
	
	@FindAll({
	@FindBy(how=How.XPATH,using="//input[@id='site-search-text']"),
	@FindBy(how=How.XPATH,using="//input[@name='text']")
	})
	@CacheLookup
	static List<WebElement> searchText;
	
	@FindBy(how=How.XPATH,using="//button[@class='siteSearchSubmit btn']")
	@CacheLookup
	static WebElement searchButton;
	
	//samsung search in list
	@FindAll({
	@FindBy(how=How.XPATH,using="//img[@alt='Optus Samsung Galaxy A21s']"),
	@FindBy(how=How.XPATH,using="//img[@alt='Huawei Y5 2019 - Amber Brown']")
	})
	@CacheLookup
	WebElement searchMobile;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-link btn-back ']")
	@CacheLookup
	WebElement clickBack;
	
	@FindBy(how=How.XPATH,using="//*[@data-src='/assets/icons/cross.svg']")
	@CacheLookup
	WebElement fillpopup;
	//
	//Laptop
	@FindBy(how=How.XPATH,using= "//img[@alt='Lenovo IdeaPad Slim 3 14\" Chromebook N4020 4GB/64GB']")
	@CacheLookup
	WebElement searchLaptop;
	
	@FindBy(how=How.XPATH,using= "//span[contains(text(),\"All\")]")
	@CacheLookup
	WebElement selectSearchType;
	

	@FindBy(how=How.XPATH,using= "//div[@class='visible']//a[contains(.,\"Electronics\")]")
	@CacheLookup
	WebElement selectElectronics;
	
	@FindBy(how=How.XPATH,using= "//img[@alt='DGTEC Amoled Smart Watch - Brown']")
	@CacheLookup
	WebElement selectWatch;
	
//  select tag is now not clickable
//	@FindBy(how=How.XPATH,using= "//select[@id='Search_Category_JS']")
//	@CacheLookup
//	WebElement SearchTypeSelect;
	
	@FindBy(how=How.XPATH,using= "//div[@class='site-search-department-display']")
	@CacheLookup
	WebElement SearchTypeSelect;
	
	By typeSelect = By.xpath("//div[@class='site-search-department-display']");
	
	@FindBy(how=How.XPATH,using= "//div[@id='site-search-department-options']//a")
	@CacheLookup
	List<WebElement> SelectOption;

	
	public void searchprod(String prod) throws Throwable
	{    
//		try {
//		boolean bool = popups.isDisplayed();
//		
//			popups.click();
//			searchText.clear();
//			searchText.sendKeys(prod);
//		
//		}
//		catch(NoSuchElementException e) {
//		searchText.clear();
//		searchText.sendKeys(prod);
//		}	}
      
			SimpleUtils.click(popups);
			EnterText.enterText(searchText, prod);
		}
		
	public void pressSearch() throws Throwable
	{
		
		//searchButton.click();
		JSscript.jsclick(searchButton);
		
	}
	
	
	public void ClickSamsung()  throws Throwable
	{
		
		searchMobile.click();
		JSscript.jsScroll();
		
	}
	public void ClickLenovo()  throws Throwable
	{
		searchLaptop.click();
		JSscript.jsScroll();
		
	}
	
	public void ClickWatch()  throws Throwable
	{
		selectWatch.click();
		JSscript.jsScroll();
		
	}
	
	public void clickBack()  throws Throwable
	
	{
		SimpleUtils.goBack();
	}
	
public void selectType(String type) throws Exception {
		
		
		  ActionMove.actionClick(SearchTypeSelect,driver);
	       
			SelectOption.forEach(ele ->{
				String text=ele.getText();
				if(text.equals(type))
				{
					ele.click();
					
				}
			});
		
//		WebElement wb = driver.findElement(typeSelect);
//		boolean bool = ImpWait.elePresent(driver,30, typeSelect);
		
//		if(bool==true)
//		{
//		ActionMove.actionClick(SearchTypeSelect,driver);
//		
//		Thread.sleep(3000);
//		
//		for(WebElement option : SelectOption)
//		{
//			String text=option.getText();
//			if(text.equals(type))
//			{
//				option.click();
//				break;
//			}
//		}
//		Thread.sleep(3000);	
//		}
		
//		else
//			
//		{
//		{
//			String pid = driver.getWindowHandle();
//    		Set<String> child = driver.getWindowHandles();
//    		for(String ss : child)
//    		{
//    			String childid = ss; 
//    		if(!pid.equals(childid))
//    		{
//    			driver.switchTo().window(childid).close();
//    			driver.switchTo().defaultContent();
//    		}
//    		
//    		}
	     
			
		}	
		


	
}

