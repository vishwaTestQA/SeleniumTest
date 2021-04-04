package sample;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.classfile.Opcode.Set;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleRun {
	
	WebDriver driver;
	

@Given("^when launch appl$")
public void when_launch_appl() throws Throwable {
  
	System.setProperty("webdriver.chrome.driver","src//test//resources//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.bigw.com.au/");

}

@When("^get windows id$")
public void get_windows_id() throws Throwable {
	
	String pid = driver.getWindowHandle();
	System.out.println(pid);
	Set<String> childId = driver.getWindowHandles();
	for(String ss : childId)
	{
		String child = ss;
		System.out.println(child);
	}
	
  
}

@Then("^close$")
public void close() throws Throwable {
   driver.quit();
    
}

}
