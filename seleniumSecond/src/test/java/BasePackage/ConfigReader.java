package BasePackage;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public Properties prop;
	
	public ConfigReader()
	{
		try {
		FileInputStream fis = new FileInputStream("src//test//resources//config//objects.properties");
		prop = new Properties();
		prop.load(fis);
		fis.close();
	}
		catch(Exception e)
		{
			System.out.println("Not Able to Load"+e.getMessage());
		}
		
	}
	
	public String getDataConfig(String KeyToSearch)
	{
		return prop.getProperty(KeyToSearch);
	}
	
	public String getBrowser()
	{
		return prop.getProperty("browser");
	}
	
	public String getStagUrl()
	{
		return prop.getProperty("url");
	}
	
	public String getExcelPath()
	{
		return prop.getProperty("excelpath");
	}
	
	

}
