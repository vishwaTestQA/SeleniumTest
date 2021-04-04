	package parallel;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;


import BasePackage.BaseClass;
import BasePackage.ConfigReader;
import PageObjects.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class SearchClass extends BaseClass{
		
			
		@Given("^when enter product as \"([^\"]*)\" in search$")
		public void when_enter_product_as_in_search(String prod) throws Throwable
		{   
		    log.info("searching prod");
			spg.searchprod(prod);
			//loggerHtml.log(Status.INFO, "Entering product");
			
			
		}

		@When("^enter the search option$")
		public void enter_the_search_option() throws Throwable {
			log.info("clicking search");
		  spg.pressSearch();
		}

		@Then("^choose the productLenovo and click$")
		public void choose_the_productLenovo_and_click() throws Throwable {
			
			log.info("selecting given product");
			spg.ClickLenovo();
			spg.clickBack();
//			loggerHtml.log(Status.PASS, "Test Sucessfull");
//			//BaseClass.flush();
//			extent.flush();
			
		}
		@Then("^choose the productSamsung and click$")
		public void choose_the_productSamsung_and_click() throws Throwable {
			log.info("selecting given product");
			spg.ClickSamsung();
			spg.clickBack();
//			loggerHtml.log(Status.PASS, "Test Sucessfull");
//			extent.flush();
		}
		
		@Then("^choose the productWatch and click$")
		public void choose_the_productWatch_and_click() throws Throwable {
			log.info("selecting given product");
			spg.ClickWatch();
			spg.clickBack();
//			loggerHtml.log(Status.PASS, "Test Sucessfull");
//			extent.flush();
		}
		
		
		
		@When("^change the selection type as \"([^\"]*)\"$")
		public void change_the_selection_type_as(String type) throws Throwable {
			log.info("choosing selection type");
			spg.selectType(type);
				
			}
	
	
	}
