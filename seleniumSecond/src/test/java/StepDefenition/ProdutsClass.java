package StepDefenition;

import org.openqa.selenium.WebDriver;

import BasePackage.BaseClass;
import PageObjects.ProductsPage;
import UtilityPackage.SimpleUtils;
//import PageObjects.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProdutsClass extends BaseClass {
	
	//WebDriver driver;
	
	
	@Given("^when enter product2 as (.*) in search") 
	public void when_enter_product2_as_products_in_search(String prod) throws Throwable {
		
	    log.info("searching prod");
	    spg.searchprod(prod);

}
	@Then("^choose the product and click")
	public void choose_the_product_and_click()  throws Throwable{
		log.info("choosing prod");
		prodpg.clickProducts();
	}
	
	@Then("verify product with title")
	public void verify_product_with_title()  throws Throwable{
		
		prodpg.verify();
	}

	@Then("navigate back to home")
	public void navigate_back_to_home()  throws Throwable {
		 SimpleUtils.goBack();
	}

}
