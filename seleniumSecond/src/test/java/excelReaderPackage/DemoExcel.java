package excelReaderPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcel {
		
		
		    public void readExcel(String filePath,String sheetName) throws IOException
		    {

		    //Create an object of File class to open xlsx file

		    File file =    new File(filePath);

		    //Create an object of FileInputStream class to read excel file

		    FileInputStream inputStream = new FileInputStream(file);

		    Workbook wbk = null;

		    //Find the file extension by splitting file name in substring  and getting only extension name

		    String fileExtensionName = filePath.substring(filePath.indexOf("."));

		    //Check condition if the file is xlsx file

		    if(fileExtensionName.equals(".xlsx")){

		    //If it is xlsx file then create object of XSSFWorkbook class

		    wbk = new XSSFWorkbook(inputStream);

		    }

		    //Check condition if the file is xls file

		    else if(fileExtensionName.equals(".xls")){

		        //If it is xls file then create object of HSSFWorkbook class

		        wbk = new HSSFWorkbook(inputStream);

		    }

		    //Read sheet inside the workbook by its name

		    Sheet sheet = wbk.getSheet(sheetName);

		    //Find number of rows in excel file

		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		    //Create a loop over all the rows of excel file to read it
		    
		    
		    
		    List<List> outerList = new LinkedList();

		    for (int i = 1; i < rowCount+1; i++)
		    {

		        List innerList = new LinkedList();
		        Row row = sheet.getRow(i);

		        //Create a loop to print cell values in a row

		            for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print Excel data in console

		            	innerList.add(row.getCell(j).getStringCellValue());

		        }
		            
		       outerList.add(innerList);
		            
		    } 
		    
		    System.out.println(outerList.get(0).get(0));
		    System.out.println(outerList.get(0).get(1));

		  for(List e : outerList)
		  {
			 System.out.println(e.get(0));
			 System.out.println(e.get(1));
		  }
		  System.out.println(fileExtensionName);
		  System.out.println(filePath);
		    } 
		    
//		    "Login.xlsx",

		    //Main function is calling readExcel function to read data from excel file

		    public static void main(String...strings) throws IOException{

		    //Create an object of ReadGuru99ExcelFile class

		    	DemoExcel excelReader = new DemoExcel();

		    //Prepare the path of excel file

		        String filePath = System.getProperty("user.dir")+"/src/test/resources/Excel/Login.xlsx";

		    //Call read file method of the class to read data

		        excelReader.readExcel(filePath,"LoginSheet");

		    }

		}
	
