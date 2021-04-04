package PageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.SimpleUtils;
import io.cucumber.datatable.DataTable;
//import io.cucumber.datatable.DataTable;

public class RegistrationPage {
	
	WebDriver driver;
	 
	public RegistrationPage(WebDriver driverl)
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
	
	@FindBy(how=How.XPATH,using="//a[@href='/login']")
	@CacheLookup
	WebElement logReg;
	
	@FindBy(how=How.ID,using="register__firstName")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how=How.ID,using="register__lastName")
	@CacheLookup
	WebElement lastName;
	
@FindBy(how=How.ID,using="register__email")
@CacheLookup
WebElement emailId;
	
	
@FindBy(how=How.ID,using="register__mobileNumber")
@CacheLookup
WebElement mobNum;
	
	
	
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

public void fillLogin(DataTable login) throws InterruptedException
{
	List<List<String>> filllogin =  login.asLists(String.class);
	
	for(List<String> li : filllogin)
	{
//		emailLogin.sendKeys(li.get(0));
//		pwdLogin.sendKeys(li.get(1));
//		Thread.sleep(2000);
//		emailLogin.clear();
//		pwdLogin.clear();
//		Thread.sleep(2000);
		System.out.println(li.get(0));
		System.out.println(li.get(1));
	}
	
//	emailLogin.sendKeys(filllogin.get(0).get(0));
//	pwdLogin.sendKeys(filllogin.get(0).get(1));
//	emailLogin.clear();
//	pwdLogin.clear();
//	emailLogin.sendKeys(filllogin.get(1).get(0));
//	pwdLogin.sendKeys(filllogin.get(1).get(1));
//	
//	System.out.println(filllogin.get(0).get(0));
//			System.out.println(filllogin.get(0).get(1));
	
//	
}

	
	public void fillReg(DataTable regis)
	{
		 List<Map<String,String>> fillReg =  regis.asMaps(String.class,String.class);
	       {
//	    	   firstName.sendKeys(fillReg.get(1).get("First Name"));  	 
//	    	   lastName.sendKeys(fillReg.get(2).get("Last Name"));
//	    	   emailId.sendKeys(fillReg.get(3).get("Email Address"));
//	    	   mobNum.sendKeys(fillReg.get(7).get("Mobile Number"));
	    	   
	    	   for(Map<String,String> e : fillReg)
	    	   {
//	    		   firstName.sendKeys(e.get("First Name"));  	 
//		    	   lastName.sendKeys(e.get("Last Name"));
//		    	   emailId.sendKeys(e.get("Email Address"));
//		    	   mobNum.sendKeys(e.get("Mobile Number"));
//	    		   
	    		   System.out.println(e.get("First Name"));
	    		   System.out.println(e.get("Last Name"));
	    		   System.out.println(e.get("Mobile Number"));
	    		   
	    		   System.out.println("Saved");
	    	   }
	       }
	}
	
	
	
	
	

}
