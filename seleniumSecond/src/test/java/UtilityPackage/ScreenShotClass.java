package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
//import java.util.Base64;
import java.util.Base64;
import java.util.Date;

//import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.google.common.io.Files;

import BasePackage.BaseClass;
import io.cucumber.java.Scenario;


public class ScreenShotClass extends BaseClass {
	
	
	public static void captureScreenshotEmbed(Scenario scenario)
	{
	//TakesScreenshot scnShot = (TakesScreenshot)driver;
	 byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);  
	 scenario.attach(screenshot, "image/png", scenario.getName());
	           
    }
	
	public static void captureScreenshotFile(Scenario scenario) throws Exception
	{
	 String df = new SimpleDateFormat("yyyy/MM/dd/hh:ss").format(new Date());
	 String name = scenario.getName();
	//TakesScreenshot scnShot = (TakesScreenshot)driver;
	 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String destPath = "C:/Users/vishwa/eclipse-workspace/seleniumSecond/target/Cucumber-html-reports/spark/"+name+df+".png";
	 File dest = new File(destPath);
	 FileUtils.copyFile(screenshot, dest);
	 
}
	
	
	public static String captureScreenshot64File(Scenario scenario) throws IOException
	{
	  
		String df = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
	  String screenshotName = scenario.getName();
	   
	  //TakesScreenshot scnShot = (TakesScreenshot)driver;
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String filepath = System.getProperty("user.dir")+"/screenshot/"+screenshotName+"/.png";
	  File dest = new File(filepath);
	  FileUtils.copyFile(src, dest);
	  byte[] imagebytes = IOUtils.toByteArray(new FileInputStream(filepath));
	  return Base64.getEncoder().encodeToString(imagebytes);
	  
	 	           
}
	
//	public static String captureScreenshot64ForClass(Scenario scenario)
//	{
//	  return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);	           
//    
//	}
	
	
	
//	public static void captureScreenshot2(Scenario scenario) throws Exception
//	{
//
//	//TakesScreenshot scnShot = (TakesScreenshot)driver;
//		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 // scenario.attach(screenshot,"image/jpg","screenshot");
//		 String encodedBased64 = null;
//		 FileInputStream fis = null;
//		    fis = new FileInputStream(srcFile);
//		    byte[] fileContent = new byte[(int)srcFile.length()];
//		    fis.read(fileContent);
//		    encodedBased64 = new String(Base64.encodedBased64(fileContent));
//		 

	
	public static void captureScreenshot3(Scenario scenario) throws Exception
	{
		try {
	String df = new SimpleDateFormat("yyyy/MM/dd/hh:ss").format(new Date());
	  String screenshotName = scenario.getName();
	//TakesScreenshot scnShot = (TakesScreenshot)driver;
	  File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destScreenShot = new File("C:/Users/vishwa/eclipse-workspace/seleniumSecond/target/Cucumber-html-report/"+".png");
	  Files.copy(srcScreenshot,destScreenShot);
	  MediaEntityBuilder.createScreenCaptureFromPath(destScreenShot.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	  
       }
//	public static void captureScreenshot4(Scenario scenario) throws Exception
//	{
//
//	    
//			ArrayByte screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			scenario.attach(screenshot, "image/png","screenshot");
//		
//	}
	
//      public static String takeScreenShot(String screenShotName) throws IOException {
//        
//        //create a string variable which will be unique always
//        String df = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
//        
//        //create object variable of TakeScreenshot class  
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        
//        //create File object variable which holds the screen shot reference 
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        
//        //store the screen shot path in path variable. Here we are storing the screenshots under screenshots folder 
//        String path = System.getProperty("user.dir") + "/test-output/screenshots/" + screenShotName + df + ".png";
//        
//        //create another File object variable which points(refer) to the above stored path variable
//        File destination = new File(path);
//        
//        //use FileUtils class method to save the screen shot at desired path
//        FileUtils.copyFile(source, destination);
//        
//        //return the path where the screen shot is saved 
//        return path;
//        
    
	
}