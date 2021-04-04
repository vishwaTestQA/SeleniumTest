package StepDefenition;

import java.util.List;

import BasePackage.BaseClass;
import UtilityPackage.SimpleUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationClass extends BaseClass {
	
	@Given("I am on the new user registration page")
	public void i_am_on_the_new_user_registration_page() throws Throwable {
		
		regPg.clickLogin();
	
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("i enter email and password")
	public void i_enter_email_and_password(DataTable login) throws InterruptedException {
		
		regPg.fillLogin(login);
		
	}
	

	@When("I enter invalid data on the page") 
	public void i_enter_invalid_data_on_the_page(DataTable dataTable) {
		
			       
       regPg.fillReg(dataTable);
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	}

	@Then("the user registration should be unsuccessful")
	public void the_user_registration_should_be_unsuccessful() {
		
		System.out.println("Unsucessfull");
	}

}
