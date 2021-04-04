package sample;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import BasePackage.BaseClass;
import PageObjects.SearchPage;
import UtilityPackage.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSearchStep {
	
	WebDriver driver;
	BaseClass base;
	SearchPage spg;
	
	
	@Given("^launch browser and navigate to bigw url$")
	public void launch_browser_and_navigate_to_bigw_url() throws Throwable {
		
		
		driver = BaseClass.setup();
		String pid = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String ss : child)
		{
			String childid = ss; 
		if(!pid.equals(childid))
		{
			driver.switchTo().window(childid).close();
			driver.switchTo().defaultContent();
		}
		//driver.findElement(By.className(className)
		}
	}

	@When("^enter products in search$")
	public void enter_products_in_search() throws Throwable {
	
		spg = new SearchPage(driver);
	    
		spg.searchprod("mobile");
	
	}
	
	@When("^when enter second products in search$")
	public void when_enter_second_products_in_search() throws Throwable {

		spg = new SearchPage(driver);
	    
		spg.searchprod("mobile");
	}

	@When("^enter the search option$")
	public void enter_the_search_option() throws Throwable {
	
		  spg.pressSearch();
	}

	@When("^choose the product and click$")
	public void choose_the_product_and_click() throws Throwable {
		
		spg.ClickSamsung();
		spg.clickBack();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		UtilityClass.impwait(10,driver);
	    BaseClass.close();
	}


}
