package com.runner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import com.Loggerclass.Property_config;
import com.automation.Base_class;
import com.helper.Page_object_manager;
import com.pom.home_page;
import com.pom.login_page;

public class Runner_class extends Base_class {
	public static WebDriver driver =browser_Config("chrome");
	public static Page_object_manager pom= new Page_object_manager(driver);
	public static Logger log = Logger.getLogger(Runner_class.class);
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		getUrl("http://automationpractice.com/index.php?");
		log.info("url launched");
		Wait_Time(3, TimeUnit.SECONDS);
		
		clickOnElement(pom.get_instance_hp().getLg());
		inputValue(pom.get_instance_lp().getEm(),particular_Cell_Data("C:\\Users\\sathisea\\eclipse-workspace\\Maven\\Test case\\Test Case- Automation Practice.xlsx",2,5));
		clickOnElement(pom.get_instance_lp().getSc());
		Wait_Time(3, TimeUnit.SECONDS);
		clickOnElement(pom.get_instance_lp().getTt());
	    
		inputValue(pom.get_instance_lp().getFn(),particular_Cell_Data("C:\\Users\\sathisea\\eclipse-workspace\\Maven\\Test case\\Test Case- Automation Practice.xlsx",5,5));
		inputValue(pom.get_instance_lp().getLn(),particular_Cell_Data("C:\\Users\\sathisea\\eclipse-workspace\\Maven\\Test case\\Test Case- Automation Practice.xlsx",6,5));
		inputValue(pom.get_instance_lp().getPwd(),particular_Cell_Data("C:\\Users\\sathisea\\eclipse-workspace\\Maven\\Test case\\Test Case- Automation Practice.xlsx",7,5));
		Dropdown("Days",pom.get_instance_lp().getDy(), "18");
		Dropdown("Months",pom.get_instance_lp().getMt(), "8");
		Dropdown("Year",pom.get_instance_lp().getYs(), "1996");
		inputValue(pom.get_instance_lp().getAd(), "No.26 Cuddalore");
		inputValue(pom.get_instance_lp().getCit(), "Ohio");
		inputValue(pom.get_instance_lp().getCt(), "Ohio");
		inputValue(pom.get_instance_lp().getPt(), "00000");
		inputValue(pom.get_instance_lp().getPm(), "1234123186");
		inputValue(pom.get_instance_lp().getAl(), "sathish");
		clickOnElement(pom.get_instance_lp().getAl());
		clickOnElement(pom.get_instance_lp().getHme());
		
	
		
	
		
		
		

		//WebElement homeButton = driver.findElement(By.className("//a[@class='home']"));
		//homeButton.click();
		
	}

	
	
}
