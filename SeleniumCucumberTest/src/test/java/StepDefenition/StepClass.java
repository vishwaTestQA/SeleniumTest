	package StepDefenition;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import BasePackage.BaseClass;
	import UtilityPackage.UtilityClass;
	import PageObjects.SearchPage;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class StepClass extends BaseClass{
		
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

		@When("^when enter products in search$")
		public void when_enter_products_in_search() throws Throwable {
		    
		    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
			//spg.clickBack();
		}

		
		@Then("^close the browser$")
		public void close_the_browser() throws Throwable {
			UtilityClass.impwait(10,driver);
		    BaseClass.close();
		}
		
	}
	
	
	
/*	@Given("^launch browser and navigate to bigw url$")
	public void launch_browser_and_navigate_to_bigw_url() throws Throwable {
	   
	}

	@When("^when enter products in search$")
	public void when_enter_products_in_search() throws Throwable {
	   
	}

	@When("^enter the search option$")
	public void enter_the_search_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^choose the product and click$")
	public void choose_the_product_and_click() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}*/

