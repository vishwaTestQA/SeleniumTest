package StepDefenition;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import BasePackage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Demo extends BaseClass{
	
	@Rule
	ErrorCollector ec = new ErrorCollector();

	@Given("enter application title to be {string}")
	public void enter_application_title_to_be(String expected) throws Throwable {
		
		loggerHtml.log(Status.INFO, "Checking the title");
		
		
		String title = driver.getTitle();
		//driver.findElement(By.xpath("//img[@title='Big W']")).getText();
		
		try {
		Assert.assertEquals(expected,title);
		}
		catch(Exception e)
		{
			ec.addError(e);
		}
		
	   	}



}
