package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



class PageObjects
{
	
	private WebDriver driver;
	public PageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		
	}
	@FindAll(
			{
	@FindBy(how=How.XPATH,using="//div[@class='Icon cross variant-dark size-normal']"),
	@FindBy(how=How.XPATH,using="//button[@id='signUpPopupCloseButton']")
			})
	@CacheLookup
	WebElement popups;
	
	public void simple()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		boolean bool = popups.isDisplayed();
		
		System.out.println(bool);
	}

}
public class simpleDemo {
	
	static WebDriver driver;
	
	
	
	
		
		public static void main(String args[]) throws InterruptedException
		{
			
			
		System.setProperty("webdriver.chrome.driver","src//test//resources//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.bigw.com.au/");
		
//		boolean bool = driver.findElement(By.xpath("//img[@title='Big W']")).isDisplayed();
//		boolean bool1 = driver.findElement(By.xpath("//img[@title='Big W']")).isEnabled();
//		WebDriverWait wait = new WebDriverWait(driver,30);
		
         PageObjects pg = new PageObjects(driver);
         
     	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         pg.simple();
         driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		
//		try {
//			//driver.switchTo().alert().dismiss();
//			
//			driver.findElement(By.xpath("//button[@id='signUpPopupCloseButton']")).click();
//			try
//			{
//				driver.findElement(By.xpath("//div[@class='Icon cross variant-dark size-normal']")).click();
//			}
//		
//		catch (NoAlertPresentException e)
//		{
//			System.out.println("no alert found");
//			//Thread.sleep(30);
//		}
//		}
//		catch(NoAlertPresentException ne)
//		{
//			System.out.println("no alert found");
//		}
//		System.out.println(bool);
//		System.out.println(bool1);
		
		
		driver.close();

}
}
