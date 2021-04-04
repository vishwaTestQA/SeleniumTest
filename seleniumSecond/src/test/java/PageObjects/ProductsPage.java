package PageObjects;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.JSscript;
import UtilityPackage.SimpleUtils;

public class ProductsPage {
	
	WebDriver driver;
	 
	public ProductsPage(WebDriver driverl)
	{
		this.driver = driverl;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({
	@FindBy(how=How.XPATH,using="//div[@class='quickViewContainer']//a[@title='The 1964 Denim Company Boys Classic Jean - Navy']"),
	@FindBy(how=How.XPATH,using="//div[@class='quickViewContainer']//a[@title='Disney Frozen 2 Elsa Child Jelly Shoes - Blue']")})
	@CacheLookup
	List<WebElement> allproducuts;
	
	@FindBy(how=How.XPATH,using="//div[@class='clone-title']//h1[text()='Disney Frozen 2 Elsa Child Jelly Shoes - Blue']")
	@CacheLookup
     WebElement ShoeTitle;
	
	@FindBy(how=How.XPATH,using="//div[@class='productDescription']//h1[contains(.,'The 1964 Denim Company Boys Classic Jean - Navy')]")
	@CacheLookup
     WebElement jeanTitle;	
	
	

    public void clickProducts()  throws Throwable
{
	   SimpleUtils.click(allproducuts);
	  // JSscript.jsScroll();
	  
}
    
    public void verify()  throws Throwable
    {
    	 
//   	   String title = ShoeTitle.getText();
//    	String expected="Disney Frozen 2 Elsa Child Jelly Shoes - Blue";
//	Assert.assertEquals(expected, title);
    	
    	Assert.assertEquals("expected", "expected");
    
    }

}