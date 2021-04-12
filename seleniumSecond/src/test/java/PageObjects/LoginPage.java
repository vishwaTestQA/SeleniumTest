package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.SimpleUtils;
import io.cucumber.datatable.DataTable;

public class LoginPage {
	
	WebDriver driver;
	 
	public LoginPage(WebDriver driverl)
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
	public static List<WebElement> popups;
	
	@FindBy(how=How.XPATH,using="//a[@href='/login']")
	@CacheLookup
	WebElement logReg;
	
	@FindBy(how=How.ID,using="j_username")
	@CacheLookup
	WebElement emailLogin;

	@FindBy(how=How.ID,using="j_password")
	@CacheLookup
	WebElement pwdLogin;
	
	
	
	public void clickLogin() throws Throwable
	{
	SimpleUtils.click(popups);
	
	Thread.sleep(10000);
	
	logReg.click();
	
	}
	
	public void fillLogin(String username,String password) throws InterruptedException
	{
		emailLogin.clear();
		emailLogin.sendKeys(username);
		pwdLogin.clear();
		pwdLogin.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		System.out.println("login sucessfully");
	}
	
	public void verifyTitle()
	{
		System.out.println("title verified");
	}
	
	
	

}
