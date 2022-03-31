package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	
	public static String value;
	public static WebDriver driver;
	
	public static WebDriver browser_Config(String type)
	{
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public static String	particular_Cell_Data(String path ,int rowIndex, int cellIndex ) throws IOException
	{

		File f = new File (path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {

			value = c.getStringCellValue();
			

		}
		else if(ct.equals(CellType.NUMERIC))
		{
			double CellValue = c.getNumericCellValue();
			int val = (int) CellValue;  //narrow casting
			value = String.valueOf(val);
			
			


		}

		return value;
	}
	public static void getUrl(String string) {
		
		driver.get(string);
		
	}
	
	public static void clickOnElement(WebElement element )
	{
		element.click();
	}
	
	public static void inputValue(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	
	public static void Dropdown(String type, WebElement element, String Value) {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("Days")) {
			s.selectByValue(Value);
		}
		else if(type.equalsIgnoreCase("Months")) {
			s.selectByValue(Value);
			
		}
		else if(type.equalsIgnoreCase("Year")) {
			s.selectByValue(Value);
		}
		else if(type.equalsIgnoreCase("state")) {
			s.selectByValue(Value);
		}
		}
public static void Screenshot(String path) throws IOException {
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File scr = sc.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		FileUtils.copyFile(scr, dst);
		
	}
	public static void ScrollupandDown(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}

	public static void Wait_Time(int unit, TimeUnit value) {
		driver.manage().timeouts().implicitlyWait(unit, value);
	}
	
	public static void Switch2DefaultContent() {
		driver.switchTo().defaultContent();
	}
	public static void Browser_Close() {
		driver.close();
	}
    public static void Switch2Frame(WebElement element) {
    	driver.switchTo().frame(element);
    	
    }
	
	

}
