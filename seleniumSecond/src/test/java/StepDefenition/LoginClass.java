package StepDefenition;

import java.io.IOException;
import java.util.List;

import BasePackage.BaseClass;
import excelReaderPackage.ExcelReaderClass2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass extends BaseClass 
{
	

@Given("user on the login page")
public void user_on_the_login_page() throws Throwable
{
	logPg.clickLogin();
	
}

@When("^user enter username and password with excel data at \"([^\"]*)\" sheet at (.*) and rownum (.*)")
public void user_enter_username_and_password_with_excel_data_sheet_at_LoginSheet_and_rownum(String excelPath, String sheetName,int rownum)  throws IOException, InterruptedException 
{
	
	log.info("enter username and pasword");
	
	ExcelReaderClass2 reader = new ExcelReaderClass2();
	//String excelPath =  ;
	
    List<List> readexcel = reader.readExcel(excelPath,sheetName);
    
    String username = (String)readexcel.get(rownum).get(0);
    String password = (String)readexcel.get(rownum).get(1);

     logPg.fillLogin(username,password);
     
    // loggerHtml.info("enter username and pasword");
    
}

@When("Click submit button")
public void click_submit_button() 
{
	
	  logPg.clickSubmit();
	  log.info("login sucessful");
	 // loggerHtml.pass("login sucessful");
}

@Then("verify the title")
public void verify_the_title() 
{
	logPg.verifyTitle();
	log.info("title verified sucessfully");
	//loggerHtml.pass("title verified sucessfully");
}

}
